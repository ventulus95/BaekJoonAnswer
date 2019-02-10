/* 2019.02.09. 문자열 처리..
*/
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No16435_snakeBird {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st= new StringTokenizer(s, " ");
		int n = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		int fruit[] = new int[n];
		String f = br.readLine();
		StringTokenizer st1 = new StringTokenizer(f, " ");
		for(int i=0; i<n; i++){
			fruit[i] = Integer.parseInt(st1.nextToken());
		}
		Arrays.sort(fruit);
		for(int i =0; i<n; i++){
			if(l>=fruit[i]){
				fruit[i] = -1;
				l++;
			}
		}
		System.out.println(l);
	}
}
