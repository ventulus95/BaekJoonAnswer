package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no1731_think {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T= Integer.parseInt(br.readLine());
		int past = 0;
		int pastChang =0;
		while(T-->0){
			int a0= Integer.parseInt(br.readLine());
			int a1= Integer.parseInt(br.readLine());
			past = a1 - a0;
			pastChang = a1/a0;
			
		}
	}

}
