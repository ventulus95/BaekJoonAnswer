/* 2019.02.06 구현하기.귀찮음.
*/
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no1193_Findfraction {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int i=1;
		int j=2;
		final int LEFT = 2;
		final int RIGHT = 1;
		int check = LEFT;
		while(T>2){
			if(check == LEFT){
				j--;
				i++;
				if(j==0){
					j=1;
					check = RIGHT;
				}
			}
			else{
				i--;
				j++;
				if(i==0){
					i=1;
					check = LEFT;
				}
			}
//			System.out.print(T+": ");
//			System.out.println(i+"/"+j);
			T--;
		}
		if(T==1){
			System.out.println(i+"/"+(j-1));
		}
		else if(T==2){
			System.out.println(i+"/"+j);
		}
		else{
			System.out.println(i+"/"+j);
		}
		
	}
}
