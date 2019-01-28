package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no5666_hotdog {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";
		while((s=br.readLine())!=null){
			StringTokenizer st= new StringTokenizer(s, " ");
			double h = Integer.parseInt(st.nextToken());
			double p = Integer.parseInt(st.nextToken());
			double r = Math.round((h/p)*100);
			double k = r/100.0;
			System.out.println(String.format("%.2f", k));
		}
	}
}


/// java eof buffer 처리할때는 s= br.readLine() ! = null처리하면 eof처리가 가능하다.
//특히 n값이 안주어진 경우는 꼭 이거 처리하기 바란다.
