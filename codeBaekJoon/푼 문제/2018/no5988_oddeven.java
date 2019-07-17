package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class no5988_oddeven {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long T= Long.parseLong(br.readLine());
		while(T-->0){
			String s = br.readLine();
			int check = s.charAt(s.length()-1)-'0';
			if(check%2==0){
				System.out.println("even");
			}
			else{
				System.out.println("odd");
			}
		}
}


}
