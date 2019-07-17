/* 2019.02.18 dp 퇴사 멘탈 터진날. 한번더 공부해보고 이해안되면 다시 질문.
 * 				확실히 어려움. 밑의 주석은  내가 풀려다가 망한 케이스.
*/
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no14501_leaveCompany {
	static int max =0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int t[] = new int [T+10];
		int p[] = new int [T+10];
		int dp[] = new int [T+10];
		Arrays.fill(dp, 0);
		for(int i=1; i<T+1; i++){
			String a = br.readLine();
			StringTokenizer st = new StringTokenizer(a, " ");
			t[i]=Integer.parseInt(st.nextToken());
			p[i]=Integer.parseInt(st.nextToken());
		}
		for(int i =1; i<=T+1; i++){
			/*int jmax = 0;
			int tt = 0;
			System.out.println(i+" has this routine");
			for(int j=i; j<=T+1; j++){
				if(i+j<T+1){
				jmax = Math.max(jmax, p[j]);
				tt = t[j];
				System.out.println(j+":  "+jmax);
				}
			}
			dp[i]+=jmax;
			if(dp[i+tt]<dp[i]){
				dp[i+tt]+=dp[i];
			}
			System.out.print(dp[i]+" ");
			max = Math.max(max, dp[i]);*/
			
			dp[i] = Math.max(dp[i], max);
			dp[t[i]+i] = Math.max(dp[t[i]+i], p[i]+dp[i]);
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);
		
	}
}
