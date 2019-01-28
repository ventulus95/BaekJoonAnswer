package codeBaekJoon;
import java.util.*;
public class no2744_changeUpDown {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String change = input.next();
		for(int i=0; i<change.length(); i++){
			if(change.charAt(i)>='A'&&change.charAt(i)<='Z'){
				System.out.print((char)(change.charAt(i)+32));
			}
			if(change.charAt(i)>='a'&&change.charAt(i)<='z'){
				System.out.print((char)(change.charAt(i)-32));
			}
			
		}
	}

}

