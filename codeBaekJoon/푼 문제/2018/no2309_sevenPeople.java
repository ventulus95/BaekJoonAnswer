package codeBaekJoon;
import java.util.*;
public class no2309_sevenPeople {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int check[] = new int[9];
		int sum =0;
		for(int i=0; i<9; i++){
			check[i]= input.nextInt();
			sum+=check[i];
		}
		Arrays.sort(check);
		boolean loop = true;
		for(int j=0; j<9; j++){
			if(loop==false){
				break;
			}
			for(int k=j+1; k<9; k++){
				if(sum-check[j]-check[k]==100){
					check[j]=100;
					check[k]=100;
					loop = false;
					break;
				}
				
			}
		}
		Arrays.sort(check);
		for(int t=0; t<7; t++){
		System.out.println(check[t]);
		}
	}

}
