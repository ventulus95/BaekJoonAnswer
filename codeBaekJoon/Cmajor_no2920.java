package codeBaekJoon;
import java.util.*;
public class Cmajor_no2920 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] num = new int[3];
		
			num[0] = input.nextInt();
			num[1] =num[0];
			if(num[0] == 1){
				int i = 1;
				while(i<8){
					num[1]++;
					int b = input.nextInt();
					if(b!=num[1]){
						num[2] =3;
						break;
					}
					else{
						num[2] =1;
					}
					i++;
				}
			}
			if(num[0]==8){
				int i = 8;
				while(i>1){
					num[1]--;
					int b = input.nextInt();
					if(b!=num[1]){
						num[2] =3;
						break;
					}
					else{
						num[2] =2;
					}
					i--;
				}
			}
		if(num[2]==1){
			System.out.println("ascending");
		}
		if(num[2]==2){
			System.out.println("descending");
		}
		if(num[2]==3){
			System.out.println("mixed");
		}
	}

}
