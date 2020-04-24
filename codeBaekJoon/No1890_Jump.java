/** 2020. 3. 2. 오후 10:18:15
 * @author ventulus95
 */
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1890_Jump {
	static int map[][];
	static long dp[][];
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st ;
		map = new int [n+1][n+1];
		dp = new long [n+1][n+1];
		for(int i=1; i<=n; i++){
			String tc = br.readLine();
			st = new StringTokenizer(tc, " ");
			for(int j=1; j<=n; j++){							
				map[i][j]  = Integer.parseInt(st.nextToken());
				
			}
		}
		dp[1][1] = 1;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				if(map[i][j]!=0){
					if(dp[i][j]!=0){
						int down = i+map[i][j];
						int right = j+map[i][j];
						if(down<=n){
							dp[down][j] += dp[i][j];
						}
						if(right<=n){
							dp[i][right] += dp[i][j];
						}
					}
				}
			}
		}
		System.out.println(dp[n][n]);
		

	}

}
