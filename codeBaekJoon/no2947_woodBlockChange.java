package codeBaekJoon;
import java.util.*;
public class no2947_woodBlockChange {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int[] w = new int [5];
		for(int i=0; i<5; i++){
			w[i] = input.nextInt();
		}
		int set = 0;
		int temp;
		while(set<4){
			for(int t=0; t<4; t++){
			if(w[t]>w[t+1]){
				temp = w[t+1];
				w[t+1] = w[t];
				w[t] = temp;
				for(int j=0; j<5; j++){
					System.out.print(w[j]+" "); 
				}
				System.out.println();
			}
			}
			for(int v=0; v<4; v++){
				if(w[v]<w[v+1]){
					set++;
				}
				if(w[v]>w[v+1]){
					set =0;
				}
			}
		}// while
	}

}
