/** 2020. 2. 28. 오후 10:23:59
 * @author ventulus95
 */
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No16194_CardBuy2 {
	static int cnt[];
	static int arr[];
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String tc = br.readLine();
		arr = new int[N+1];
		cnt = new int[N+1];
		StringTokenizer st = new StringTokenizer(tc, " ");
		for(int i =1; i<=N; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.fill(cnt, Integer.MAX_VALUE);
		cnt[0] = 0;
		cnt[1] = arr[1];
		for(int i=2; i<= N; i++){
			for(int j=1; j<=i; j++){
				int temp = i-j;
				if(temp!=0){
					int div = i/temp;
					int mod = i%temp;
					cnt[i] = Math.min(cnt[i], cnt[temp]*div+arr[mod]);
				}
				else{
					cnt[i] = Math.min(cnt[i], arr[i]);
				}
			}
		}
		System.out.println(cnt[N]);
	}

	
}
