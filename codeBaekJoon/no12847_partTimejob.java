package codeBaekJoon;
import java.util.*;
public class no12847_partTimejob { //부분합 문제 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		long money[] = new long [n];
		for(int i=0; i<n; i++){
			money[i] =input.nextInt();
		}
		long maxMoney =0;
		long max =0;
		for(int t=0; t<n-m; t++){
			for(int k=0; k<m; k++){
				max+=money[t+k];
			}
			if(maxMoney<max){
				maxMoney=max;
			}
			max=0;
		}
		
		System.out.println(maxMoney);
		
	}

}
