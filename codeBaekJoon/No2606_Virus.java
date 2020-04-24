/** 2020. 3. 9. 오후 8:20:09
 * @author ventulus95
 */
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class No2606_Virus {
	
	static ArrayList<HashMap<Integer, Integer>> nodelist;
	static boolean[] visited;
	
	static void dfs(int n){
		visited[n] = true;
		HashMap<Integer, Integer> temp = nodelist.get(n);
		for(int check : temp.keySet()){
			if(visited[check] == false){
				dfs(check);
			}
		}
		
	}
 
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int t = Integer.parseInt(br.readLine());
		visited = new boolean[n+1];
		nodelist = new ArrayList<HashMap<Integer, Integer>>();
		for(int i=0; i<=n; i++){
			nodelist.add(new HashMap<Integer, Integer>());
		}
		StringTokenizer st;
		for(int i =0; i<t; i++){
			String tc = br.readLine();
			 st = new StringTokenizer(tc, " ");
			 int a = Integer.parseInt(st.nextToken());
			 int b = Integer.parseInt(st.nextToken());
			 nodelist.get(a).put(b, a);
			 nodelist.get(b).put(a, b);
		}
		dfs(1);
		int cnt = 0;
		for(int i =2; i<=n; i++){
			if(visited[i]==true)
				cnt++;
		}
		System.out.println(cnt);

	}

}
