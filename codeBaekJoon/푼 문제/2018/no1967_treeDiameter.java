package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class no1967_treeDiameter {
	static int[] visit;
	static ArrayList<TreeMap<Integer, Integer>> arrayList;
	static int n,u,r;
	public static void dfs(int i, int w){
		visit[i] = w;
		if(visit[i]>r){
			r=visit[i];
			u=i;
		}
		TreeMap<Integer, Integer> tmp = arrayList.get(i);
		for(int j: tmp.keySet()){	
			if(visit[j] == -1){
				dfs(j, w+tmp.get(j));
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		visit = new int[n+1];
		arrayList = new ArrayList<>();
		for(int j=0; j<n+1;j++){
			arrayList.add(new TreeMap<Integer, Integer>());
		}
		Arrays.fill(visit, -1);
		for(int i=0; i<n-1; i++){
			String edge = br.readLine();
			StringTokenizer st1 = new StringTokenizer(edge," ");
			int vertex = Integer.parseInt(st1.nextToken());
			int v = Integer.parseInt(st1.nextToken());
			int w= Integer.parseInt(st1.nextToken());
			arrayList.get(vertex).put(v, w);
			arrayList.get(v).put(vertex, w);
			}
		dfs(1,0);
		r=0;
		Arrays.fill(visit, -1);
		dfs(u,0);
		System.out.println(r);
		
	}
}
