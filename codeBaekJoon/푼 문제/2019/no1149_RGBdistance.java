package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no1149_RGBdistance {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int cache[][] = new int [T][3];
		int rgb[][] = new int [T][3];
		for(int i = 0; i<T; i++){
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s," ");
			//0 : R 1:G 2:B
			for(int j =0; j<3; j++){
				rgb[i][j]= Integer.parseInt(st.nextToken());
			}
		}
		cache[0][0] = rgb[0][0];
		cache[0][1] = rgb[0][1];
		cache[0][2] = rgb[0][2];
		for(int i=1; i<T; i++){
			cache[i][0] = Math.min(cache[i-1][1]+rgb[i][0], cache[i-1][2]+rgb[i][0]);
			cache[i][1] = Math.min(cache[i-1][0]+rgb[i][1], cache[i-1][2]+rgb[i][1]);
			cache[i][2] = Math.min(cache[i-1][1]+rgb[i][2], cache[i-1][0]+rgb[i][2]);
		}
		System.out.println(Math.min(cache[T-1][0],Math.min(cache[T-1][1], cache[T-1][2])));

	}

}
