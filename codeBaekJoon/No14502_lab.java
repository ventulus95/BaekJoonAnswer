package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
class virus{
	int x;
	int y;
	public virus(int x, int y){
		this.x = x;
		this.y= y;
	}
}

public class No14502_lab {
	static int n,m;
	static int map[][];
	static int smap[][];
	static boolean visit[][], svisit[][];
	static int dx[] ={0,1,0,-1};
	static int dy[] = {1,0,-1,0};

	static void bfs(){
		Queue<virus> q = new LinkedList<virus>();
		for(int i =1; i<n+1; i++){
			for(int j=1; j<m+1; j++ ){
				if(map[i][j]==2){
					visit[i][j] = false;
					q.offer(new virus(i, j));
				}
			}
		}
		while(!q.isEmpty()){
			virus temp = q.poll();
			map[temp.x][temp.y] =2;
			visit[temp.x][temp.y] =false;
			for(int i=0; i<4; i++ ){
				if(map[temp.x+dx[i]][temp.y+dy[i]] ==0 && visit[temp.x+dx[i]][temp.y+dy[i]]==true){
					q.offer(new virus(temp.x+dx[i], temp.y+dy[i]));
				}
			}
		}
	}


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tc = br.readLine();
		StringTokenizer st = new StringTokenizer (tc," ");
		n = Integer.parseInt(st.nextToken()); 
		m = Integer.parseInt(st.nextToken());
		map = new int [n+2][m+2];
		smap = new int [n+2][m+2];
		visit = new boolean [n+2][m+2];
		svisit = new boolean [n+2][m+2];
		for(int i=0; i<n+2; i++){
			Arrays.fill(map[i], -1);
			Arrays.fill(smap[i], -1);
			Arrays.fill(visit[i], false);
			Arrays.fill(svisit[i], false);
		}
		for(int i=1; i<n+1; i++){
			String t = br.readLine();
			StringTokenizer st1 = new StringTokenizer(t, " ");
			for(int j=1; j<m+1; j++){
				int k = Integer.parseInt(st1.nextToken());
				map[i][j] = k;
				smap[i][j] = k;
				if(k ==1){
					visit[i][j] = false;
					svisit[i][j] = false;
				}
				if(k==0|| k==2){
					visit[i][j] = true;
					svisit[i][j] = true;
				}
			}
		}
		///3개의 벽을 만드는 함수를 만들든, 아니면 뭐 ..bfs에서 만들든 뭐 런식으로 
		bfs();
		for(int i=1; i<n+1; i++){
			for(int j=1; j<m+1; j++){
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}

	}
}
