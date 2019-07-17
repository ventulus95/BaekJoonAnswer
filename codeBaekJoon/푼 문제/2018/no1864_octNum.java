package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no1864_octNum {
	static int pow(int n, int m){
		int r = 1;
		for(int i=0; i<m; i++){
			r = n*r;
		}
		return r;
	} 

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = 7;
		String s = br.readLine();
		while(!s.equals("#")){
			int len = s.length();
			int result = 0;
			int check =0;
			int j=0;
			for(int i=len; i>0; i--){
				if(s.charAt(j)=='-'){
					check =0;
				}
				if(s.charAt(j)==92){
					check =1;
				}
				if(s.charAt(j)=='('){
					check =2;
				}
				if(s.charAt(j)=='@'){
					check =3;
				}
				if(s.charAt(j)=='?'){
					check =4;
				}
				if(s.charAt(j)=='>'){
					check =5;
				}
				if(s.charAt(j)=='&'){
					check =6;
				}
				if(s.charAt(j)=='%'){
					check =7;
				}
				if(s.charAt(j)=='/'){
					check =-1;
				}
				result += check*pow(8,i-1);
				j++;
			}
			System.out.println(result);
			s =br.readLine();
		}

	}
}
