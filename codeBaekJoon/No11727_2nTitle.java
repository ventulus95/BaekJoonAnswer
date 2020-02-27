/** 2020. 2. 22. 오후 8:03:38
 * @author ventulus95
 */
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No11727_2nTitle {
	
	static int cache[] = new int [1001]; 

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		cache[1] = 1;
		cache[2] = 3;
		for(int i= 3; i<=1000; i++){
			cache[i] = (cache[i-1] + cache[i-2]*2 ) % 10007;
		}
		System.out.print(cache[n]);
	}

}
