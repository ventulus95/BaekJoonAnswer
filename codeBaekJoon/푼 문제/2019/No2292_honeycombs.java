/* 2019.03.06 브루트포스로 때려맞춰보기. 
 * 이중 for문 탈출시 label 이용하는 전략은 상당히 유용한듯.
 * 
*/
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No2292_honeycombs {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int check[][] = new int [25003][6];
		Arrays.fill(check[1], 1);
		int ni =0;
		check[2][0] =2;
		outloop:
		for(int i = 2; i<25002; i++){
			for(int j =1; j<6; j++){
					check[i][j] = check[i][j-1]+i-1;
					if(check[i][j]>=T){
						ni=i;
						break outloop;
					}
				}
			check[i+1][0]=check[i][5]+i;
			if(check[i+1][0]>T){
				ni=i+1;
				break outloop;
			}
		}
		if(T!=1){
			System.out.println(ni);
		}
		else{
			System.out.println(1);
		}
	}
	
}
