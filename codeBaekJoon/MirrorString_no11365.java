package codeBaekJoon;
import java.util.*;
public class MirrorString_no11365 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNextLine()){
			String mirror = input.nextLine();
			if(mirror.equals("END")){
				break;
			}
			for(int i=mirror.length()-1; i>=0; i--){
				System.out.print(mirror.charAt(i));
			}
			System.out.println();
		}
	}

}
