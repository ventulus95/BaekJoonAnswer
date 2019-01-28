package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no2846_climbNum {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s, " ");
		int climb[] = new int [T];
		for(int i=0; i<T; i++){
			climb[i] = Integer.parseInt(st.nextToken());
		}
		int init = climb[0];
		int prev = climb[0];
		int max =0;
		int sum =0;
		for(int i=1; i<T; i++){
//			System.out.println("init: "+init);
			if(prev<climb[i]){
				if(climb[i]<=init){
					init = climb[i];
				}
				else{
					sum = climb[i] - init;
					if(max<sum){
						max = sum;
					}
				}
			}
			else{
				init = climb[i];
			}
			prev = climb[i];
		}
		System.out.println(max);
	}
}
