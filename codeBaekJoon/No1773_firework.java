/** 2019. 10. 14. 오후 10:18:54
 * @author ventulus95
 */
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No1773_firework {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tc = br.readLine();
		int fire[] = new int [ 2000001];
		Arrays.fill(fire, -1);
		StringTokenizer st = new StringTokenizer(tc, " ");
		int n = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		for(int i =1; i<=c; i++){
			fire[i]++;
		}
		for(int i=0; i<n; i++){
			int check = Integer.parseInt(br.readLine());
			for(int j=check; j<=c; j+=check){
				fire[j]++;
			}
		}
		int sum = 0;
		for(int i =1; i<=c; i++){
			if(fire[i]>0){
				sum++;
			}
		}
		System.out.println(sum);
		
	}

}
