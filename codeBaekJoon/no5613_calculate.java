package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no5613_calculate {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int output =0;
		int temp =0;
		String cal="";
		String s = br.readLine();
		output = Integer.parseInt(s);
		while(!s.equals("=")){
			if(!s.equals("=")&&!s.equals("+")&&!s.equals("-")&&!s.equals("*")&&!s.equals("/")){
				temp = Integer.parseInt(s);
				if(cal.equals("+")){
					output += temp; 
				}
				if(cal.equals("-")){
					output -= temp; 
				}
				if(cal.equals("*")){
					output *= temp; 
				}
				if(cal.equals("/")){
					output /= temp; 
				}
			}
			if(s.equals("+")){
				cal = "+";
			}
			if(s.equals("-")){
				cal = "-";
			}
			if(s.equals("/")){
				cal = "/";
			}
			if(s.equals("*")){
				cal = "*";
			}
			s = br.readLine();
		}
		System.out.println(output);

	}
}
