package codeBaekJoon.안푼문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no2331_repeatNum {
	static int visit[];
	static int a, p;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tc = br.readLine();
		StringTokenizer st = new StringTokenizer(tc, " ");
		a = Integer.parseInt(st.nextToken());
		p = Integer.parseInt(st.nextToken());
		visit = new int [295246];
		Arrays.fill(visit, -1);
		int count =0;
		int check[] = new int [295246];
		while(true){  // 로직과정을 한번 쭉따라가자.
			if(visit[a]>0)
				break; // 그래서만약에 방문한곳 또 방문하면 결국에 한바퀴돌아서 자기 수로왔다는 뜻이므로 멈춘다.
			check[count] = a; //체크배열은 내가 몇번째에 무슨 수를 가졌는지 체크하는 수이다.
			
			visit[a] = 1;
			count++; 
			int sum =0; 
			while(a>0){
				sum+=Math.pow(a%10, p);
				a/=10;
			}
			a =sum;	
		}
		for(int i =0; i<295246; i++){
			if(check[i] == a){ // 그래서 그수가 뭔지 체크배열을 돌면서 언제 그수가 시작하는지 확
				//그래서 보니까 원래수가된 수 즉 57 2일때는 37인데 그러면 그거전까지 모든수는 check는 사이클밖의 수니까 그렇게 넘겨버리기~
				System.out.print(i);
				break;
			}
		}
	}

}
