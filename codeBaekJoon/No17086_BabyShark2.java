package codeBaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class No17086_BabyShark2 {
	static int n, m, max;
	static int map[][], visit[][], tvisited[][];
	static int dx[] = {0,1,1,1,0,-1,-1,-1};
	static int dy[] = {1,1,0,-1,-1,-1,0,1};

	static void bfs(int a, int b){
		Queue<Shark> q = new LinkedList<Shark>();
		if(map[a][b]==0){
			tvisited[a][b] = 1;
			q.offer(new Shark(a, b));
		}
		boolean check = true;
		while(!q.isEmpty()&&check){
			Shark temp = q.poll();
//			System.out.println(temp.x+" , "+temp.y+" : "+map[temp.x][temp.y]+" "+tvisited[temp.x][temp.y]);
			for(int i=0; i<8; i++ ){
				if(map[temp.x+dx[i]][temp.y+dy[i]]==0 && tvisited[temp.x+dx[i]][temp.y+dy[i]]==0){
					q.offer(new Shark(temp.x+dx[i], temp.y+dy[i]));
					tvisited[temp.x+dx[i]] [temp.y+dy[i]] = tvisited[temp.x][temp.y] +1;
				}
				if(map[temp.x+dx[i]][temp.y+dy[i]]==1){
					tvisited[temp.x+dx[i]] [temp.y+dy[i]] = tvisited[temp.x][temp.y] +1;
					max=Math.max(max, tvisited[temp.x+dx[i]] [temp.y+dy[i]]);
					check=false;
					break;
					
				}
				
			}
		}
	}


	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedReader br = new BufferedReader(new FileReader("/Users/LeeChnagSup/Desktop/input.txt"));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String init = br.readLine();
		StringTokenizer st = new StringTokenizer (init, " ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		map = new int [n+2][m+2];
		visit = new int [n+2][m+2];
		tvisited = new int [n+2][m+2];
		for(int i=0; i<n+2; i++){
			Arrays.fill(map[i], -1);
			Arrays.fill(visit[i], -1);
			Arrays.fill(tvisited[i], -1);
		}
		for(int i =1; i<n+1; i++){
			String line = br.readLine();
			st = new StringTokenizer(line," ");
			for(int j=1; j<m+1; j++){
				map[i][j] = Integer.parseInt(st.nextToken());
				if(map[i][j]!=1){
					visit[i][j] =0;
					tvisited[i][j] = 0;
				}
			}
		}
		for(int i=1; i<n+1; i++){
			for(int j=1; j<m+1; j++){
				bfs(i,j);
				for(int t=1; t<n+1; t++){
					for(int v=1; v<m+1; v++){
						tvisited[t][v] = visit[t][v];
					}
				}
//				System.out.println(max);
			}
		}
		bw.write(String.valueOf(max-1));
		bw.flush();
		bw.close();
	}

}

class Shark{
	int x,y; 
	public Shark(int x, int y){
		this.x = x;
		this.y = y;
	}
}
