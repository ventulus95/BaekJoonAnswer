/* 2019.02.04 dp 다시 풀기. 
*/
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no2156_wineTasting {
	static int n, wine[],cache[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		wine = new int[n];
		cache = new int[n];
		for(int i=0; i<n; i++){
			wine[i]= Integer.parseInt(br.readLine());
		}
		if(n<4){
			if(n==3){
				cache[0] = wine[0];
				cache[1] = wine[0]+wine[1];
				cache[2] = Math.max(cache[1], Math.max(cache[0]+wine[2], wine[1]+wine[2]));
			}
			else if(n==2){
				cache[0] = wine[0];
				cache[1] = wine[0]+wine[1];
			}
			else{
				cache[0] = wine[0];
			}
		}
		else{
		cache[0] = wine[0];
		cache[1] = wine[0]+wine[1];
		cache[2] = Math.max(cache[1], Math.max(cache[0]+wine[2], wine[1]+wine[2]));
			for(int i = 3; i<n; i++){
				cache[i] = Math.max(cache[i-1], Math.max(cache[i-2]+wine[i], cache[i-3]+wine[i-1]+wine[i]));
			}
		}
		System.out.println(cache[n-1]);
	}
}
