package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No16673_KUCommoonWine {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st= new StringTokenizer(s, " ");
		int c = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		int sum = 0;
		for(int i=0; i<=c; i++){
			sum += i*k;
			sum += Math.pow(i, 2)*p;
		}
		System.out.println(sum);
	}
}
