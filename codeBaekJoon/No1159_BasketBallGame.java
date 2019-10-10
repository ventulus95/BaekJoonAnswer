/** 2019. 10. 9. 오후 2:46:03
 * @author ventulus95
 */
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1159_BasketBallGame {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] alpha = new int[26];
		for(int i=0; i<T; i++){
			String tc = br.readLine();
			char check = tc.charAt(0);
			alpha[check-'a']++;
		}
		boolean kkk = false;
		for(int i=0; i<26; i++){
			if(alpha[i]>=5){
				kkk = true;
				System.out.print((char)('a'+i));
			}
			if(kkk==false && i==25){
				System.out.print("PREDAJA");
			}
		}
		
		
		
	}

}
