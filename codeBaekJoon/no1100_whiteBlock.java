package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no1100_whiteBlock {
	static int Wmap[][] = {{1,0,1,0,1,0,1,0},
			{0,1,0,1,0,1,0,1},
			{1,0,1,0,1,0,1,0},
			{0,1,0,1,0,1,0,1},
			{1,0,1,0,1,0,1,0},
			{0,1,0,1,0,1,0,1},
			{1,0,1,0,1,0,1,0},
			{0,1,0,1,0,1,0,1},};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";
		int count =0;
		for(int i =0; i<8; i++){
			s = br.readLine();
			for(int j=0; j<8; j++){
				if(s.charAt(j)=='F'&&Wmap[i][j]==1){
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
