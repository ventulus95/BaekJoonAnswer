package codeBaekJoon;
import java.util.*;
public class StackVps_no9012 {
	public static void main(String[] args) {
		Stack stack = new Stack();
		Scanner input = new Scanner (System.in);
		int tc = input.nextInt();
		for(int i=0; i<tc; i++){
			boolean check = true;
			String vps = input.next();
			for(int t=0; t<vps.length(); t++){
				if(vps.charAt(t)=='('){
					stack.push(vps.charAt(t)); // (가 들어가면 push
				}
				if(vps.charAt(t)==')'){ // )가 발견되면 pop
					if(!stack.isEmpty()){ // 간혹 스택자체가 없는데 비우는 경우를 방지하기위해
						stack.pop(); 
					}
					else{
						if(vps.charAt(t)==')'){ //비어있는데 )가 있으면
							check=false; //체크변수를 거짓판별 
							break;
						}
					}
				}
			}// 한줄포문 
			if(!stack.isEmpty()) //스택이 전히 비워졌는지 확인 
			{
				check=false;
			}
			if(check==false){
				System.out.println("NO");
			}
			else{
				System.out.println("YES");
			}
			stack.clear();//그리고 스택초기
		}
	}
}
