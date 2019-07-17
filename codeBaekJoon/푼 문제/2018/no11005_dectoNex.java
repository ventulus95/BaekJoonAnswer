package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class no11005_dectoNex {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s," ");
		int n= Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		Stack nq = new Stack();
		String num = "";
		while(n!=0){
			int check = n/b;
			if(check==0){
				check = n%b;
				if(check>9){
					char bnum = 64;
					check-=9;
					bnum+=check;
					nq.add(bnum);
				}
				else{
					nq.add(check);
				}
			}
			else{
				check = n%b;
				if(check>9){
					char bnum = 64;
					check-=9;
					bnum+=check;
					nq.add(bnum);
				}
				else{
					nq.add(check);
				}
			}
			n = n/b;
		}
		while(!nq.isEmpty()){
			num+=nq.pop();
		}
		System.out.println(num);
		//64 +1  은 A가 나온다.
	}

}
