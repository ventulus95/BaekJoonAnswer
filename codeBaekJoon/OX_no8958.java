package codeBaekJoon;
import java.util.*;
public class OX_no8958 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		for(int i = 0; i<T; i++){
			String OX = input.next();
			int [] score = new int [2];
			for(int j =0; j<OX.length(); j++){
				String comp = OX.substring(j,j+1);
				if(comp.equals("O")){
					score[0]++;
					score[1] += score[0];
				}
				else{
					score[0]=0;
				}	
			}
			System.out.println(score[1]);
		}
	}

}
