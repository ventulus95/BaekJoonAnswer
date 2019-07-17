package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no2583_AreaCheck {
	static int map[][] = new int[104][104];
	static boolean mapcheck[][] = new boolean[104][104];
	static int color = 1;
	static int c[] = new int [10000000];
	static int m; static int n;
	public static void backtrack(int a, int b){
			map[a][b] = color;
			c[color]++;
			mapcheck[a][b] =false;
		
//		System.out.println("a와 b는?? " +a+" "+b);
		if(map[a][b+1]==0 && mapcheck[a][b+1]==true){
			
			backtrack(a,b+1);
		} //우
		if(map[a+1][b]==0 && mapcheck[a+1][b]==true){
			backtrack(a+1,b);
		}// 하단 
		if(map[a][b-1]==0 &&mapcheck[a][b-1]==true){
			backtrack(a,b-1);
		} //좌
		if(map[a-1][b]==0 &&mapcheck[a-1][b]==true){
			backtrack(a-1,b);
		}// 상단 
		
	}
 	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s," ");
		 m = Integer.parseInt(st.nextToken());
		 n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		for(int row=0; row<104; row++){
		Arrays.fill(map[row], -1);
		Arrays.fill(mapcheck[row], false);
		}
		for(int i=1; i<n+1; i++){
			for(int j=1; j<m+1; j++){
				map[i][j]=0;
				mapcheck[i][j] = true;
			}
		}
		
 		while(k-->0){
			String temp = br.readLine();
			StringTokenizer st1 = new StringTokenizer(temp, " ");
			int lx = Integer.parseInt(st1.nextToken());
			int ly = Integer.parseInt(st1.nextToken());
			int rx = Integer.parseInt(st1.nextToken());
			int ry = Integer.parseInt(st1.nextToken());
			for(int l=lx+1; l<rx+1; l++){
				for(int ll =ly+1; ll<ry+1; ll++){
					map[l][ll]=-1;
					mapcheck[l][ll] = false;
				}
			}
		}
 		
 		for(int i=1; i<n+1; i++){
			for(int j=1; j<m+1; j++){
				if(map[i][j] ==0 && mapcheck[i][j]==true){
					backtrack(i,j);
					color++;
				}
			}
		}
 		/*for(int i=1; i<n+1; i++){
			for(int j=1; j<m+1; j++){
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}*/
 		System.out.println(color-1);
 		Arrays.sort(c);
 		for(int i=0; i<10000000; i++){
 			if(c[i]!=0)
 			System.out.print(c[i]+" ");
 		}
 		
 		
	}
}
