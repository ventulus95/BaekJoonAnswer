/*2018.12.31에 풀고 2019.01.26에  다시 풀었다.
 * dfs로 풀었던걸 bfs로 풀어봄.
 */
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class eode{
	int x;
	int y; 

	public eode(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class no2667_aptnumbering {
	static int map[][];
	static boolean[][] visit;
	static int cnt =1;
	static int sort[] = new int [625];
	static int dx[] = {0, 1, 0,-1};
	static int dy[] = {1, 0,-1, 0};


	public static void bfs(int i, int j){
		Queue<eode> q = new LinkedList<eode>();
		q.offer(new eode(i,j));
		while(!q.isEmpty()){
			eode temp = q.poll();
			if(visit[temp.x][temp.y]==false){
			map[temp.x][temp.y] = cnt;
			sort[cnt]++;
//			System.out.println(temp.x+", "+temp.y);
//			System.out.println(cnt+": cnt 값 & "+sort[cnt]+" sort[cnt]값  ");
			visit[temp.x][temp.y] = true;
			}
			for(int x=0; x<4; x++ ){
				if(map[temp.x+dx[x]][temp.y+dy[x]] ==1 && visit[temp.x+dx[x]][temp.y+dy[x]]==false){
					q.offer(new eode(temp.x+dx[x], temp.y+dy[x]));
				}
			}
		}

	}

	public static void dfs(int i, int j){
		map[i][j] = cnt;
		sort[cnt]++;
		visit[i][j] = true;
		if(map[i+1][j] ==1 && visit[i+1][j]==false){
			dfs(i+1,j);
		}
		if(map[i-1][j] ==1 && visit[i-1][j]==false){
			dfs(i-1,j);
		}
		if(map[i][j+1] ==1 && visit[i][j+1]==false){ 
			dfs(i,j+1);
		}
		if(map[i][j-1] ==1 && visit[i][j-1]==false){
			dfs(i,j-1);
		}


		// 상하좌우 

		if(map[i-1][j-1] ==1 && visit[i-1][j-1]==false){
			dfs(i-1,j-1);
		}
		if(map[i+1][j-1] ==1 && visit[i+1][j-1]==false){
			dfs(i+1,j-1);
		}

		if(map[i+1][j+1] ==1 && visit[i+1][j+1]==false){
			dfs(i+1,j+1);
		}
		if(map[i-1][j+1] ==1 && visit[i-1][j+1]==false){
			dfs(i-1,j+1);
		}
		// 대각선도 따져줍시다. 
		//		System.out.println("저는 방문한 위치를 알려주는 아이입니다."+i+" "+j+" "+cnt);


	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		map =new int[N+2][N+2];
		visit= new boolean[N+2][N+2];
		for(int in =0; in<N+2; in++){
			Arrays.fill(map[in], 0);
		}
		for(int ss=1; ss<N+1; ss++){
			String s = br.readLine();
			for(int v=0; v<s.length(); v++){
				map[ss][v+1] = s.charAt(v)-'0';
			}
		}

		for(int i=1; i<N+1; i++){
			for(int j=1; j<N+1; j++){
				if(map[i][j] ==1 && visit[i][j]==false){
					bfs(i,j);
					cnt++;
				}
			}
		}
		System.out.println(cnt-1);
		int [] a = new int [cnt];
		for(int i =1; i<cnt; i++){
			a[i] = sort[i];
		}
		Arrays.sort(a);
		for(int a1=1; a1<cnt; a1++){
			System.out.println(a[a1]);
		}
//		for(int i =1; i<N+1; i++){
//			for(int j=1; j<N+1; j++){
//				System.out.print(map[i][j]);
//			}
//			System.out.println();
//		}
	}

}
