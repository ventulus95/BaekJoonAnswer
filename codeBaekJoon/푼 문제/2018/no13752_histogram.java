package codeBaekJoon;
import java.util.*;
public class no13752_histogram {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int n = input.nextInt();
		int his[] = new int[n];
		for(int k =0; k<n; k++){
			his[k] = input.nextInt();
		}
		int turn =0;
		while(turn<n){
		for(int t=0; t<his[turn]; t++){
			System.out.print("=");
		}
		System.out.println();
		turn++;
		}
	}

}
