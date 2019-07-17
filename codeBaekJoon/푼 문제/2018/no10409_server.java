package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no10409_server {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nt = br.readLine();
		String time = br.readLine();
		StringTokenizer st = new StringTokenizer(nt, " ");
		StringTokenizer st2 = new StringTokenizer(time, " ");
		int N = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());
		int count = 0;
		
		while(T>0){
			int a = Integer.parseInt(st2.nextToken());
			T-=a;
			if(T<0){
				break;
			}
			count++;
			if(count == N){
				break;
			}
		}
		System.out.println(count);
	}

}
