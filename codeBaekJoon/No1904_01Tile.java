/** 2020. 2. 24. 오후 11:18:10
 * @author ventulus95
 */
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No1904_01Tile {
	
	static int cache[] = new int [1100000];

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		cache[1] = 1;
		cache[2] = 2;
		for(int i=3; i<1100000; i++){
			cache[i] = (cache[i-1]+cache[i-2])%15746; 
		}
		System.out.println(cache[n]);
	}

}
