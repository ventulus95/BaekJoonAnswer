package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no1929_PrimeNum {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s, " ");
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int p[] = new int[n+1];
		Arrays.fill(p, 0);
		for(int i =2; i<=n; i++){
			p[i] = i;
		}
		for(int j = 2; j<=n; j++){
			if(p[j]==0)
				continue;
			for(int k = j+j; k<=n; k+=j){
				p[k] = 0;
			}
		}
		
		
		for(int i =m; i<=n; i++){
			if(p[i]!=0){
				System.out.println(p[i]);
			}
		}
	}
}
