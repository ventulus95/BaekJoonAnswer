/** 2020. 3. 9. 오후 3:55:46
 * @author ventulus95
 */
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No12865_NomarlBag {
	
	static int arr[][], dp[];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tc = br.readLine();
		StringTokenizer st = new StringTokenizer(tc, " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		arr = new int[n][2];
		dp = new int[n];
		for(int i =0; i<n; i++){
			String t = br.readLine();
			st = new StringTokenizer(t, " ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		for(int i =0; i<n; i++){
			int loopWeight = k;
			for(int j=i; j<n; j++){
				if( loopWeight-arr[j][0] >=0){
					loopWeight = loopWeight-arr[j][0];
					dp[i] += arr[j][1];
				}
			}
		}
		Arrays.sort(dp);
		System.out.println(dp[n-1]);
	}

}
