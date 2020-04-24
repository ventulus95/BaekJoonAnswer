/** 2020. 2. 29. 오후 11:18:05
 * @author ventulus95
 */
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No11048_move {
	
	static int map[][];
	static int cache[][]; 
	static int dx[] = {-1,0,-1};
	static int dy[] = {0,-1,-1};

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tc = br.readLine();
		StringTokenizer st = new StringTokenizer(tc, " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		map = new int [n+2][m+2];
		cache = new int[n+2][m+2];
		for(int i =0; i<n+2; i++){
			Arrays.fill(map[i], -1);
			Arrays.fill(cache[i], -1);
		}
		for(int i=1; i<n+1; i++){
			String t = br.readLine();
			st = new StringTokenizer(t, " ");
			for(int j=1; j<m+1; j++){
				int temp = Integer.parseInt(st.nextToken());
				map[i][j] = temp;
			}
		}
		cache[1][1] = map[1][1];
		for(int i=1; i<=n; i++){
			for(int j=1; j<=m; j++){
				for(int k=0; k<3; k++){
					cache[i][j] = Math.max(cache[i][j], cache[i+dx[k]][j+dy[k]] +map[i][j]);
				}
				
			}
		}
		System.out.println(cache[n][m]);
	}
}
