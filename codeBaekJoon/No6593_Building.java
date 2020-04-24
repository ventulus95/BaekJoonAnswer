/** 2020. 4. 10. 오후 8:15:51
 * @author ventulus95
 */
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No6593_Building {
	
	static int map [][][];
	static int z,y,x;
	static int dx[] = {0,0,1,0,0,-1};
	static int dy[] = {0,1,0,0,-1,0};
	static int dz[] = {1,0,0,-1,0,0};

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tc = br.readLine();
		StringTokenizer st = new StringTokenizer(tc, " ");
		z = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());
		x = Integer.parseInt(st.nextToken());
		for(int i = 0; i<z; i++){
			for(int j=0; j<y; j++){
				for(int k=0; k<x; k++){
					
				}
			}
		}

	}

}
