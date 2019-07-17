package codeBaekJoon;
import java.util.*;
public class SearchingPrimeNum_no1978 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		int count =0;
		for(int i=0; i<t; i++){
			int prime = input.nextInt();
			int k=0;
			for(int j=1; j<=prime; j++){
				if(prime%j==0){
					k++;
				}
			}
			if(k==2){
				count++;
			}
		}
		System.out.println(count);
	}

}
