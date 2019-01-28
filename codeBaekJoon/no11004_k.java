package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no11004_k {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s," ");
		int N = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		Long arr[] = new Long[N];
		String n = br.readLine();
		StringTokenizer st2 = new StringTokenizer(n, " ");
		int i = 0;
		while(st2.hasMoreTokens()){
			arr[i]=Long.parseLong((st2.nextToken()));
			i++;
		}
		Arrays.sort(arr);
		System.out.println(arr[k-1]);
	}
}
