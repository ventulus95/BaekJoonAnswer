/* 2019.02.06 dp top-down 형식으로 다시풀기
 * cache[]를 int로 해서 틀렸고 long으로 해야지 맞음
*/
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class no9461_padovanSequence {
	static int n;
	static long cache[];
	
	static long ps(int x){
		if(cache[x] != -1){
			return cache[x];
		}
		else{
			if(cache[x-1]==-1 && cache[x-5]==-1){
				return cache[x] = ps(x-1)+ps(x-5);
			}
			else if(cache[x-1]==-1){
				return cache[x] = ps(x-1)+cache[x-5];
			}
			else if(cache[x-5]==-1){
				return cache[x] = cache[x-1]+ps(x-5);
			}
			else{
				return cache[x] = cache[x-1]+cache[x-5];
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		cache = new long [105];
		Arrays.fill(cache, -1);
		cache[0] = 0;
		cache[1] = 1;
		cache[2] = 1;
		cache[3] = 1;
		cache[4] = 2;
		cache[5] = 2;
		while(T-->0){
			n = Integer.parseInt(br.readLine());
			if(cache[n]!=-1){
				System.out.println(cache[n]);
			}
			else{
				ps(n);
				System.out.println(cache[n]);
			}
		}
		
	}
}
