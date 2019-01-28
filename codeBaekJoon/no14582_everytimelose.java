package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no14582_everytimelose {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ateam = br.readLine();
		String bteam = br.readLine();
		StringTokenizer st = new StringTokenizer(ateam, " ");
		StringTokenizer st1 = new StringTokenizer(bteam, " ");
		int turn = 9;
		int a = 0;
		int b = 0;
		boolean check = false;
		while(turn -->0){
			a += Integer.parseInt(st.nextToken());
			if(a>b){
				check=true;
			}
			b += Integer.parseInt(st1.nextToken());
			if(a>b){
				check=true;
			}
		}
		if(check==true){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
}
