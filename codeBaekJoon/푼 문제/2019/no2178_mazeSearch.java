package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class no2178_mazeSearch {
	static int n, m;
	static int map[][];
	static boolean visited[][];
	static int min = Integer.MAX_VALUE;
	static int count = 0;
	static int dx[] = {-1, 0, 1, 0};
	static int dy[] = {0, 1, 0 , -1};
	
	
	/*static void dfs(int x, int y){
		visited[x][y] = false;
		count++;
		for(int i=0; i<4; i++){
			if(map[x+dx[i]][y+dy[i]]==1&&visited[x+dx[i]][y+dy[i]]==true){
				dfs(x+dx[i],y+dy[i]);
			}
		}
//		System.out.println("this dfs x: "+x+" y: "+y);
		if(x==n&&y==m){
			if(min>count){
				min = count;
			}
		}
		visited[x][y] = true;
		count--;
	}*/
	
	static void bfs(int x, int y){
			Queue<maze> q = new LinkedList<maze>();
			q.offer(new maze(x,y,1));
			visited[x][y] = false;
			//방문한 위치는 알아야하니까, 그것을 체크하기 위해서 visit가 필요. 
			while(!q.isEmpty()){
				maze temp = q.poll();
//				System.out.println("maze temp x: "+temp.x+" y: "+temp.y);
				//첫번째 방문한 위치는 빼주기로 한다.
				if(temp.x==n&&temp.y==m){
					count = temp.depth;
					break;
				}
				
				for(int i=0; i<4; i++){
					if(map[temp.x+dx[i]][temp.y+dy[i]]==1&&visited[temp.x+dx[i]][temp.y+dy[i]]==true){
						q.offer(new maze(temp.x+dx[i], temp.y+dy[i],temp.depth+1));
						visited[temp.x+dx[i]][temp.y+dy[i]]=false; //true라면 방문을 한거임. ㅇㅇ 
					}
				}
				
				
			}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s, " ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		map = new int[n+2][m+2];
		visited = new boolean[n+2][m+2];
		for(int i=0; i<n+2; i++){
			Arrays.fill(map[i], 0);
			Arrays.fill(visited[i], false);
		}
		for(int i=1; i<n+1; i++){
			String t = br.readLine();
			for(int j =1; j<m+1; j++ ){
				map[i][j] = t.charAt(j-1)-'0';
				if(map[i][j]==1){
					visited[i][j] = true;
				}
			}
		}
		//dfs(1,1);
		bfs(1,1);
		System.out.println(count);
	}
}

class maze{
	int x;
	int y;
	int depth;
	public maze(int x, int y, int depth){
		this.x = x;
		this.y = y;
		this.depth=depth;
	}
	
}
