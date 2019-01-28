package codeBaekJoon;
import java.util.*;
public class DayCalc_no1476 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int E = input.nextInt();
		int S = input.nextInt();
		int M = input.nextInt();
		int count =1;
		int day[] = new int[3];
		day[0]=1; day[1]=1; day[2]=1;
		while(true){
			if(day[0]==E&&day[1]==S&&day[2]==M)
				break;
			count++;
			day[0]++;
			if(day[0]>15)
				day[0]=1;
			day[1]++;
			if(day[1]>28)
				day[1]=1;
			day[2]++;
			if(day[2]>19)
				day[2]=1;
			
		}
		System.out.println(count);
	}

}
