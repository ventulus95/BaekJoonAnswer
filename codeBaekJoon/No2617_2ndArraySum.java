/** 2020. 5. 5. 오전 3:59:22
 * @author ventulus95
 */
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2617_2ndArraySum {
	
	static int dp[][];

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tc = br.readLine();
		StringTokenizer st = new StringTokenizer(tc, " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int [][] arr = new int[n+1][m+1];
		dp = new int[n+1][m+1];
		for(int i =1; i<=n;i++){
			String t = br.readLine();
			st = new StringTokenizer(t, " ");
			for(int j=1; j<=m; j++){
				arr[i][j] = Integer.parseInt(st.nextToken());
				dp[i][j] = dp[i-1][j]+ dp[i][j-1] + arr[i][j] - dp[i-1][j-1];
			}
		}
		int T = Integer.parseInt(br.readLine());
		for(int i =0; i<T; i++){
			String ans = br.readLine();
			st = new StringTokenizer(ans, " ");
			int sy = Integer.parseInt(st.nextToken());
			int sx  = Integer.parseInt(st.nextToken());
			int gy = Integer.parseInt(st.nextToken());
			int gx  = Integer.parseInt(st.nextToken());
			System.out.println(dp[gy][gx]-dp[gy][sx-1]-dp[sy-1][gx]+dp[sy-1][sx-1]);
		}

	}

}
