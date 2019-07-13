/* 2019.07.13 dp
 * 이문제의 핵심은 자기 자신과 cache이전 값+자기자신이 큰지를 파악하는게 중요.
 * 결국 자기자신이 크면 연속된 수열의 종료가 되어서 새로운연속합 진행.
 *	cahce이전 값+자기자신이 큰 경우 여전히 연속된 합이 크므로 계속 연속합 진행.
*/
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No1912_sequenceSum {
	static int n;
	static int cache[] = new int[1000005];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(br.readLine());
		int num[] = new int[n+1];
		Arrays.fill(cache, -1);
		String tc = br.readLine();
		StringTokenizer st = new StringTokenizer(tc," ");
		for(int i=1; i<n+1; i++){
			num[i] = Integer.parseInt(st.nextToken());
			cache[i] = num[i];
		}
		for(int i=2; i<n+1; i++){
			cache[i] = Math.max(num[i], num[i]+cache[i-1]);
		}
		int max = Integer.MIN_VALUE;
		for(int i=1; i<n+1; i++){
			max = Math.max(cache[i], max);
		}
		wr.write(String.valueOf(max));
		wr.flush();
		wr.close();
	}

}
