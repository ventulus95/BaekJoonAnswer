/** 2019. 9. 24. 오전 1:38:32
 * @author ventulus95
 */
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2935_BUKA {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine();
		String check = br.readLine();
		String B = br.readLine();
		if(check.equals("*")){
			A += B.substring(1);
			System.out.println(A);
		}
		else{
			int [] Asize = new int[A.length()];
			int [] Bsize = new int[B.length()];
			for(int i=0; i<A.length(); i++){
				Asize[i] = A.charAt(A.length()-i-1)-'0';
			}
			for(int i=0; i<B.length(); i++){
				Bsize[i] = B.charAt(B.length()-i-1)-'0';
			}
			StringBuffer print = new StringBuffer();
			if(A.length()>=B.length()){
				for(int i =0; i<B.length(); i++){
					Asize[i] += Bsize[i];
				}
				for(int i =0; i<A.length(); i++){
					print.append(Asize[i]);
				}
				System.out.print(print.reverse());
			}
			else{
				for(int i =0; i<A.length(); i++){
					Bsize[i] += Asize[i];
				}
				for(int i =0; i<B.length(); i++){
					print.append(Bsize[i]);
				}
				System.out.print(print.reverse());
			}
		}
		
	}

}
