package codeBaekJoon;
import java.util.*;
public class SugarDelivery_no2839 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int a = n%5;
		int testCase = 0;
		if(a==0){
			testCase = n/5;
			System.out.println(testCase);
		}
		else if(a==1){
			n -= 6;
			testCase = n/5;
			testCase += 2;
			System.out.println(testCase);
		}
		else if(a==2){
			n -= 12;
			if(n<0){
				System.out.println(-1);
			}
			else{
			testCase = n/5;
			testCase += 4;
			System.out.println(testCase);
			}
		}
		else if(a==3){
			n -= 3;
			testCase = n/5;
			testCase += 1;
			System.out.println(testCase);
		}
		else if(a==4){
			n -= 9;
			if(n<0){
				System.out.println(-1);
			}
			else{
			testCase = n/5;
			testCase += 3;
			System.out.println(testCase);
			}
		}
	}
}
