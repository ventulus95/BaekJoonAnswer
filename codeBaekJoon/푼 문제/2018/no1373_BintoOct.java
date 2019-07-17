package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class no1373_BintoOct {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String B= br.readLine();
		StringBuilder oct = new StringBuilder();
		Stack s = new Stack();
		String num = "";
		int t =0;
		int nup =1;
		int check;
		int check2;
		int check4;
		if(B.length()%3==1){
			B = "00"+B;
		}
		if(B.length()%3==2){
			B ="0"+B;
		}
		while(t<B.length()/3){
			int max =B.length()-1;
			check = B.charAt(max-((3*t)+0))-'0';
			check2 = B.charAt(max-((3*t)+1))-'0';
			check4 = B.charAt(max-((3*t)+2))-'0';
			s.push((check4*4)+(check2*2) +(check));
			t++;
		}
		
		
		while(!s.isEmpty()){
			oct.append(s.pop());
		}
		System.out.println(oct.toString());
	}
}
