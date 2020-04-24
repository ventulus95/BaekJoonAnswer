/** 2020. 4. 3. 오후 7:24:51
 * @author ventulus95
 */
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class No1926_paint {
	
	static int map[][];
	static int visited[][];
	static int dx[] = {0,1,0,-1};
	static int dy[] = {1,0,-1,0};
	static int pcnt = 1;
	static int maxcnt = 0;
	static Stack<Node1926> stack = new Stack<>();
	
	static void dfs(){
		int cnt =0;
		while(!stack.isEmpty()){
			Node1926 temp =stack.pop();
			if(visited[temp.y][temp.x] == 0)
				cnt++;
			visited[temp.y][temp.x] = pcnt;
			for(int i=0; i<4; i++){
				if(map[temp.y+dy[i]][temp.x+dx[i]] == 1 && visited[temp.y+dy[i]][temp.x+dx[i]] == 0){
					stack.push(new Node1926(temp.x+dx[i], temp.y+dy[i]));
					visited[temp.y][temp.x] = pcnt;
				}
			}
		}
		pcnt++;
		maxcnt = Math.max(cnt, maxcnt);
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String t = br.readLine();
		StringTokenizer st = new StringTokenizer(t, " ");
		int y = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		map = new int [y+2][x+2];
		visited = new int [y+2][x+2];
		for(int i=0; i<y+2; i++){
			Arrays.fill(map[i], 0);
			Arrays.fill(visited[i], -1);
		}
		for(int i=1; i<y+1; i++){
			String tc = br.readLine();
			st = new StringTokenizer(tc, " ");
			for(int j=1; j<x+1; j++){
				map[i][j] = Integer.parseInt(st.nextToken());
				if(map[i][j] == 1){
					visited[i][j] = 0;
				}
			}
		}
		for(int i =1; i<y+1; i++){
			for(int j=1; j<x+1; j++){
				if(map[i][j]==1 && visited[i][j]==0){
					stack.push(new Node1926(j, i));
					dfs();
				}
			}
		}
		System.out.println(pcnt-1);
		System.out.println(maxcnt);
	}

}

class Node1926{
	int x, y;
	public Node1926(int x, int y){
		this.x = x;
		this.y = y;
	}
}