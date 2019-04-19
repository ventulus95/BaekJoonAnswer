/* 2019.04.09 이분탐색 
 * 받는 정수 long타입 안해서 11번넘게 계속 풀음 ㅅㅂ;
*/
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1072_Game {
	static long f (long n){
		long sum = ((y+n)*100)/(x+n) ;
		return sum;
	}

	static long binsearch(){
		long lo = 0, hi = 2000000000;
		hi++;
		int count =0;
		while(lo+1<hi){
			long mid = (lo+hi)/2;
			System.out.println("count: "+count+" and fmid: "+f(mid)+" and lo: "+lo+" and hi: "+hi);
			if(f(mid)<= ((y*100)/x) ){
				lo = mid;
			}
			else{
				hi = mid;
			}
			count++;
		}
		return hi;
	}
	static long x,y;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a ;
		while ( (a= br.readLine()) != null && a.length()!=0) {
			StringTokenizer st = new StringTokenizer(a, " ");
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			if(((y*100)/x)>=99 ){
				System.out.println(-1);
			}
			else{
				System.out.println(binsearch());
			}
		}
	}
}
