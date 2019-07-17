package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no5063_TGN {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T= Integer.parseInt(br.readLine());
		while(T-->0){
			String t =br.readLine();
			StringTokenizer st = new StringTokenizer(t, " ");
			int r = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			if(e-c>r){
				System.out.println("advertise");
			}
			if(e-c==r){
				System.out.println("does not matter");
			}
			if(e-c<r){
				System.out.println("do not advertise");
			}
		}

	}

}
