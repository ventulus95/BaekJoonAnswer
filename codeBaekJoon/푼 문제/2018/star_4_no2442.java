package codeBaekJoon;
import java.util.*;
public class star_4_no2442 {
	public static void main(String[] args) {
		int n,i;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		int i1=n;
		while(i1>0){
			for(int j=n; j>i1; j--){
				System.out.print(" ");//이친구는 줄어야함.	
			}
			for(int k=2*i1-1; k>0; k--){
				System.out.print("*");
			}
			System.out.println();
			i1--;
		}
		i=1;
		while(i<n){
			for(int j=n-i-1; j>0; j--){
				System.out.print(" ");//이친구는 줄어야함.	
			}
			for(int k=0; k<2*i+1; k++){
				System.out.print("*");
			}
			System.out.println();
			i++;
		}
	}

}

