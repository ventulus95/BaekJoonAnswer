package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no1065_hansu {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int k = n;
		int count = 0;
		
		while(k>99){
			int hun = k/100;
			int ten = (k/10)%10;
			int one = k%10;
			if(hun-ten==ten-one){
				count++;
			}
			k--;
		}
		if(n>99){
		System.out.println(count+99);
		}
		else if(n==1000){
			System.out.println(count+98);
		}
		else{
			System.out.println(n);
		}
	}
}
