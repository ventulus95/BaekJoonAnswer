/* 2019.02.09 문자열 체크. 
*/
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No1316_groupWordChecker {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int alpha[] = new int [26];
		int T = Integer.parseInt(br.readLine());
		int word =0;
		while(T-->0){
			boolean check = true;
			String c = br.readLine();
			Arrays.fill(alpha, 0);
			int prev =-1;
			for(int i = 0; i<c.length(); i++){
				int w = c.charAt(i)-'a';
				alpha[w]++;
				if(alpha[w]>1 && prev!=w){
					check = false;
				}
				prev = w;
			}
			if(check==true){
				word++;
			}
		}
		System.out.println(word);
	}
}
