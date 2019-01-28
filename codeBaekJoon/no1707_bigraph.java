package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no1707_bigraph {
		static int map [][];
		static int visit[];
		static int v, e;
		static int check =0;
		static boolean bi;
		public static void dfs(int i){
			visit[i] = check;
			check++;
			check = check %2;
			for(int j =1; j<v+1; j++){
				if(map[i][j] == 1 && visit[j]==visit[i]){
					bi = false;
					return;
				}
				if(map[i][j] == 1 && visit[j]<0){
					dfs(j); // 내가 찾은 경로가 만약에 다른 경로가 있으면 바로 다음 곳으로 이동시키고 만약에 없으면, 다시 리커해서 돌아오는 방식임.
				}
				
				
			}


		}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0){
			String tc = br.readLine();
			StringTokenizer st = new StringTokenizer(tc, " ");
			v = Integer.parseInt(st.nextToken());
			e = Integer.parseInt(st.nextToken());
			map = new int [v+1][v+1];
			visit = new int [v+1];
			for(int i=1; i<v+1; i++){
				Arrays.fill(map[i], 0);
			}
			Arrays.fill(visit, -1);
			bi = true;
			for(int i =0; i<e; i++){
				String edge = br.readLine();
				StringTokenizer st1 = new StringTokenizer(edge, " ");
				int a = Integer.parseInt(st1.nextToken());
				int b = Integer.parseInt(st1.nextToken());
				map[a][b] = map[b][a] =1;
			}
			for(int i = 1; i<v+1; i++){
				if(!bi){
					break;
				}
				if(visit[i]<0)
				dfs(i);
			}
			if(bi){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}
}
