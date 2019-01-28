package codeBaekJoon;
import java.util.*;
public class no2953_ImChef {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t=0;
		int chef[] = new int[5];
		while(t<5){
			for(int i=0; i<4; i++){
				chef[t]+=input.nextInt();
			}
			t++;
		}
		int max =0, temp=0;
		for(int j=0; j<5; j++){
			if(chef[j]>max){
				max=chef[j];
				temp = j;
			}
		}
		System.out.println(temp+1+" "+(max));
	}

}
