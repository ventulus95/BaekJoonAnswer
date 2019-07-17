/* 2019.04.24. 분할정복 배낀거. 다시 풀어볼것.
*/
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1074_Z {
	static long count =0;
	static long n,r,c;
	
	static long pow(long x, long n){
		long sum = 1;
		for(int i=0; i<n; i++){
			sum *= x;
		}
		return sum;
	}
	
	static void z(long x, long y, long size){
		if(size==1){
			if(x==r && y==c){
				System.out.println(count);
			}
			count++;
			return;
		}
		z(x, y, size/2);
		z(x,y+size/2 , size/2);
		z(x+size/2, y, size/2);
		z(x+size/2,y+size/2 , size/2);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		StringTokenizer st = new StringTokenizer(a, " ");
		n = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		c  = Integer.parseInt(st.nextToken());
//		System.out.println(pow(2, n));
		z(0,0, pow(2, n));
	}
}
