/* 2019.02.08 하다가 도중에 때려침. 뭔가 부족함 코딩이...
*/
package codeBaekJoon.안푼문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class no1011_FlymetotheAlphaCentauri {
	static int s,e;
	static int visited[];
	static void bfs(int x){
		Queue<Integer> q = new LinkedList<Integer>();
		int prev = s;
		visited[x] =1;
		q.offer(x);
		while(!q.isEmpty()){
			int temp = q.poll();
			if(visited[temp] - visited[prev] ==1){
				int k =temp - prev ;
				if(k-1>0){
					q.offer(temp+k-1);
					visited[temp+k-1] = visited[temp]+1;
				}
				q.offer(temp+k);
				visited[temp+k] = visited[temp]+1;
				q.offer(temp+k+1);
				visited[temp+k+1] = visited[temp]+1;
			}
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0){
			String tc = br.readLine();
			StringTokenizer st = new StringTokenizer(tc, " ");
			s = Integer.parseInt(st.nextToken());
			e = Integer.parseInt(st.nextToken());
			visited = new int[e+1];
			Arrays.fill(visited, 0);
			for(int i =0; i<s; i++){
				visited[i] = -1;
			}
			bfs(s+1);
			System.out.println(visited[e-1]+1);
		}
	}
}
