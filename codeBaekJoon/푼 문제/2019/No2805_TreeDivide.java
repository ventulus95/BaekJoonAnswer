/* 2019.04.06 이분탐색 공부.
*/
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2805_TreeDivide {
	static long f (long X){
		long sum = 0;
		for(int i=0; i<k; i++){
			if(c[i]-X>0)
			sum += c[i]-X;
		}
		return sum;
	}
	
	static long binsearch(){
		long lo = 0, hi = 1000000000;
		hi++;
		System.out.println(hi);
		int count =0;
		while(lo+1<hi){
			long mid = (lo+hi)/2;
//			System.out.println("count: "+count+" and mid: "+mid+" and hi: "+hi);
			if(f(mid)>=n){
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
	static int n,k;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		StringTokenizer st = new StringTokenizer(a, " ");
		k = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		String t = br.readLine();
		st = new StringTokenizer(t, " ");
		for(int i =0; i<k; i++){
			c[i] = Integer.parseInt(st.nextToken());
		}
		System.out.println(binsearch());
	}
}
