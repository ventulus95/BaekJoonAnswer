// 2019.01.26 (토) 

package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no1012_growbaechuu {
	static int map[][];
	static boolean visited[][];
	static int n, m;
	static int count = 1;
	static int dx[] = {0,1,0,-1};
	static int dy[] = {1,0,-1,0};
	
	static void dfs(int x, int y){
		
		visited[x][y] = false;
		map[x][y] = count;
		
		for(int i=0; i<4; i++){
			if(map[x+dx[i]][y+dy[i]]==1 && visited[x+dx[i]][y+dy[i]]==true){
				dfs(x+dx[i],y+dy[i]);
			}
		}
		
		
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0){
			String a = br.readLine();
			StringTokenizer st = new StringTokenizer(a, " ");
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			count =1;
			map = new int[n+2][m+2];
			visited = new boolean [n+2][m+2];
			for(int i=0; i<n+2; i++){
				Arrays.fill(map[i], 0);
				Arrays.fill(visited[i], false);
			}
			for(int i=0; i<k; i++){
				String tc = br.readLine();
				StringTokenizer st1 = new StringTokenizer(tc, " ");
				int y = Integer.parseInt(st1.nextToken());
				int x = Integer.parseInt(st1.nextToken());
				map[x+1][y+1]=1;
				visited[x+1][y+1] = true;
			}
			for(int i =1; i<n+1; i++){
				for(int j=1; j<m+1; j++){
					if(map[i][j]==1&& visited[i][j]==true){
						dfs(i,j);
						count++;
					}
//					System.out.print(map[i][j]+" ");
				}
//				System.out.println();
			}
			System.out.println(count-1);
		}
		
	}
}
