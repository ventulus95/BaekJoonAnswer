package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class no4948_Bertrands_postulate {
public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int T = Integer.parseInt(br.readLine());
			while(T!=0){
				int count =0;
				int p[] = new int[(2*T)+1];
				Arrays.fill(p, 0);
				for(int i =2; i<=2*T; i++){
					p[i] = i;
				}
				for(int j = 2; j<=2*T; j++){
					if(p[j]==0)
						continue;
					for(int k = j+j; k<=2*T; k+=j){
						p[k] = 0;
					}
				}
				for(int i =T+1; i<=2*T; i++){
					if(p[i]!=0){
						count++;
					}
				}
				System.out.println(count);
				T = Integer.parseInt(br.readLine());
			}
		}
}
