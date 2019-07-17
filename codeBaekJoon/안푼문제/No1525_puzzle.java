package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class No1525_puzzle {
	static int [][] map = new int [5][5];
	static int x, y;

	static void bfs(){
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0; i<5; i++){
			Arrays.fill(map[i], -1);
		}

		for(int i =0; i<3; i++){
			String t = br.readLine();
			StringTokenizer st = new StringTokenizer(t, " ");
			for(int j = 0; j<3; j++){
				map[i+1][j+1] = Integer.parseInt(st.nextToken());
				if( map[i+1][j+1] ==0 ){
					x=i+1;
					y=j+1;
				}
			}
		}
		/*for(int i = 1; i<4; i++){
			for(int j=1; j<4; j++){
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}*/


	}
}
