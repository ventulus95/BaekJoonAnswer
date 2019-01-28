package codeBaekJoon;
import java.util.*;
public class Statistics_no2108 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		int arr[] = new int [t];
		for(int i=0; i<t; i++){
			arr[i]=input.nextInt();
		}
		int test=0;
		while(test!=t){
			int min=arr[test];  
			int minNum=test;
		for(int j=test; j<t; j++){
				if(min>arr[j]){
					min = arr[j];
					minNum = j;
				}
		}
		int temp = arr[test];
		arr[test]=min;
		arr[minNum]=temp;
		test++;
		}
		int sum=0;
		for(int a=0; a<t; a++){//산술평균 출력
			sum+=arr[a];
		}
		System.out.println(sum/t);
		System.out.println(arr[t/2+1]);//중앙값 출력
		int count[] =new int[t];//최빈값 출력
		
		for(int b=0; b<t; b++){
			for(int c=0; c<t; c++){
				if(arr[b]==arr[c]){
					count[b]++;
				}
			}
		}
		int max =0;
		for(int d=0; d<t; d++){
			if(max<=count[d]){
				
			}
		}
		System.out.println(arr[t-1]-arr[0]);//범위 출력
		
	}	

}
