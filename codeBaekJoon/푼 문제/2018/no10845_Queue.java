package codeBaekJoon;
import java.util.*;
public class no10845_Queue {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tc = input.nextInt();
		int [] queue = new int [10000];
		Arrays.fill(queue, -1);
		int size=0;
		while(tc-->0){
			String order = input.next();
			if(order.equals("push")){
				queue[size] = input.nextInt();
				size++;
			}
			if(order.equals("pop")){
				
				if(size==0){
					System.out.println(-1);
					queue[0]=-1;
					queue[1]=-1;
				}
				else{
					size--;
					System.out.println(queue[0]);
					for(int j=0; j<size; j++){
						queue[j] = queue[j+1];
					}
				}
			}
			if(order.equals("size")){
				System.out.println(size);
			}
			if(order.equals("empty")){
				if(size>0){
					System.out.println(0);
				}
				if(size==0){
					System.out.println(1);
				}

			}
			if(order.equals("front")){
				if(size==0){
					System.out.println(-1);
				}
				else{
					System.out.println(queue[0]);
				}
			}
			if(order.equals("back")){
				if(size==0){
					System.out.println(-1);
				}
				else{
					System.out.println(queue[size-1]);
				}


			}
		}
	}

}
