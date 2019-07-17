package codeBaekJoon;
import java.util.*;
public class no2490_yookPlay {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			int [] play = new int[4];
			int count =0;
			for(int i=0; i<4; i++){
				play[i] = input.nextInt();
				if(play[i]==1){
					count++;
				}
			}
			if(count==0){
				System.out.println("D");
			}
			if(count==1){
				System.out.println("C");
			}
			if(count==2){
				System.out.println("B");
			}
			if(count==3){
				System.out.println("A");
			}
			if(count==4){	
				System.out.println("E");
			}

		}
	}

}
