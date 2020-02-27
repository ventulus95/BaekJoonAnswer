package codeBaekJoon.안푼문제;
import java.util.*;
public class ATM_no11399 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int np = input.nextInt();
		int a [] = new int[np];
		for(int i=0; i<np; i++){
			a[i] = input.nextInt();
		}
		for(int j=0; j<np; j++){
			for(int k=j+1; k<np; k++){
				int temp =0;
				if(a[j]>a[k]){
					temp =a[j];
					a[j] = a[k];
					a[k] = temp;
				}
			}
		}
		int sum =0;
		for(int t=0; t<np; t++){
			for(int u=0; u<t+1; u++){
				sum+=a[t];
			}
			
		}
		System.out.println(sum);
	}

}
