/* 2019.02.06 dp
 * */
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no9465_sticker {
	static int cache[][];
	static int p[][];
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0){
			int max = Integer.MIN_VALUE;
			int n = Integer.parseInt(br.readLine());
			cache = new int [2][n];
			p = new int [2][n];
			String n0 = br.readLine();
			StringTokenizer st = new StringTokenizer (n0, " ");
			String n1 = br.readLine();
			StringTokenizer st1 = new StringTokenizer (n1, " ");
			for(int i =0; i<n; i++){
				p[0][i] = Integer.parseInt(st.nextToken());
				p[1][i] = Integer.parseInt(st1.nextToken());
			}
			cache[0][0] = p[0][0];
			cache[1][0] = p[1][0];
			cache[0][1] = cache[1][0] + p[0][1];
			cache[1][1] = cache[0][0] + p[1][1];
			for(int i=3; i<=n; i++){
				cache[0][i-1] = Math.max(cache[1][i-2] + p[0][i-1], Math.max(cache[0][i-3] + p[0][i-1], cache[1][i-3] + p[0][i-1]));
				cache[1][i-1] = Math.max(cache[0][i-2] + p[1][i-1], Math.max(cache[0][i-3] + p[1][i-1], cache[1][i-3] + p[1][i-1]));
				max = Math.max(cache[0][i-1], max);
				max = Math.max(cache[1][i-1], max);
			}
			System.out.println(max);
		}
	}
}
