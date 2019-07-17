package codeBaekJoon;
import java.util.*;
public class CheckAlpha_no10808 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String searching = input.next(); //소문자는 97~122
		int[] alpha = new int[26];
		for(int k=0; k<26; k++){
			alpha[k] =0;
		}
		for(int i=0; i<searching.length(); i++){
			int check= searching.charAt(i);
			check -= 97;
				alpha[check]++;
		}
		for(int j=0; j<26; j++){
			System.out.print(alpha[j]+" ");
		}
	}
}
