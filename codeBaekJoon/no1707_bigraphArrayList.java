package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no1707_bigraphArrayList {
		
		static int v, e;
		static int visit[];
		static ArrayList<ArrayList<Integer>> arrayList;
		static boolean bi;
		public static void dfs(int i, int color){
			visit[i] = color;
			for(int j:arrayList.get(i)){
				if(visit[j] == color){
					bi= false;
				}
				if(visit[j]==0){
					dfs(j, -color);
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
			bi = true;
			arrayList = new ArrayList<>();
			visit = new int [v+1];
			Arrays.fill(visit, 0);
			for(int i=0; i<v+1; i++){
				arrayList.add(new ArrayList<Integer>());
			}
			for(int i =0; i<e; i++){
				String edge = br.readLine();
				StringTokenizer st1 = new StringTokenizer(edge, " ");
				int a = Integer.parseInt(st1.nextToken());
				int b = Integer.parseInt(st1.nextToken());
				arrayList.get(a).add(b);
				arrayList.get(b).add(a);
			}
			for(int i = 1; i<v+1; i++){
				if(!bi){
					break;
				}
				if(visit[i]==0)
				dfs(i, 1);
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
