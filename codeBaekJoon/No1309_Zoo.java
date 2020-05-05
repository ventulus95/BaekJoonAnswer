/** 2020. 4. 30. 오후 11:47:12
 * @author ventulus95
 */
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No1309_Zoo {

	static int dp[][];

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		dp = new int[n+1][3];
		Arrays.fill(dp[1], 1);
		for(int i=2; i<=n; i++){
			dp[i][0] = dp[i-1][0] + dp[i-1][1] +dp[i-1][2]; 
			dp[i][1] = dp[i-1][0] + dp[i-1][2];
			dp[i][2] = dp[i-1][0] + dp[i-1][1];
			dp[i][0] %= 9901;
			dp[i][1] %= 9901;
			dp[i][2] %= 9901;
		}
		int sum = 0;
		for(int i =0; i<3; i++){
			sum+=dp[n][i];
		}
		System.out.println(sum%9901);
	}

}
