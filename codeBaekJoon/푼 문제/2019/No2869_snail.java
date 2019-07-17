package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2869_snail {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long start =System.currentTimeMillis();
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s, " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		int day = 0;
		day = (v-b-1)/(a-b)+1;
		/* 황당한게 위의 전략은  v / a-b가 맞는 것 처럼 보이지만, 생각해보면 이경우는 a-b만큼씩만
		 * 내가 날짜이동으로 하는건데 이러면 결국 꼭대기에 올라가는 경우가 아니라 
		 * 꼭대기에서 b만큼 떨어진 곳에서 도착하는게 
		*/
		long end = System.currentTimeMillis();
		//		System.out.println("time: "+(end - start)/1000.0);
		System.out.println(day);
	}
}
