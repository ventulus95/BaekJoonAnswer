package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class no10773_zero {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		Stack<Integer> s = new Stack();
		while(T-->0){
			int n = Integer.parseInt(br.readLine());
			if(n!=0){
				s.push(n);
			}
			else{
				s.pop();
			}
		}
		int sum =0;
		while(!s.isEmpty()){
			sum+=s.pop();
		}
		System.out.println(sum);
	}		
}
