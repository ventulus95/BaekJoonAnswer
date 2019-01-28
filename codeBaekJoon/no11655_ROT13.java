package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no11655_ROT13 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
				if(s.charAt(i)+13>'Z'){
					System.out.print((char)((s.charAt(i)+13)-26 )  );
				}
				else{
					System.out.print((char)(s.charAt(i)+13));
				}
			}
			else if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
				if(s.charAt(i)+13>'z'){
					System.out.print((char)((s.charAt(i)+13)-26 )  );
				}
				else{
					System.out.print((char)(s.charAt(i)+13));
				}
			}
			else{
				System.out.print((char)(s.charAt(i)));
			}
		}
	}
}
