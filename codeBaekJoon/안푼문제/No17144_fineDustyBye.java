package codeBaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class dust{
	int x, y;
	public dust(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class No17144_fineDustyBye {
	public static int r,c,t;
	static int map[][], visited[][];
	static int dx[] ={0,1,0,-1};
	static int dy[] = {1,0,-1,0};

	static void bfs(){
		Queue<dust> q = new LinkedList<dust>();
		for(int i =1; i<r+1; i++){
			for(int j=1; j<c+1; j++ ){
				if(map[i][j]>0){
					q.offer(new dust(i, j));
				}
			}
		} // 일단 미세먼지 다 넣기.
		int time = 0;
		while(!q.isEmpty()|| t==time){
			dust temp = q.poll();
			System.out.println(temp.x+" , "+temp.y+" : "+map[temp.x][temp.y]);
			if(visited[temp.x][temp.y] == time){ // 먼지 퍼지는 상황.
				int count =0; 
				for(int i=0; i<4; i++ ){
					if(map[temp.x+dx[i]][temp.y+dy[i]]>0 && visited[temp.x+dx[i]][temp.y+dy[i]]>=0){
						q.offer(new dust(temp.x+dx[i], temp.y+dy[i]));
						//visited[temp.x+dx[i]] [temp.y+dy[i]]++;
						map[temp.x+dx[i]][temp.y+dy[i]] += map[temp.x][temp.y]/5;
						count++;
					}
				}
				map[temp.x][temp.y] -= ( (map[temp.x][temp.y]/5)*count );
				if(map[temp.x][temp.y]>0){
					q.offer(new dust(temp.x, temp.y));
				}
			}
			else{ //공기청정기 가동상황. //
				System.out.println("else part: "+temp.x+" , "+temp.y+" : "+map[temp.x][temp.y]);
				//상층 바람 아래 방향 
				map[2][1] = map[1][1];
				visited[2][1] = visited[1][1];
				//상층 바람 왼  방향.
				for(int i=1; i<8; i++){
					map[1][i] = map[1][i+1];
					visited[1][i] = visited[1][i+1];
				}
				//상층 바람 위 방향
				for(int i=1; i<3; i++){
					map[i][8] = map[i+1][8];
					visited[i][8] = visited[i+1][8];
				}
				//상층 바람 오른 방향.
				for(int i=8; i>2; i--){
					map[3][i] = map[3][i-1];
					visited[3][i] = visited[3][i-1];
				}
				map[3][2] = 0;
				visited[3][2] = 0;
				
				//하층 위 방향.
				for(int i=5; i<7; i++){
					map[i][1] = map[i+1][1];
					visited[i][1] = visited[i+1][1];
				}
				//하층 왼쪽 바람.
				for(int i=1; i<8; i++){
					map[7][i] = map[7][i+1];
					visited[7][i] = visited[7][i+1];
				}
				//하층. 아래쪽 바람.
				for(int i=7; i>4; i--){
					map[i-1][8] = map[i][8];
					visited[i-1][8] = visited[i][8];
				}
				//하층. 오른쪽 바람.
				for(int i=8; i>4; i--){
					map[4][i-1] = map[4][i];
					visited[4][i-1] = visited[4][i];
				}
				map[4][2] = 0;
				visited[4][2] = 0;
				time++;
//				System.out.println(temp.x+" , "+temp.y+" : "+map[temp.x][temp.y]);
				int count =0; 
				for(int i=0; i<4; i++ ){
					if(map[temp.x+dx[i]][temp.y+dy[i]]>0 && visited[temp.x+dx[i]][temp.y+dy[i]]>=0){
						q.offer(new dust(temp.x+dx[i], temp.y+dy[i]));
						visited[temp.x+dx[i]] [temp.y+dy[i]]++;
						map[temp.x+dx[i]][temp.y+dy[i]] += map[temp.x][temp.y]/5;
						count++;
					}
				}
				map[temp.x][temp.y] -= ( (map[temp.x][temp.y]/5)*count );
				if(map[temp.x][temp.y]>0){
					q.offer(new dust(temp.x, temp.y));
				}
				
			}
		}

	}


	public static void main(String[] args) throws Exception, IOException {
		//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new FileReader("/Users/LeeChnagSup/Desktop/input.txt"));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String rct = br.readLine();
		StringTokenizer st= new StringTokenizer(rct, " ");
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		t = Integer.parseInt(st.nextToken());
		System.out.println(t);
		map = new int [r+2][c+2];
		visited = new int [r+2][c+2];
		for(int i=0; i<r+2; i++){
			Arrays.fill(map[i], -1);
			Arrays.fill(visited[i], -1);
		}
		for(int i=1; i<r+1; i++){
			String s = br.readLine();
			StringTokenizer st1 = new StringTokenizer(s, " ");
			for(int j=1; j<c+1; j++){
				map[i][j] = Integer.parseInt(st1.nextToken());
				if(map[i][j]==-1){
					visited[i][j] = -1; 
				}
				else{
					visited[i][j] = 0; 
				}
			}
		}
		/*for(int i=1; i<r+1; i++){
			for(int j=1; j<c+1; j++){
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}*/
		bfs();
		int sum = 2;
		for(int i=1; i<r+1; i++){
			for(int j=1; j<c+1; j++){
				sum+= map[i][j];
			}
		}
		System.out.println(sum);
		bw.write(String.valueOf(sum));
		bw.flush();

	}

}
