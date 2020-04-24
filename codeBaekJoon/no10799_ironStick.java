package codeBaekJoon;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class no10799_ironStick {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String stick = br.readLine(); 
		Stack<Character> stack = new Stack();
		int total = 0;
		char prev = 0;
		int sdeep = 0;
		for(int i=0; i<stick.length(); i++ ){
			if(stick.charAt(i)=='('){
				stack.push(stick.charAt(i));
				sdeep++;
			}
			if(stick.charAt(i)==')'){
				prev = stick.charAt(i-1);
				if(prev == '('){
					stack.pop();
					total += sdeep-1;
					sdeep--;
				}
				else{
					total +=1;
					sdeep--;
				}
			}
		}
		System.out.println(total);
	}

}
