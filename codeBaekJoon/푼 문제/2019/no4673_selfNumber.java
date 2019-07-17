package codeBaekJoon;

import java.io.IOException;
import java.util.Arrays;

public class no4673_selfNumber {
	static void self(int j){
		int self = j;
		int once = j;
		while(self<10000){
			if(once>999){ //1000인 case
				self+=once%10;
				self+= (once%100)/10;
				self+= (once%1000)/100;
				self+=once/1000;
			}
			else if(once>99&&once<=999){ //100자리 경우 case
				self+= once%10;
				self+= (once%100)/10;
				self+= once/100;
			}
			else if(once>9&&once<=99){ //10자리 경우 
				self+=once%10;
				self+=once/10;
			}
			else{ //1자리 경우 
				self+=once%10;
			}
			if(self<10000){
			num[self]=false;
			once= self;
			}
		}// while
	}
	static boolean num[];
	public static void main(String[] args) throws IOException {
		num = new boolean[10001];
		Arrays.fill(num, true);
		
		for(int i=1; i<10000; i++){
			if(num[i]==true){
				self(i);
			}
		}
		for(int i =1; i<10000; i++){
			if(num[i]==true){
				System.out.println(i);
			}
		}
	}
}
