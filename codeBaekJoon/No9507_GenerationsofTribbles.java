/** 2020. 2. 25. 오후 7:39:13
 * @author ventulus95
 */
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No9507_GenerationsofTribbles {

	static long cache[] = new long [69]; 
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		cache[0] = 1;
		cache[1] = 1;
		cache[2] = 2;
		cache[3] = 4;
		for(int i=4; i<=67; i++){
			cache[i] = cache[i-1]+cache[i-2]+cache[i-3]+cache[i-4];
		}
		for(int i =0; i<T; i++){
			int n = Integer.parseInt(br.readLine());
			System.out.println(cache[n]);
		}

	}

}
