/** 2019. 10. 13. 오전 12:46:30
 * @author ventulus95
 */
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No2804_crossword {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tc = br.readLine();
		StringTokenizer st = new StringTokenizer(tc, " ");
		String A = st.nextToken();
		String B = st.nextToken();
		int x=-1, y=-1;
		for(int i=0; i<A.length(); i++){
			for(int j=0; j<B.length(); j++){
				if(A.charAt(i)==B.charAt(j)){
					x = i;
					y = j;
					break;
				}
			}
			if(x>=0){
				break;
			}
		}
		char map [][] = new char[B.length()][A.length()];
		for(int i =0; i<B.length(); i++)
			Arrays.fill(map[i], '.');
		for(int i=0; i<B.length(); i++){
			map[i][x] = B.charAt(i);
			for(int j=0; j<A.length(); j++){
				map[y][j] = A.charAt(j);
			}
		}
		
		for(int i=0; i<B.length(); i++){
			for(int j=0; j<A.length(); j++){
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
			
	}

}
