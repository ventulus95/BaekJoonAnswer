package codeBaekJoon;
import java.util.*;
public class SangSu_no2908 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a = input.next();
		String b = input.next();
		int A = 0, B =0;
		for(int i=2; i>=0; i--){
			A*=10;
			B*=10;
			int reverseA = a.charAt(i)-48;
			int reverseB = b.charAt(i)-48;
			A += reverseA;
			B += reverseB;
		}
		if(A>B)
		System.out.println(A);
		else
		System.out.println(B);
	}

}
