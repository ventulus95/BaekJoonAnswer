package codeBaekJoon;
import java.util.*;
public class no4880_APGP {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			int a1 = input.nextInt();
			int a2 = input.nextInt();
			int a3 = input.nextInt();
			if(a1==0&&a2==0&&a3==0){
				break;
			}
			if(a1+a3==2*a2){
				System.out.print("AP ");
				System.out.println(a3+(a2-a1));
			}
			if(a1*a3==a2*a2){
				System.out.print("GP ");
				System.out.println(a3*(a2/a1));
			}

		}
	}

}
