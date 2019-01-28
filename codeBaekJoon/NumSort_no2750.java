package codeBaekJoon;
import java.util.*;
public class NumSort_no2750 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int test = input.nextInt();
		int arr[] = new int[test];
		for(int i=0; i<test; i++ ){
			arr[i]=input.nextInt();
		}
		int t=0;
		while(t!=test){
			int min=arr[t];  
			int minNum=t;
		for(int j=t; j<test; j++){
				if(min>arr[j]){
					min = arr[j];
					minNum = j;
				}
		}
		int temp = arr[t];
		arr[t]=min;
		arr[minNum]=temp;
		t++;
		}
		for(int k=0; k<test; k++){
			System.out.println(arr[k]);
		}
	}

}
