/* 2019.04.03 이분탐색 첫문제 
*/
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1654_StringCut {
	static long f (long X){
		long sum = 0;
		for(int i=0; i<k; i++){
			sum += c[i]/X;
		}
		return sum;
	}
	
	static long binsearch(){
		long lo = 1, hi = Integer.MAX_VALUE;
//		System.out.println(lo);
//		hi++;
		System.out.println(hi);
		int count =0;
		while(lo+1<hi){
			long mid = (lo+hi)/2;
//			System.out.println("count: "+count+" and mid: "+mid+" and lo: "+lo);
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
	static int s[] = new int [10000001];
	static int n,k;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		StringTokenizer st = new StringTokenizer(a, " ");
		k = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		for(int i =0; i<k; i++){
			c[i] = Integer.parseInt(br.readLine());
		}
		System.out.println(binsearch());
	}
}
