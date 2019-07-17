package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class no1436_directorShum {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int t[] = new int[15];
		Arrays.fill(t, 0);
		t[14] = 6;
		t[13] = 6;
		t[12] = 6;
		
		while(N>1){
			t[14]++;
			for(int i=14; i>0; i--){
				if(t[i]==10){
					t[i-1]++;
					t[i]=0;
				}
			}
			for(int i=14; i>2; i--){
				if(t[i]==6&&t[i-1]==6&&t[i-2]==6){
					N--;
					break;
				}
			}
		}
		int v =0;
		while(true){
			if(t[v]!=0){
				break;
			}
			v++;
		}
		for(int i=v; i<15;i++){
			System.out.print(t[i]);
		}
	}
}
