package codeBaekJoon;
import java.util.*;
public class no2857_FBI {
	public static void main(String[] args)  {
		Scanner input = new Scanner (System.in);
		int spy =0;
		for(int i =0; i<5; i++){
			String check = input.next();
			for(int j=0; j<check.length(); j++){
				if(check.charAt(j)=='F'){
					if(check.charAt(j+1)=='B')
						if(check.charAt(j+2)=='I'){
							System.out.print(i+1+" ");
							spy++;
							break;
						}
				}
			}
			
		}
		if(spy ==0){
			System.out.println("HE GOT AWAY!");
		}
		
	}

}

//fbifbi인경우 15줄의 break안걸어주면 오류발생. 112