/** 2020. 4. 23. 오후 8:04:55
 * @author ventulus95
 */
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class No11967_Switching_on_the_Lights {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tc = br.readLine();
		StringTokenizer st = new StringTokenizer(tc, " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		HashMap <node11967, ArrayList<node11967>> list = new HashMap<node11967, ArrayList<node11967>>(); 
		for(int i =0; i<m; i++){
			String t = br.readLine();
			st = new StringTokenizer(t, " ");
			int sx = Integer.parseInt(st.nextToken());
			int sy = Integer.parseInt(st.nextToken());
			int gx = Integer.parseInt(st.nextToken());
			int gy = Integer.parseInt(st.nextToken());
			if(!list.containsKey(new node11967(sx, sy))){
				list.put(new node11967(sx, sy), new ArrayList<node11967>());
			}
			
		
		}
	}

}

class node11967 {
	int x;
	int y;
	
	public node11967(int x, int y){
		this.x = x;
		this.y = y;
	}
}