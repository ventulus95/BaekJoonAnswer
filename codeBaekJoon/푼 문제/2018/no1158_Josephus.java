package codeBaekJoon;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class no1158_Josephus {
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		Queue<Integer> jo = new LinkedList<Integer>();
		Queue<Integer> jos = new LinkedList<Integer>();
		int m = input.nextInt();
		for(int i=0; i<n; i++){
			jo.offer(i+1);
		}
		int count =1;
		while(!jo.isEmpty()){
			
			if(count%m==0){
				jos.offer(jo.poll());
			}
			if(count%m!=0){
				jo.offer(jo.poll()); // 넣다가 다시빼면 순서가 원래대로 돌아감.
			}
			count++;
		}
		System.out.print("<"+jos.poll());
		while(!jos.isEmpty()){
			System.out.print(", "+jos.poll());
		}
		System.out.print(">");
	}

}
