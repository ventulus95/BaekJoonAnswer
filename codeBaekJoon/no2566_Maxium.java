package codeBaekJoon;
import java.util.*;
public class no2566_Maxium {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num[][] = new int [9][9];
		int max = 0, x=0,y=0;
		for(int i=0; i<9; i++){
			for(int j=0; j<9; j++){
				num[i][j] = input.nextInt();
				if(max<num[i][j]){
					max = num[i][j];
					x=i+1;
					y=j+1;
				}
			}
		}
		System.out.println(max);
		System.out.println(x+" "+y);
		
	}

}
