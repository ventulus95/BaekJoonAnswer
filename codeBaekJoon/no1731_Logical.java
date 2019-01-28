package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no1731_Logical {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int s0 = Integer.parseInt(br.readLine());
		int s1 =Integer.parseInt(br.readLine());
		int s2 =Integer.parseInt(br.readLine());
		int d =0;
		if(T==3){
			d=s2;
		}
		for(int i=3; i<T; i++ ){
			d =Integer.parseInt(br.readLine()); 
		}
		int r = s1 - s0;
		int q = s1/s0;
		if(s1+r==s2){
			System.out.println(d+r);
		}
		else{
			System.out.println(d*q);
		}
		
	}
}
