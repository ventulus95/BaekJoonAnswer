/* 2019.02.05 화 간단한 수학문제 dp로 어렵게 풀어보기  
*/
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no2163_chocolateDivide {
	static int n,m,cache[][];

	static int div(int x, int y){

		if(cache[x][y] != -1){
			return cache[x][y];
		}
		int d1= 0;
		int d2 = 0;
		if(x>=y){
			d1 = cache[x/2][y];
			d2 = cache[x-(x/2)][y];
			//			System.out.println("check in "+x+" "+y+" "+d1+" "+d2);
			if(d1<0 && d2<0){
				return cache[x][y] = div(x/2, y)+ div(x-(x/2), y)+1;
			}
			else if(d1<0){
				return cache[x][y] = div(x/2, y)+cache[x-(x/2)][y] +1;
			}
			else if(d2<0){
				return cache[x][y] = cache[x/2][y]+ div(x-(x/2), y)+1;
			}
			else{
				return cache[x][y] = cache[x/2][y]+ cache[x-(x/2)][y]+1;
			}
		}
		else{// x<y
			d1 = cache[x][y/2];
			d2 = cache[x][y-(y/2)];
			if(d1<0 && d2<0){
				return cache[x][y] = div(x, y/2)+ div(x, y-(y/2) )+1;
			}
			else if(d1<0){
				return cache[x][y] = div(x, y/2)+cache[x][y-(y/2)] +1;
			}
			else if(d2<0){
				return cache[x][y] = cache[x][y/2]+ div(x, y-(y/2))+1;
			}
			else{
				return cache[x][y] = cache[x][y/2]+ cache[x][y-(y/2)]+1;
			}
		}
		//		System.out.println("체크아웃 "+x+" "+y+"cache"+cache[x][y]);

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String t = br.readLine();
		StringTokenizer st=  new StringTokenizer (t, " ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		cache = new int [n+1][m+1];
		for(int i=0; i<n+1; i++){
			Arrays.fill(cache[i], -1);
		}
		for(int i =1; i<n+1; i++){
			cache[i][1] = i-1;
		}
		for(int j =1; j<m+1; j++){
			cache[1][j] = j-1;
		}
		div(n,m);
		System.out.println(cache[n][m]);
	}
}
