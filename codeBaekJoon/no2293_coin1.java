package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no2293_coin1 {
	static int dp[];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String p = br.readLine();
		StringTokenizer st = new StringTokenizer(p, " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int coin[] = new int [n+1];
		for(int i=1; i<=n; i++){
			coin[i] = Integer.parseInt(br.readLine());
		}
		dp = new int[k+1];
		Arrays.sort(coin);
		dp[0] = 1;
		for(int i=1; i<=n; i++){
			for(int j=coin[i]; j<=k; j++){
				dp[j] += dp[j-coin[i]];
			}
		}
		System.out.println(dp[k]);
	}
}
