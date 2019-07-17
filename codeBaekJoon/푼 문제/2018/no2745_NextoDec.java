package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class no2745_NextoDec {
	static int pow(int num, int n){
		num = num*n;
		return  num;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s," ");
		String B= st.nextToken();
		int b = Integer.parseInt(st.nextToken());
		int num = 0;
		int Nup = 1;
		int i =1;
		while(i<=B.length()){
			int check = B.charAt(B.length()-i);
			if(check>='A'){
				check -= 'A';
				check += 10;
			}
			else{
				check -= '0';
			}
			check =pow(check, Nup);
			i++;
			Nup *=b;
			num += check;
		}
		System.out.println(num);
	}

}
