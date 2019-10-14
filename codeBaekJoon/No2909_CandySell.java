/** 2019. 10. 14. 오후 8:38:07
 * @author ventulus95
 */
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2909_CandySell {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tc = br.readLine();
		StringTokenizer st = new StringTokenizer(tc," ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int round;
		if(k==0){
			round = n%pow(k)/1;
		}
		else{
			round = n%pow(k)/pow(k-1);
		}
		
		System.out.println(round);
		if( round >=5){
			n -= n%pow(k);
			n += pow(k);
		}
		else{
			n -= n%pow(k);
		}
		System.out.println(n);
	}
	
	public static int pow(int y){
		int sum = 1;
		for(int i =0; i<y; i++){
			sum *= 10;
		}
		return sum;
	}
}
