package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no10451_permutationCycle {
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
		int T = Integer.parseInt(br.readLine());
		while(T-->0){
			v = Integer.parseInt(br.readLine());
			e = v;
			map =new int[v+1][v+1];
			visit = new boolean[v+1];
			for(int j=0; j<v+1;j++){
				Arrays.fill(map[j], 0);
			}
			Arrays.fill(visit, false);
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s, " ");
			int t=1;
			while(st.hasMoreElements()){
				int en = Integer.parseInt(st.nextToken());
				map[t][en] =1;
				map[en][t] =1;
				t++;
			}
			
			int count =0;
			for(int k=1; k<=v; k++){
				if(visit[k]==false){
					dfs(k);
//					System.out.println("나는 k이다 :"+k);
					count++;
				}
			}
			System.out.println(count);
		}//
	}//while end
}
