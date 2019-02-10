/* 2019.02.
*/
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1475_RoomNumber {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int num[] = new int [10];
		for(int i=0; i<s.length(); i++){
			num[s.charAt(i)-'0']++;
		}
		int set = 0;
		boolean check = false;
		while(check!=false){
			int t=0;
			for(int i =0; i<10; i++){
				if(num[i]!=0){
					if(i==6 && i==9){
						num[i] -= 0.5;
					}
					else{
					num[i]--;
					}
				}
				
			}
			set++;
		}
	}
}
