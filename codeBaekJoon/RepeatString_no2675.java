package codeBaekJoon;
import java.util.*;
public class RepeatString_no2675 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		for(int i=0; i<T; i++){
			int r = input.nextInt();
			String str = input.next();
			for(int k =0; k<str.length(); k++){
				for(int t=0; t<r; t++){
				System.out.print(str.charAt(k));
				}
			}
			System.out.println();
		}
	}
}
