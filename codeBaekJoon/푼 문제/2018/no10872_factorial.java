package codeBaekJoon;
import java.util.*;
public class no10872_factorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int fac = 1;
		for(int i=n; i>0; i--){
			fac= fac* i;
		}
		System.out.println(fac);
	}

}
