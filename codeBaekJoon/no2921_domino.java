/* 2019.02.08 법칙찾기 
*/
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no2921_domino {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int result = 0;
		int n = Integer.parseInt(br.readLine());
		int p = 2;
		for(int i = 1; i<=n; i++,p++){
			result += i*(p);
//			System.out.println("i: "+result);
			for(int j=0; j<=i; j++){
				result += j;
//				System.out.println("j: "+result);
			}
			
		}
		System.out.println(result);
	}
}
