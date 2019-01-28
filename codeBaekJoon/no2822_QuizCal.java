package codeBaekJoon;
import java.util.*;
public class no2822_QuizCal { //내일 n*10 +(i+1);
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int test [] = new int [8];
		int total []  = new int[5];
		int tn[] = new int [5];
		int sum = 0;
		for(int t=0; t<8; t++){
			test[t]=input.nextInt();
		}
		for(int j=4; j>=0; j--){ // 최대값을 구해서 값을 합하는게 더 수월하다. 최소값찾는것보다.
			int max = 0;
			int idx = 0;
			for(int i =0; i<8; i++){
				if(max<test[i]){
					max=test[i];
					idx = i;
				}
			}
				test[idx] = 0;
				total[j] = max;
				tn [j] = idx+1;
			
		}
		for(int i=0; i<5; i++){
			sum+=total[i];
		}
		Arrays.sort(tn);
		System.out.println(sum);
		for(int i=0; i<5; i++){
			System.out.print(tn[i]+" ");
		}
	}

}
