package codeBaekJoon.안푼문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no9466_termproject {
	static int[] visit;
	static ArrayList<ArrayList<Integer>> arrayList;
	static int v,e;

	public static void dfs(int i){
		visit[i] = arrayList.get(i).size();
		for(int j:arrayList.get(i)){
			if(visit[j]<0){
				dfs(j);
			}
		}
		//		System.out.println("저는 방문한 위치를 알려주는 아이입니다."+i);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0){
			v = Integer.parseInt(br.readLine());
			e = v;
			visit = new int[v+1];
			Arrays.fill(visit, -1);
			arrayList = new ArrayList<>();
			for(int i=0; i<v+1; i++){
				arrayList.add(new ArrayList<Integer>());
			}
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s, " ");
			int t=1;
			while(st.hasMoreElements()){
				int en = Integer.parseInt(st.nextToken());
				arrayList.get(t).add(en);
				t++;
			}
			for(int k=1; k<=v; k++){
				if(visit[k]<0){
					dfs(k);
					//					System.out.println("나는 k이다 :"+k);
				}
			}
		}//
	}//while end
}
