package codeBaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No1912_sequenceSum {
	static int n;
	static int cache[] = new int[1000005];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(br.readLine());
		int num[] = new int[n+1];
		Arrays.fill(cache, -1);
		String tc = br.readLine();
		StringTokenizer st = new StringTokenizer(tc," ");
		for(int i=1; i<n+1; i++){
			num[i] = Integer.parseInt(st.nextToken());
			cache[i] = num[i];
		}
		for(int i=2; i<n+1; i++){
			cache[i] = Math.max(num[i], num[i]+cache[i-1]);
			
		}
		int max = Integer.MIN_VALUE;
		for(int i=1; i<n+1; i++){
			max = Math.max(cache[i], max);
		}
		wr.write(String.valueOf(max));
		wr.flush();
		wr.close();
	}

}
