package codeBaekJoon.안푼문제;
import java.util.Scanner; 
public class fibonacci_3_no2749 {
	  public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
				int n = input.nextInt();
				long[] F = new long[n+2];
				F[0]=0;
				F[1]=1;
				for(int i=0; i<n-1; i++){
					F[i+2] = F[i+1] + F[i];
				}
				System.out.print(F[n]%1000000);
	  }
}