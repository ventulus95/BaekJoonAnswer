package codeBaekJoon;
import java.util.*;
public class SearchingAlpha_no10809 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String searching = input.next(); //소문자는 97~122
		int[] alpha = new int[26];
		for(int k=0; k<26; k++){
			alpha[k] =-1;
		}
		for(int i=0; i<searching.length(); i++){
			int check= searching.charAt(i);
			check -= 97;
			if(alpha[check]<0){
				alpha[check]=i;
			}
		}
		for(int j=0; j<26; j++){
			System.out.print(alpha[j]+" ");
		}
	}
}
