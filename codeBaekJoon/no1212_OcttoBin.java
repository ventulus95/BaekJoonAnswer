package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class no1212_OcttoBin {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String B= br.readLine();
		StringBuilder bin = new StringBuilder();
		StringBuilder bin1 = new StringBuilder();
		Queue s = new LinkedList();
		int t =0;
		int nup =1;
		int check;
		int check2;
		int check4;
		while(t<B.length()){
			int v =B.charAt(t)-'0';
			check4 = v/4;
			v = v%4;
			check2 = v/2;
			v = v%2;
			check = v%2;
			s.offer(check4);
			s.offer(check2);
			s.offer(check);
			t++;
		}
		while(!s.isEmpty()){
			bin.append(s.poll());
		}
		if(bin.charAt(0)=='0'){
			if(bin.charAt(1)=='0'){
				System.out.println(bin.substring(2, bin.length()));
			}
			else{
				System.out.println(bin.substring(1, bin.length()));
			}
		}
		else{
			System.out.println(bin.toString());
		}
	}
}
