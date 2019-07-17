package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no13460_cyrstalBallExit {
	static int map[][];
	static boolean visit[][];
	
	public static void dfs(int i){
		System.out.print(i+" ");
		}
		
		



	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String b = br.readLine();
		StringTokenizer st = new StringTokenizer(b, " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		map = new int [n][m];
		visit = new boolean [n][m];
		for(int i=0; i<n; i++){
			String line = br.readLine();
			for(int j=0; j<m; j++){
				char mc = line.charAt(j);
				if(mc=='#'){
					map[i][j] = -1;
				}
				if(mc=='.'){
					map[i][j] = 0;
				}
				if(mc=='O'){
					map[i][j] = 9;
				}
				if(mc=='R'){
					map[i][j] = 1;
				}
				if(mc=='B'){
					map[i][j] = 2;
				}
			}
		}
		
		dfs(1);
		
//		for(int i=0; i<n; i++){
//			for(int j=0; j<m; j++){
//				System.out.print(map[i][j]+" ");
//			}
//			System.out.println();
//		}
	}
}
