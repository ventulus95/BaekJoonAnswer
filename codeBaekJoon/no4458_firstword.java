package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no4458_firstword {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n  = Integer.parseInt(br.readLine());
		while(n-->0){
			String s = br.readLine();
			char f = s.charAt(0);
			if(f>96){
				f-=32;
			}
			String out = String.valueOf(f);
			out+=s.substring(1);
			System.out.println(out);
		}
	}
}
