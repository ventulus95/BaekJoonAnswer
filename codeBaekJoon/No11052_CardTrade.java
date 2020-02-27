/** 2020. 2. 19. 오후 2:19:06
 * @author ventulus95
 */
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No11052_CardTrade {
	
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
		Arrays.fill(cnt, -1);
		cnt[0] = 0;
		cnt[1] = arr[1];
		System.out.println(func(N));
	}

	private static int func(int n) {
		if(n == 0){
			return cnt[0];
		}
		if(n == 1){
			return cnt[1];
		}
		for(int i =0; i<n; i++){
			if(cnt[i] != -1){
				cnt[n] =Math.max(cnt[n], cnt[i]+arr[n-i]);
			}
			else{
				cnt[n] =Math.max(cnt[n], func(i)+arr[n-i]);
			}
		}
		return cnt[n];
	}

}
