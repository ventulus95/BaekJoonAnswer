package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no11724_connectedComponent {
	static int map[][];
	static boolean[] visit;
	static int v,e;
	
	public static void dfs(int i){
		visit[i] = true;
//		System.out.println("저는 방문한 위치를 알려주는 아이입니다."+i);
			for(int j =1; j<v+1; j++){
				if(map[i][j] == 1 && visit[j]==false){
					dfs(j); // 내가 찾은 경로가 만약에 다른 경로가 있으면 바로 다음 곳으로 이동시키고 만약에 없으면, 다시 리커해서 돌아오는 방식임.
				}
			}
			
	
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s," ");
		v = Integer.parseInt(st.nextToken());
		e = Integer.parseInt(st.nextToken());
		map =new int[v+1][v+1];
		visit = new boolean[v+1];
		for(int j=0; j<v+1;j++){
			Arrays.fill(map[j], 0);
		}
		Arrays.fill(visit, false);
		for(int i=0; i<e; i++){
			String edge = br.readLine();
			StringTokenizer st1 = new StringTokenizer(edge," ");
			int a = Integer.parseInt(st1.nextToken());
			int b = Integer.parseInt(st1.nextToken());
			map[a][b]=1;
			map[b][a]=1;
		}
		int count =0;
		for(int k=1; k<=v; k++){
			if(visit[k]==false){
				dfs(k);
//				System.out.println("나는 k이다 :"+k);
				count++;
			}
		}
		System.out.println(count);
	}
	
}
