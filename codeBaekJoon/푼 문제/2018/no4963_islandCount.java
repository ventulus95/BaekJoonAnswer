package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no4963_islandCount {
	static int map[][];
	static boolean[][] visit;
	static int cnt =1;
	static int sort[] = new int [625];

	public static void dfs(int i, int j){
		map[i][j] = cnt;
		sort[cnt]++;
		visit[i][j] = true;
		if(map[i+1][j] ==1 && visit[i+1][j]==false){
			dfs(i+1,j);
		}
		if(map[i-1][j] ==1 && visit[i-1][j]==false){
			dfs(i-1,j);
		}
		if(map[i][j+1] ==1 && visit[i][j+1]==false){ 
			dfs(i,j+1);
		}
		if(map[i][j-1] ==1 && visit[i][j-1]==false){
			dfs(i,j-1);
		}
		// 상하좌우 
		if(map[i-1][j-1] ==1 && visit[i-1][j-1]==false){
			dfs(i-1,j-1);
		}
		if(map[i+1][j-1] ==1 && visit[i+1][j-1]==false){
			dfs(i+1,j-1);
		}

		if(map[i+1][j+1] ==1 && visit[i+1][j+1]==false){
			dfs(i+1,j+1);
		}
		if(map[i-1][j+1] ==1 && visit[i-1][j+1]==false){
			dfs(i-1,j+1);
		}
		// 대각선도 따져줍시다. 
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		boolean loop = true;
		StringTokenizer st = new StringTokenizer(a, " ");
		int y = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		if(x==0&&y==0){
			loop  =false; 
		}
		while(loop){
			map =new int[x+2][y+2];
			visit= new boolean[x+2][y+2];
			for(int in =0; in<x+2; in++){
				Arrays.fill(map[in], 0);
				Arrays.fill(visit[in], false);
			}
			for(int i =1; i<x+1; i++){
				String  v = br.readLine();
				StringTokenizer st1 = new StringTokenizer(v, " ");
				for(int j=1; j<y+1; j++){
					map[i][j] = Integer.parseInt(st1.nextToken());
				}
			}
			for(int i=1; i<x+1; i++){
				for(int j=1; j<y+1; j++){
					if(map[i][j] ==1 && visit[i][j]==false){
						dfs(i,j);
						cnt++;
					}
				}
			}
			System.out.println(cnt-1);
//			for(int i = 0; i<M+2; i++){
//				for(int j=0; j<N+2; j++){
//					System.out.print(map[i][j]+" ");
//				}
//				System.out.println();
//			}
			a = br.readLine();
			st = new StringTokenizer(a, " ");
			y = Integer.parseInt(st.nextToken());
			x = Integer.parseInt(st.nextToken());
			if(x==0&&y==0){
				loop  =false; 
			}
			cnt=1;
			
		}
	}
}
