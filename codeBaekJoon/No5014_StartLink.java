/** 2020. 4. 10. 오후 5:05:33
 * @author ventulus95
 */
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class No5014_StartLink {
	
	static Queue<Integer> queue = new LinkedList<>();
	static int visited[];
	static int f,s,g,u,d;
	
	static void bfs(){
		while(!queue.isEmpty()){
			int i = queue.poll();
			if(i+u <= f && visited[i+u] == -1){
				queue.add(i+u);
				visited[i+u] = visited[i]+1;
			}
			if(i-d > 0 && visited[i-d] == -1){
				queue.add(i-d);
				visited[i-d] = visited[i]+1;
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tc = br.readLine();
		StringTokenizer st = new StringTokenizer(tc, " ");
		f = Integer.parseInt(st.nextToken());
		s = Integer.parseInt(st.nextToken()); //시작하는 장소. 
		g = Integer.parseInt(st.nextToken()); // 도착하고 싶은 장소.
		u = Integer.parseInt(st.nextToken()); //위로 u만큼 이동 
		d = Integer.parseInt(st.nextToken()); //아래로 d만큼 이동.
		visited = new int[f+1];
		Arrays.fill(visited, -1);
		visited[s] = 0;
		queue.add(s);
		bfs();
		if(visited[g] >=0){
			System.out.println(visited[g]);
		}
		else{
			System.out.println("use the stairs");
		}
	}

}
