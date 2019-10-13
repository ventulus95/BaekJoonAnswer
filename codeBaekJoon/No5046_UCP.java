/** 2019. 10. 13. 오후 6:25:04
 * @author ventulus95
 */
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No5046_UCP {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tc = br.readLine();
		StringTokenizer st = new StringTokenizer(tc," ");
		int n = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int cost = 500001;
		for(int i=0; i<h; i++){
			int hotel = Integer.parseInt(br.readLine());
			String sw = br.readLine();
			st = new StringTokenizer(sw, " ");
			for(int j =0; j<w; j++){
				int week = Integer.parseInt(st.nextToken());
				if(n<week){
					if(b>hotel*n){
						cost = Math.min(cost, hotel*n);
						break;
					}
				}
			}
		}
		if(cost>500000){
			System.out.println("stay home");
		}
		else{
			System.out.println(cost);
		}
		
	}

}
