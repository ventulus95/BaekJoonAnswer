/** 2019. 10. 10. 오후 5:29:28
 * @author ventulus95
 */
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No5612_tunnelEnt_Exit {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int tunnel = m;
		int max = m; 
		boolean check = true;
		StringTokenizer st;
		for(int i=0; i<n; i++){
			String tc = br.readLine();
			st = new StringTokenizer(tc, " ");
			int inner = Integer.parseInt(st.nextToken());
			int exit = Integer.parseInt(st.nextToken());
			tunnel += inner;
			tunnel -= exit;
			if(tunnel<0){
				System.out.println(0);
				check = false;
				break;
			}
			max = Math.max(tunnel, max);
		}
		if(check==true)
			System.out.println(max);

	}

}
