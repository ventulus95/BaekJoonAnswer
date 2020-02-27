package codeBaekJoon.안푼문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2022_ladder {
	static double f (double x){
		long sum  =0;
		return sum;
	}

	static double binsearch(){
		long lo = 0, hi = 1000000000;
		hi++;
		int count =0;
		while(lo+1<hi){
			long mid = (lo+hi)/2;
			System.out.println("count: "+count+" and fmid: "+f(mid)+" and lo: "+lo+" and hi: "+hi);
			if(f(mid)<=c){
				lo = mid;
			}
			else{
				hi = mid;
			}
			count++;
		}
		return lo;
	}
	static double x, y, c;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a=br.readLine() ;
		StringTokenizer st = new StringTokenizer(a, " ");
		x = Double.parseDouble(st.nextToken());
		y = Double.parseDouble(st.nextToken());
		c = Double.parseDouble(st.nextToken());
		
		System.out.println( binsearch());
	}
}
