package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no4493_RSP {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0){
			int n = Integer.parseInt(br.readLine());
			int p1 = 0;
			int p2 = 0;
			while(n-->0){
				String s = br.readLine();
				StringTokenizer st = new StringTokenizer(s," ");
				String sp1 = st.nextToken();
				String sp2 = st.nextToken();
				if(sp1.equals(sp2)){
					p1++;
					p2++;
				}
				else{
					if(sp1.equals("R")){
						if(sp2.equals("S")){
							p1++;
						}
						else{
							p2++;
						}
					}
					if(sp1.equals("S")){
						if(sp2.equals("P")){
							p1++;
						}
						else{
							p2++;
						}
					}
					if(sp1.equals("P")){
						if(sp2.equals("R")){
							p1++;
						}
						else{
							p2++;
						}
					}
				}
			}//while
			if(p1>p2){
				System.out.println("Player 1");
			}
			else if(p2>p1){
				System.out.println("Player 2");
			}
			else{
				System.out.println("TIE");
			}
		}

	}

}
