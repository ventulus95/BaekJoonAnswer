package codeBaekJoon.안푼문제;
import java.util.*;
public class no10799_ironStick {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String stick = input.next();
		Stack<Character> dis = new Stack();
		int ts = 0; //total stick
		int pCache = 0;//popCache
		int r =0; //razer
		int rt =0;// razerTotal
		for(int i=0; i<stick.length(); i++ ){
			if(stick.charAt(i)=='('){
				dis.push(stick.charAt(i));
				pCache=0;
			}
			if(stick.charAt(i)==')'){
				dis.pop();
				pCache++;
				if(pCache==1){
					r++;
				}
				else{
					if(dis.size()>2){
						rt+=r;
						ts+=r+1;
						r=0;
					}
					else if(dis.size()==1){
						ts+=rt+1;
					}
					else{
						ts+=rt+1;
						rt=0;
						r=0;
					}
				}
			}
			if(dis.isEmpty()){
				r=0;
			}
		}
		System.out.println(ts);
	}

}
