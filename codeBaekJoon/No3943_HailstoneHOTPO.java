/** 2020. 2. 25. 오후 3:21:43
 * @author ventulus95
 */
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No3943_HailstoneHOTPO {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i =0; i<T; i++){
			int n = Integer.parseInt(br.readLine());
			int max = n;
			while(n!=1){
				if(n%2==0){
					n = n/2;
					max = Math.max(max, n);
				}
				else{
					n = 3*n+1;
					max = Math.max(max, n);
				}
			}
			System.out.println(max);
		}

	}

}
