package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
class knight{
	int x, y;
	public knight(int y, int x){
		this.y = y; 
		this.x = x;
	}
}
public class No7562_KnightMove {


	static int n , x, y , gx, gy;
	static int [][] map;
	static int [][] visited;
	static int dx[] ={1 , 2, 2, 1, -1,-2,-2,-1};
	static int dy[] = {-2, -1 ,1, 2, 2, 1, -1, -2};
	static void bfs(){
		Queue<knight> q = new LinkedList<knight>();
		q.offer(new knight(y+2,x+2));
		while(!q.isEmpty()){
			knight temp = q.poll();
			map[temp.y][temp.x] =1;
			for(int i=0; i<8; i++ ){
				if(map[temp.y+dy[i]][temp.x+dx[i]] ==0 && visited[temp.y+dy[i]][temp.x+dx[i]]==0){
					q.offer(new knight(temp.y+dy[i], temp.x+dx[i]));
					visited[temp.y+dy[i]] [temp.x+dx[i]] = visited[temp.y][temp.x] +1;
				}
			}

		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		while(tc-->0){
			n =  Integer.parseInt(br.readLine());
			map= new int[n+4][n+4];
			visited = new int[n+4][n+4];
			for(int i =0; i<n+4; i++){
				Arrays.fill(visited[i],-1);
				Arrays.fill(map[i], -1);
			}
			String start = br.readLine();
			StringTokenizer st = new StringTokenizer(start, " ");
			y = Integer.parseInt(st.nextToken());
			x = Integer.parseInt(st.nextToken());
			String goal = br.readLine();
			StringTokenizer st1 = new StringTokenizer(goal, " ");
			gy = Integer.parseInt(st1.nextToken());
			gx = Integer.parseInt(st1.nextToken());
			for(int i =2; i<n+2; i++){
				for(int j =2; j<n+2; j++){
					map[i][j] =0; 
					visited[i][j] = 0; 
				}
			}
			bfs();
			/*for(int i =2; i<n+2; i++){
				for(int j =2; j<n+2; j++){
					System.out.print(visited[i][j]+" "); 
				}
				System.out.println();
			}*/
			System.out.println(visited[gy+2][gx+2]);
		}
		
	}
}

