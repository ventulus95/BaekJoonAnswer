/* 2019.03.06 stack 문제.
*/
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class No4949_TheBalanceoftheWorld {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		boolean check = true;
		while(!s.equals(".")){
			Stack<Character> B = new Stack<Character>();
			for(int i =0; i<s.length(); i++){
				if(s.charAt(i) == '('){
					B.push('(');
				}
				if(s.charAt(i)=='['){
					B.push('[');
				}
				if(s.charAt(i)==')'){
					if((!B.isEmpty())&&B.peek()=='(')
					B.pop();
					else{
						check = false;	
						break;
					}
				}
				if(s.charAt(i)==']'){
					if((!B.isEmpty())&&B.peek()=='[')
					B.pop();
					else{
						check = false;
						break;
					}
				}
			}
			if(!B.isEmpty()){
				check=false;
			}
			if(check==true){
				System.out.println("yes");
			}
			else{
				System.out.println("no");
			}
			check = true;
			s=br.readLine();
		}
	}
}

