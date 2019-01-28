package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class no2164_card2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		Queue<Integer> q = new LinkedList();
		for(int i =1; i<=T; i++){
			q.offer(i);
		}
		while(q.size()>1){
			q.poll();
			int up = q.poll();
			q.offer(up);
		}
		System.out.println(q.poll());
	}
}
