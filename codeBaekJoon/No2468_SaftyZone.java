/** 2020. 4. 3. 오후 10:44:58
 * @author ventulus95
 */
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class No2468_SaftyZone {
	
	static int map[][];
	static int sitmulate[][];
	static int dx[] = {0,1,0,-1};
	static int dy[] = {1,0,-1,0};
	static int pcnt = -1;
	static int maxcnt = 1;
	static Stack<Node2468> stack = new Stack<>();

	static void dfs(int dept){
		int cnt =0;
		while(!stack.isEmpty()){
			Node2468 temp =stack.pop();
			sitmulate[temp.y][temp.x] = pcnt;
			for(int i=0; i<4; i++){
				if(sitmulate[temp.y+dy[i]][temp.x+dx[i]] > dept){
					stack.push(new Node2468(temp.x+dx[i], temp.y+dy[i]));
					sitmulate[temp.y][temp.x] = pcnt;
				}
			}
		}
		pcnt--;
		
	}
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		map = new int [n+2][n+2];
		sitmulate = new int [n+2][n+2];
		for(int i=0; i<n+2; i++){
			Arrays.fill(map[i], 0);
		}
		StringTokenizer st;
		int maxWater = 0;
		for(int i=1; i<n+1; i++){
			String t = br.readLine();
			st = new StringTokenizer(t, " ");
			for(int j=1; j<n+1; j++){
				map[i][j] = Integer.parseInt(st.nextToken());
				maxWater = Math.max(maxWater, map[i][j]);
			}
		}
		for(int i =0; i<maxWater; i++){
			for(int a =1; a<n+1; a++){
				for(int b=1; b<n+1; b++){
					sitmulate[a][b] = map[a][b];
				}
			}
			pcnt = -1;
			for(int a =1; a<n+1; a++){
				for(int b=1; b<n+1; b++){
					if(sitmulate[b][a] > i ){
						stack.push(new Node2468(a, b));
						dfs(i);
					}
				}
			}
			maxcnt = Math.max(Math.abs(pcnt)-1, maxcnt);
		}
		System.out.println(maxcnt);
	}

}



class Node2468{
	int x, y;
	public Node2468(int x, int y){
		this.x = x;
		this.y = y;
	}
}
