/* 2019.04.09 이분탐색 
 * 최대값 처리를 재대로 안했음. 예를들면, 
 * 예산은 널널한데 지방단체의 돈이 작아서 그 합이 예산을 넘지않거나, 같은경우를 처리하지 않음.
 * 
*/
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2512_Budget {
	static long f (long x){
		long sum  =0;
		for(int i=0; i<n; i++){
			if(x -c[i]>=0){
				sum+=c[i];
			}
			else{
				sum+=x;
			}
		}
		return sum;
	}

	static long binsearch(){
		long lo = 0, hi = 1000000000;
		hi++;
		int count =0;
		while(lo+1<hi){
			long mid = (lo+hi)/2;
			System.out.println("count: "+count+" and fmid: "+f(mid)+" and lo: "+lo+" and hi: "+hi);
			if(f(mid)<=max){
				lo = mid;
			}
			else{
				hi = mid;
			}
			count++;
		}
		return lo;
	}
	static int c[] = new int [10000001];
	static int n, max,cmax;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		String a=br.readLine() ;
		StringTokenizer st = new StringTokenizer(a, " ");
		for(int i=0; i<n; i++){
			c[i] = Integer.parseInt(st.nextToken());
			cmax = Math.max(c[i], cmax);
		}
		max = Integer.parseInt(br.readLine());
		if(max>=f(cmax)){
			System.out.println(cmax);
		}
		else{
			System.out.println( binsearch());
		}
	}
}
