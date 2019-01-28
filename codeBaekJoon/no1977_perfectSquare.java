package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no1977_perfectSquare {
	static int powS(int n){
		n *= n;
		return n;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int min = Integer.MAX_VALUE;
		boolean check = false;
		int sum = 0;
		for(int i=1; i<=10000; i++){
			int temp = powS(i);
			if(n<=temp&& m>=temp){
				check = true;
				if(min>temp){
					min = temp;
				}
				sum+=temp;
			}
			if(temp>m){
				break;
			}
		}
		if(check==true){
		System.out.println(sum);
		System.out.println(min);
		}
		else{
			System.out.println(-1);
		}
	}
}
