package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No14667_CowCross1 {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cow[] = new int[11];
		int cnt = 0;
		Arrays.fill(cow, -1);
		for(int i=0; i<n; i++){
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer (s, " ");
			int cowindex = Integer.parseInt(st.nextToken());
			int pos = Integer.parseInt(st.nextToken());
			if(cow[cowindex]==-1){
				cow[cowindex] = pos;
			}
			else{
				if(cow[cowindex]!=pos){
					cnt++;
					cow[cowindex]=pos;
				}
			}
		}
		System.out.println(cnt);
	}
}
