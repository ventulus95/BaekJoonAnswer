package codeBaekJoon.안푼문제;
// 2019.01.14

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no1351_infinite {
/*	이문제가 문제가 뭐냐면, 이 방법으로 풀라면 충분히 풀 수 있지만, 
 * 이 메모리초과가 나는 상황에서는  이문제를 풀 수 없다.
 * 그러니까 완전히 다른 방식으로 문제를 풀어야함.
 * 그대체제로 hashMap이용하는 것.
	http://am003507.tistory.com/112 확인하고 고쳐서 맞추면 될듯.
	
	
*/	static int [] cache = new int[100000000];
	static int p =0;
	static int q =0;
	static int search(int k){
//		System.out.println("this is :"+k);
		if(cache[k]!=-1){
//			System.out.println("return cache["+k+"]: "+cache[k]);
			return cache[k];
		}
		if(cache[k/p]==-1){
//			System.out.println("k/p");
			search(k/p);
		}
		if(cache[k/q]==-1){
//			System.out.println("k/q");
			search(k/q);
		}
		cache[k] = cache[k/q]+cache[k/p];
		return cache[k];
	}
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s, " ");
		Arrays.fill(cache, -1);
		cache[0] =1;
		int n = Integer.parseInt(st.nextToken());
		p = Integer.parseInt(st.nextToken());
		q = Integer.parseInt(st.nextToken());
		if(cache[n/p]==-1){
			search(n/p);
		}
		if(cache[n/q]==-1){
			search(n/q);
		}
		int result = cache[n/p] + cache[n/q];
		System.out.println(result);
	}
}
