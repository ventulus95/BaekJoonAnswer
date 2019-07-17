package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no2798_blackJack {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s, " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		String t = br.readLine();
		st = new StringTokenizer(t, " ");
		int card[] = new int[n];
		for(int i =0; i<n; i++){
			card[i] = Integer.parseInt(st.nextToken());
		}
		int max =-1;
		int sum =0;
		for(int i =0; i<n; i++){
			for(int j=i+1; j<n; j++){
				for(int k=j+1; k<n; k++){
					sum=card[i]+card[j]+card[k];
					if(sum<=m){
						if(max<sum){
							max= sum;
						}
					}
				}
			}
		}
		System.out.println(max);
	}
	
}
