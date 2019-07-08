/* 2019.04.24. 분할정복 배낀거. 다시 풀어볼것.
*/
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1992_QuadTree {
	static long count =0;
	static int n;
	static int[][] map;
	

	static void quad(int x, int y, int size){
		boolean check = true;
		for(int i=x; i<x+size&&check; i++){
			for(int j=y; j<y+size&&check; j++){
				if(map[x][y] != map[i][j]) 
					check = false;
			}
		}
		if(check==true){
			System.out.print(map[x][y]);
		}
		else{
		System.out.print("(");
		quad(x, y, size/2);
		quad(x,y+size/2 , size/2);
		quad(x+size/2, y, size/2);
		quad(x+size/2,y+size/2 , size/2);
		System.out.print(")");
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		map = new int [n][n];
		System.out.println();
		for(int i=0; i<n; i++){
			String a = br.readLine();
			for(int j=0; j<n; j++){
				map[i][j] = a.charAt(j)-'0';
			}
		}
		quad(0,0,n);
	}
}
