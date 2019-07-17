package codeBaekJoon;

// 2019.01.25
// dfs로 못풀긴 하는데 가능은 함. 이런 특정 값으로 가는 경우는 bfs사용하는 것이 좋

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class no1697_HideandSeek {
	static int n,k;
	static int count=0;
	static int min = Integer.MAX_VALUE;
	static int visited[];

	static void bfs(int x){
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(x);
		visited[x] =1;
		while(!q.isEmpty()){
			int temp = q.poll();
			System.out.println(temp+" 값과  그 깊이값: "+visited[temp]);
			if(temp==k){
				visited[temp] = visited[temp]-1;;
				break;
			}
			if(temp-1>=0 && visited[temp-1]==0){
				q.offer(temp-1);
				visited[temp-1] = visited[temp]+1;
			}
			if(temp+1<=100000 && visited[temp+1]==0){
				q.offer(temp+1);
				visited[temp+1] = visited[temp]+1;
			}
			if(2*temp<=100000 && visited[2*temp]==0){
				q.offer(2*temp);
				visited[2*temp] = visited[temp]+1;
			}
		}
	}
	
	
	
	static void find(int x){ //DFS로 풀라다가 실패한 것.
		count++;
		System.out.println(x+": is x & count: "+count);
		if(x==k){
			min = Math.min(count, min);
		}
		int dx[] = {1,-1,x};
		for(int i =0; i<3; i++){
			find(x+dx[i]);
		}
		count--;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		StringTokenizer st = new StringTokenizer(a, " ");
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		visited = new int[100001];
		Arrays.fill(visited, 0);
		bfs(n);
		System.out.println(visited[k]);
	}
}
