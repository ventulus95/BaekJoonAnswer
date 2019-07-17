package codeBaekJoon;
import java.util.*;
public class KMP_no2902 {
	public static void main(String[] args) {
		//65~90번까지 대문자.
		Scanner input = new Scanner(System.in);
		String kmp = input.next();
		String Save[] = new String[kmp.length()];
		int sav =1;
		for(int i=0; i<kmp.length()-1; i++){
			Save[0] = kmp.charAt(0)+"";
			char check = kmp.charAt(i);
			if(check==45){
				check = kmp.charAt(i+1);
				if(check>=65 && check<=90){
					Save[sav] = check+"";
					sav++;
				}
			}
		}	
		for(int j=0; j<sav; j++){
		System.out.print(Save[j]);
		}
	}

}
