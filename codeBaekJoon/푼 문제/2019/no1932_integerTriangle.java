/* 2019.02.03 bottom up 방식으로 풀고, topdown은 안된다는걸 알아냈음.
*/
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no1932_integerTriangle {
	static int n, max;
	static int tri [][];
	static int cache[][];
	
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		tri = new int[n][n];
		cache = new int [n][n];
		for(int i=0; i<n; i++){
			Arrays.fill(cache[i], -1);
		}
		max = -1;
		for(int i =0; i<n; i++){
			String pc = br.readLine();
			StringTokenizer st = new StringTokenizer(pc, " ");
			for(int j = 0; j<=i; j++){
				tri[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		cache[0][0] = tri[0][0];
		for(int i =0; i<n-1; i++){
			for(int j=0; j<=i; j++){
				if(cache[i+1][j] < cache[i][j]+tri[i+1][j]){
					cache[i+1][j] = cache[i][j]+tri[i+1][j];
				}
				if(cache[i+1][j+1] < cache[i][j]+tri[i+1][j]){
					cache[i+1][j+1] = cache[i][j]+tri[i+1][j+1];
				}
			}
		}
		for(int i=0; i<n; i++){
			max = Math.max(cache[n-1][i], max);
		}
		System.out.println(max);
		/*for(int i=0; i<n; i++){
			for(int j = 0; j<=i; j++){
				System.out.print(tri[i][j]+" ");
			}
			System.out.println();
		}*/
	}
}
