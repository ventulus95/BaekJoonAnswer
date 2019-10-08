/** 2019. 9. 24. 오후 6:42:03
 * @author ventulus95
 */
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No5585_remainCost {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cost = Integer.parseInt(br.readLine());
		int[] coinArr = {500, 100, 50, 10, 5, 1};
		cost = 1000-cost;
		int num =0;
		for(int i=0; i<6; i++){
			if(cost/coinArr[i]>0){
				num += cost/coinArr[i];
				cost = cost%coinArr[i];
			}
		}
		System.out.println(num);
	}

}
