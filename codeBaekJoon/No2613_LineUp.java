/** 2020. 4. 24. 오후 5:53:21
 * @author ventulus95
 */
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No2613_LineUp {
	static int dp[];
		
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		dp = new int [n+1];
		int arr[] = new int [n];
		for(int i=0; i<n; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		int max = 0;
		dp[0] = 1;
		for(int i =1; i<n; i++){
			dp[i] = 1;
			for(int j=0; j<i; j++){
				if(arr[i]> arr[j] && dp[j] +1 > dp[i]){
					dp[i] = dp[j]+1;
				}
			}
			if(max < dp[i]){
				max = dp[i];
			}
		}
		System.out.print(n-max);
	}

}
