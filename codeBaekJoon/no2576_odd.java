package codeBaekJoon;
import java.util.*;
public class no2576_odd {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int odd[] = new int [7];
		int checkodd =0, sum=0, min=100;
		for(int i=0; i<7; i++){
			odd[i]=input.nextInt();
			if(odd[i]%2==1){
				checkodd++;
				sum+=odd[i];
				if(min>odd[i]){
					min=odd[i];
				}
			}
		}
		if(checkodd==0){
			System.out.println(-1);
		}
		else{
			System.out.println(sum);
			System.out.println(min);
		}
	}

}
