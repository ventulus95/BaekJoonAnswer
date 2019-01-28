package codeBaekJoon;
import java.util.*;
public class stack_no10828 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int line = input.nextInt();
		int stack[] = new int[10000];
		for(int a=0; a<10000; a++){
			stack[a]=-1;
		}
		int stackNum = 0;
		for(int i=0; i<=line; i++){
			String cmd = input.next();
			if(cmd.equals("push")){//push의 경우
				int num = input.nextInt(); 
				stack[stackNum]=num; //스택넘버를 하나 쌓고배열에 넣은다음
				stackNum++;//번호를 늘리면 한칸위로 밀림.
			}
			if(cmd.equals("pop")){
				if(stackNum>0){
				int temp = stack[stackNum-1];
				stack[stackNum-1] = -1;
				stackNum--;
				System.out.println(temp);
				}
				else{
					System.out.println(-1);
				}
				
			}
			if(cmd.equals("size")){
				int check =0;
				for(int k=0; k<10000; k++){
					if(stack[k]>0){
						check++;
					}
				}
				System.out.println(check);
			}
			if(cmd.equals("empty")){
				int stackEmpty =0;
				for(int t=0; t<10000; t++){
					if(stack[t]<0){
						if(stackEmpty==0){
							System.out.println("1");
							break;
						}
						else{
							System.out.println("0");
							break;
						}
					}
					else{
						stackEmpty++;
					}
				}
			}
			if(cmd.equals("top")){
				if(stack[0]==-1){
					System.out.println("-1");
				}
				else{
					System.out.println(stack[stackNum-1]);
				}
			}
		}

	}

}
