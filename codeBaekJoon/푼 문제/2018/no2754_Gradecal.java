package codeBaekJoon;
import java.util.Scanner;
public class no2754_Gradecal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String grade = input.next();
		double cal = 4.5;
		if(grade.charAt(0)=='A'){
			if(grade.charAt(1)=='+'){
				System.out.println(cal-0.2);
			}
			if(grade.charAt(1)=='0'){
				System.out.println(cal-0.5);
			}
			if(grade.charAt(1)=='-'){
				System.out.println(cal-0.8);
			}
		}
		else if(grade.charAt(0)=='A'+1){ // B
			cal = cal -1;
			if(grade.charAt(1)=='+'){
				System.out.println(cal-0.2);
			}
			if(grade.charAt(1)=='0'){
				System.out.println(cal-0.5);
			}
			if(grade.charAt(1)=='-'){
				System.out.println(cal-0.8);
			}
		}
		else if(grade.charAt(0)=='A'+2){ //C
			cal = cal -2;
			if(grade.charAt(1)=='+'){
				System.out.println(cal-0.2);
			}
			if(grade.charAt(1)=='0'){
				System.out.println(cal-0.5);
			}
			if(grade.charAt(1)=='-'){
				System.out.println(cal-0.8);
			}
		}
		else if(grade.charAt(0)=='A'+3){ //D
			cal = cal -3;
			if(grade.charAt(1)=='+'){
				System.out.println(cal-0.2);
			}
			if(grade.charAt(1)=='0'){
				System.out.println(cal-0.5);
			}
			if(grade.charAt(1)=='-'){
				System.out.println(cal-0.8);
			}
		}
		else{
			System.out.println(0.0);
		}
	}

}
