package codeBaekJoon;

import java.util.*;
public class NumberTotal_no2577 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int A = input.nextInt();
		int B = input.nextInt();
		int C = input.nextInt();
		int total = A*B*C;
		String totals = String.valueOf(total);
		int[] num = new int [10]; 
		int nums = 1;
		for(int i=0; i<totals.length(); i++){
			nums *= 10;
			int num1 = total%nums;
			num1 /= (nums/10);
			for(int j =0; j<10; j++){
				if(num1 == j){
				num[j]++;
				}
			}
			if(i==0){
				total = total - num1;
				}
			else{
				total = total - num1*(nums/10);
			}
		}
		for(int k =0; k<10; k++){
			System.out.println(num[k]);
		}

	}

}
