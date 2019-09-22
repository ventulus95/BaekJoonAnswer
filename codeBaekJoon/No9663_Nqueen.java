/** 2019. 7. 20.
 * @author ventulus95
 */
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class No9663_Nqueen {
	static int n;
	static int cnt =0;
	static boolean visited[][];
	static int dx[] = {-1,-1,-1, 0,0 ,1,1,1};
	static int dy[] = {-1,0,1, -1,1, -1,0,1};

	static void dfs(int i, int depth){
		if(depth==n-1){
			cnt++;
			return;
		}
		visited[depth][i] = false;
		//여기 밑에서 부터 짜야됨.
		dfs(i,depth+1);
		visited[depth][i] = true;
				
	}

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(br.readLine());
		visited = new boolean [n][n];
		for(int i =0; i<n; i++) Arrays.fill(visited[i], true);
		for(int i=0; i<n; i++){
			dfs(i,0);
		}
		bw.write(String.valueOf(cnt));
		bw.flush();
		bw.close();

	}

}
