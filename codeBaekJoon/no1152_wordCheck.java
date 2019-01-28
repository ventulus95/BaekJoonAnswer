package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no1152_wordCheck {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		StringTokenizer k = new StringTokenizer(word, " ");
		int count =0;
		while(k.hasMoreTokens()){
			k.nextToken();
			count++;
		}
		System.out.println(count);
	}

}
