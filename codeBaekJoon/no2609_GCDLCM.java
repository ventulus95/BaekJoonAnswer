package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no2609_GCDLCM {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s," ");
		int a= Integer.parseInt(st.nextToken());
		int b= Integer.parseInt(st.nextToken());
		int A = 0 , B=0, GCD = 0, LCM =0;
		if(a<b){
			A = b;
			B = a;
		}
		else{
			A = a;
			B = b;
		}
		int remain = -1;
		while(remain!=0){
			remain = A%B;
			if(remain==0){
				break;
			}
			else{
				A = B;
				B = remain;
			}
		}
		GCD = B;
		LCM = (a/GCD)*(b/GCD)*GCD;
		System.out.println(GCD);
		System.out.println(LCM);
	}

}
