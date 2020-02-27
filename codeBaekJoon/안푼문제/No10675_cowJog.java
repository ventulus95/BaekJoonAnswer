package codeBaekJoon.안푼문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No10675_cowJog {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int p[] = new int [T];
		int count = 0;
		int v[] = new int [T];
		for(int i=0; i<T; i++){
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s, " ");
			p[i] = Integer.parseInt(st.nextToken());
			v[i] = Integer.parseInt(st.nextToken());
		}
		int vm = v[T-1];
		for(int i=T-1; i>=0; i--){
			if(vm>=v[i]){
				count++;
				vm = v[i];
			}
		}
/*		어경우는 되게 신기한 방식으로 진행되었는데 간단히 이야기하면,
 * 		빠른녀석이 앞에 있는 놈을 지나치려는 순간 속도를 앞에 앞서 있는 소의 속도로 맞춰서 달리는 방식.
 * 		근데 이걸 빠른소 기준으로 잡아서 잡아 먹는 방식이면, 시간복잡도가 넘치는 데 
 * 		역으로 앞에 있는 느린소 기준으로 잡아서 따라잡히는 방식으로 해버리면
 *		이 소보다 빠른 소는 무조건 이 소를 넘을 수는 없고 이 소보다 느린 속도로 달리거나, 같은속도로 
 		달리면, 결국에는 절대 못따라 잡는 그룹이 생기니. 그런 방식으로 계산해서 찾는것.
*/
		System.out.println(count);
	}
}
