// 19.01.21 월 : dfs & bfs 복

package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class no1260_DFSBFS_treeMap {

	static int map[][];
	static boolean[] visit;
	static ArrayList<TreeMap<Integer, Integer>> arrayList;
	static int n,m,v;

	public static void dfs(int i){
		visit[i] = true;
		System.out.print(i+" ");
		TreeMap<Integer, Integer> tmp = arrayList.get(i);
		for(int j: tmp.keySet()){	
			if(visit[j] == false){
				dfs(j);
			}
		}
	}


	public static void bfs(int i){
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(i);
		visit[i] = true;
		//방문한 위치는 알아야하니까, 그것을 체크하기 위해서 visit가 필요. 
		while(!q.isEmpty()){
			int temp = q.poll();
			//첫번째 방문한 위치는 빼주기로 한다.
			System.out.print(temp+" ");
			//대신 이번에는 bfs도 treeMap을 통해서 구현해보자. 
			TreeMap<Integer, Integer> tmp = arrayList.get(temp);
			for(int j: tmp.keySet()){	 //arrayList에서 i와 연결 값을 가지는 j를 모두 찾는 행위.
//				System.out.println(j);
				if(visit[j] == false){
					q.offer(j); //bfs는 어차피 연결된 거 모두 다 넣을 것이기때문에 그렇게 찾게 될것이다.
					visit[j] = true; 
				}
			}
//			System.out.println("end");

		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s," ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		v = Integer.parseInt(st.nextToken());
		map =new int[n+1][n+1];
		visit = new boolean[n+1];
		arrayList = new ArrayList<>();
		for(int j=0; j<n+1;j++){
			Arrays.fill(map[j], 0);
			arrayList.add(new TreeMap<Integer, Integer>());
		}
		Arrays.fill(visit, false);
		for(int i=0; i<m; i++){
			String edge = br.readLine();
			StringTokenizer st1 = new StringTokenizer(edge," ");
			int a = Integer.parseInt(st1.nextToken());
			int b = Integer.parseInt(st1.nextToken());
			map[a][b]=1;
			map[b][a]=1;
			arrayList.get(a).put(b, a);
			arrayList.get(b).put(a, b);

		}
		dfs(v);
		System.out.println();
		Arrays.fill(visit, false);
		bfs(v);
	}
}
