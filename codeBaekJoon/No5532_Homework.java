/** 2019. 10. 9. 오후 2:23:46
 * @author ventulus95
 */
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No5532_Homework {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine());
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int D = Integer.parseInt(br.readLine());
		while(A>0 || B>0){
			A-=C;
			B-=D;
			L--;
		}
		System.out.println(L);
	}

}
