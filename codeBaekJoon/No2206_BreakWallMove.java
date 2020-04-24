/** 2020. 3. 9. 오후 8:47:53
 * @author ventulus95
 */
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No2206_BreakWallMove {
	
	static int map [][];
	static int visited[][];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tc = br.readLine();
		StringTokenizer st = new StringTokenizer(tc, " ");
		int y = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		map = new int[y+2][x+2];
		visited = new int[y+2][x+2];
		for(int i=0; i<y+2; i++){
			Arrays.fill(map[i], 0);
			Arrays.fill(visited[i], 0);
		}
		
	}

}
