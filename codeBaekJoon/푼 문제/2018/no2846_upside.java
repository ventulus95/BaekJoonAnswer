package codeBaekJoon;

import java.util.Scanner;
import java.util.Stack;

public class no2846_upside {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int n = input.nextInt();
		int up[] = new int[n];
		for(int i=0; i<n; i++){
			up[i]=input.nextInt();
		}
		Stack<Integer> c = new Stack<Integer> ();
		int t=1;
		int upside=0, MAXUP = 0;
		c.push(up[0]);
		while(t++<n){
			if(c.peek()<up[t]){
				c.push(up[t]);
			}
			if(c.peek()>=up[t]){
				int max = c.pop();
				int min =1000;
				if(!c.isEmpty()){
				while(c.isEmpty()){
					int temp = c.pop();
					if(min>temp){
						min = temp;
					}
				}
				t++;
				c.push(up[t]);
				upside = max-min;
				}
				else{
					upside =0;
				}
			}
			if(MAXUP<upside){
				MAXUP = upside;
			}
		}
		System.out.println(MAXUP);
	}

}
