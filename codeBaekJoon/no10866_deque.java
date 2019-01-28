package codeBaekJoon;
import java.util.*;
public class no10866_deque {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int n = input.nextInt();
		int deque[] = new int [10000];
		int size =0; int front =0;
		for(int i=0; i<n; i++){
			String a = input.next();
			if(a.equals("push_front")){
				int x = input.nextInt();
				if(size>0){
					for(int j=size-1;j>=0; j--){
						deque[j+1] = deque[j];
					}
					deque[0]=x;
					size++;
				}
				else{
					deque[0]=x;
					size++;
				}//size =0읽
			}
			if(a.equals("push_back")){
				deque[size] = input.nextInt();
				size++;
			}
			if(a.equals("pop_front")){
				if(size==0){
					System.out.println(-1);
				}
				else if(size==1){
					System.out.println(deque[0]);
					size--;
				}
				else{
					System.out.println(deque[0]);
					for(int k=0; k<size-1; k++){
						deque[k]=deque[k+1];
					}
					size--;
				}
			}
			if(a.equals("pop_back")){
				if(size==0){
					System.out.println(-1);
				}
				else{
					System.out.println(deque[size-1]);
					size--;
				}
			}
			if(a.equals("size")){
				System.out.println(size);
			}
			if(a.equals("empty")){
				if(size==0){
					System.out.println(1);
				}
				else{
					System.out.println(0);
				}
			}
			if(a.equals("front")){
				if(size==0){
					System.out.println(-1);
				}
				else{
					System.out.println(deque[0]);
				}				
			}
			if(a.equals("back")){
				if(size==0){
					System.out.println(-1);
				}
				else{
					System.out.println(deque[size-1]);
				}	

			}

		}
	}

}
