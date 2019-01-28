package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no9465_sticker {
	static int cache[];
	static int p[][];
	
	static int sticker(int n){
		if(cache[n-2]==-1){
			sticker(n-2);
		}
		System.out.println("sticker loop: "+n);
//		if(cache[n-3]==-1){
//			sticker(n-3);
//		}
		cache[n]= Math.max(cache[n-2]+p[n][0], Math.max(cache[n-2]+p[n][1], Math.max(cache[n-3]+p[n-1][0], cache[n-3]+p[n-1][1])));
		
		return cache[n];
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0){
			int n = Integer.parseInt(br.readLine());
			cache = new int [n];
			p = new int [n][2];
			String n0 = br.readLine();
			StringTokenizer st = new StringTokenizer (n0, " ");
			String n1 = br.readLine();
			StringTokenizer st1 = new StringTokenizer (n1, " ");
			for(int i =0; i<n; i++){
				p[i][0] = Integer.parseInt(st.nextToken());
				p[i][1] = Integer.parseInt(st1.nextToken());
			}
			Arrays.fill(cache, -1);
			cache[0] = Math.max(p[0][0], p[0][1]);
			cache[1] = Math.max(p[0][0],Math.max(p[0][1],Math.max(p[1][0], p[1][1]) ) );
			sticker(n-1);
			System.out.println(cache[2]);
		}
	}
}
