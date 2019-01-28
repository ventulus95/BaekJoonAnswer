package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no1259_palin {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String palin =br.readLine();
		int n = Integer.parseInt(palin);
		while(n!=0){
			StringBuffer st = new StringBuffer(palin);
				if(palin.equals(st.reverse().toString())){
					System.out.println("yes");
				}
				else{
					System.out.println("no");
				}
			palin =br.readLine();
			n = Integer.parseInt(palin);
		}
	}

}
