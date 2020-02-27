package codeBaekJoon.안푼문제;
import java.util.*;
public class RoomNumber_no1474 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int roomNum = input.nextInt();
		int [] num	= new int[10];
		int eot =1;
		while(eot!=0){
			eot = roomNum /10;
			int set = roomNum %10;
			for(int i=0; i<10; i++){
				if(i==set){
					num[i]++;
				}
			}
			roomNum /= 10;
		}
		int setSum = 0;
		int saveSet = (num[9]+num[6])/2;
		boolean save = true;
		boolean loop = true;
		while(loop){
			for(int j=0; j<10; j++){
				if(num[j]!=0){
					num[j]--;
				}
			}
			setSum++;
			int check=0;
			for(int t=0; t<10; t++){
				if(num[t] ==0){
					check++;
				}
				if(check==10)
					loop =false;
			}
		}
		
		System.out.println(setSum);
	}
}


