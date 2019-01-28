package codeBaekJoon;
import java.util.*;
public class AvgTestScore_no10039 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tc [] = new int [5];
		for(int i=0; i<5; i++){
			tc[i] = input.nextInt();
			if(tc[i]<40){
				tc[i]=40;
			}	
		}
		int sum =0;
		for(int j=0; j<5; j++){
			sum+=tc[j];
		}
		System.out.println(sum/5);
	}

}
