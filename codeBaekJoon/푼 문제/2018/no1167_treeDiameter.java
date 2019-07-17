package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class no1167_treeDiameter {
	static int[] visit;
	static ArrayList<TreeMap<Integer, Integer>> arrayList;
	static int n,u,r;
	public static void dfs(int i, int w){
		visit[i] = w;
		System.out.println("dfs i: "+i);
		for(int j=1; j<n+1; j++){
			System.out.print(visit[j]+" ");
		}
		System.out.println();
//		System.out.println("dfs in visit[i] not in if: "+visit[i]);
		System.out.println("dfs r: "+r);
		if(visit[i]>r){
			r=visit[i];
			u=i;
		}
		TreeMap<Integer, Integer> tmp = arrayList.get(i);
		for(int j: tmp.keySet()){	
			if(visit[j] == -1){
				System.out.println(j+" "+w+" "+tmp.get(j));
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
		for(int i=0; i<n; i++){
			String edge = br.readLine();
			StringTokenizer st1 = new StringTokenizer(edge," ");
			int vertex = Integer.parseInt(st1.nextToken());
			int v = Integer.parseInt(st1.nextToken());
			while(v!=-1){
				int w= Integer.parseInt(st1.nextToken());
				arrayList.get(vertex).put(v, w);
				arrayList.get(v).put(vertex, w);
				v = Integer.parseInt(st1.nextToken());
			}

		}
		dfs(1,0);
		System.out.println(r+" "+u);
		r=0;
		Arrays.fill(visit, -1);
		System.out.println("start");
		dfs(u,0);
		System.out.println(r);
//		for(int i=1; i<=n; i++){
//		TreeMap<Integer, Integer> tmp = arrayList.get(i);
//		System.out.print(i+"의 값: ");
//		for(int j: tmp.keySet()){	
//			System.out.print(tmp.get(j)+" ");
//		}
//		System.out.println();
//		}
		
	}
}
