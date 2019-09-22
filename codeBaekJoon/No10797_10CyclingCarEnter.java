package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No10797_10CyclingCarEnter {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String tc = br.readLine();
		StringTokenizer st = new StringTokenizer(tc, " ");
		int num = 0;
		for(int i=0; i<5; i++){
			int check = Integer.parseInt(st.nextToken());
			if(t==check){
				num++;
			}
		}
		System.out.println(num);
	}

}
