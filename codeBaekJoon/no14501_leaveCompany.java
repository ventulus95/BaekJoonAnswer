package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no14501_leaveCompany {
	static int max =0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int t[] = new int [T+1];
		int p[] = new int [T+1];
		for(int i=0; i<T; i++){
			String a = br.readLine();
			StringTokenizer st = new StringTokenizer(a, " ");
			t[i]=Integer.parseInt(st.nextToken());
			p[i]=Integer.parseInt(st.nextToken());
		}
		for(int i =0; i<T; i++){
			
		}
		System.out.println(max);
		
	}
}
