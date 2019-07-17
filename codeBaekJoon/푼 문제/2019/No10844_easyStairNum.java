/* 2019.04.19.DP 
*/
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No10844_easyStairNum {
	static long cache[][] = new long[101][10];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i=1; i<10; i++){
			cache[1][i] = 1;
		}
		for(int i=2; i<n+1; i++){
			for(int j=0; j<10; j++){
				if(j==0){
					cache[i][j] =+cache[i-1][j+1]%1000000000;
				}
				else if(j==9){
					cache[i][j] = cache[i-1][j-1]%1000000000;
				}
				else{
					cache[i][j] = (cache[i-1][j-1] +cache[i-1][j+1])%1000000000;
				}
			}
		}
		long sum = 0;
		for(int i=0; i<10; i++){
			sum+=cache[n][i]%1000000000;
		}
		System.out.println(sum);

	}
}
