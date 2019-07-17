/* 2019.02.14 BFS 해피발란타인 데이!
 */
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
class locate{
	int x;
	int y;
	public locate(int x, int y){
		this.x = x;
		this.y= y;
	}
}


public class No3055_Exit {
	static int c,r,rx,ry;
	static int map[][];
	static int visit[][];
	static int dx[] ={0,1,0,-1};
	static int dy[] = {1,0,-1,0};

	static void bfs(){
		Queue<locate> q = new LinkedList<locate>();
		for(int i =1; i<r+1; i++){
			for(int j=1; j<c+1; j++ ){
				if(map[i][j]==-1){
					visit[i][j] = -1;
					q.offer(new locate(i, j));
				}
			}
		}
		for(int i =1; i<r+1; i++){
			for(int j=1; j<c+1; j++ ){
				if(map[i][j]==1){
					visit[i][j] =1;
					q.offer(new locate(i, j));
				}
			}
		}
		while(!q.isEmpty()){
			locate temp = q.poll();
			//			System.out.println(temp.x+" "+temp.y+": "+map[temp.x][temp.y]);
			if(map[temp.x][temp.y] ==1){
				map[temp.x][temp.y] =1;
				for(int i=0; i<4; i++ ){
					if(map[temp.x+dx[i]][temp.y+dy[i]] ==0||map[temp.x+dx[i]][temp.y+dy[i]] ==2 && visit[temp.x+dx[i]][temp.y+dy[i]]==0){
						q.offer(new locate(temp.x+dx[i], temp.y+dy[i]));
						map[temp.x+dx[i]] [temp.y+dy[i]] = 1;
						visit[temp.x+dx[i]] [temp.y+dy[i]] = visit[temp.x][temp.y] +1;
					}
				}
			}
			if(map[temp.x][temp.y] ==-1){
				map[temp.x][temp.y] =-1;
				visit[temp.x][temp.y] = -1;
				for(int i=0; i<4; i++ ){
					if(map[temp.x+dx[i]][temp.y+dy[i]] ==0 && visit[temp.x+dx[i]][temp.y+dy[i]]==0){
						q.offer(new locate(temp.x+dx[i], temp.y+dy[i]));
						map[temp.x+dx[i]] [temp.y+dy[i]] = -1;
						visit[temp.x+dx[i]] [temp.y+dy[i]] = -1;
					}
				}
			}



		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tc = br.readLine();
		StringTokenizer st = new StringTokenizer (tc," ");
		r = Integer.parseInt(st.nextToken()); 
		c = Integer.parseInt(st.nextToken());
		map = new int [r+2][c+2];
		visit = new int[r+2][c+2];
		for(int i =0; i<r+2; i++){
			Arrays.fill(map[i], -2);
			Arrays.fill(visit[i], -2);
		}
		for(int i=1; i<r+1; i++){
			String ml = br.readLine();
			for(int j=0; j<ml.length(); j++){
				char check =ml.charAt(j);
				if(check=='D'){
					map[i][j+1] = 2;
					visit[i][j+1] =0;
					rx = i;
					ry = j+1;
				}
				else if(check=='*'){
					map[i][j+1] = -1;
					visit[i][j+1] =-1;
				}
				else if(check=='S'){
					map[i][j+1] = 1;
					visit[i][j+1] =0;
				}
				else if(check=='X'){
					map[i][j+1] = -2;
					visit[i][j+1] =-1;
				}
				else{
					map[i][j+1] = 0;
					visit[i][j+1] =0;
				}
			}
		}
		bfs();
		/*	for(int i =1; i<r+1; i++){
			for(int j=1; j<c+1; j++ ){
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
		 */
		int max = -1;
		boolean not = true;
		for(int i =1; i<r+1; i++){
			for(int j=1; j<c+1; j++ ){
				if(map[i][j]==2){
					not = false;
				}
				max = Math.max(max, visit[i][j]);
			}
		}
		if(not==false){
			System.out.println("KAKTUS");
		}
		else{
			System.out.println(visit[rx][ry]-1);
		}
	}
}
