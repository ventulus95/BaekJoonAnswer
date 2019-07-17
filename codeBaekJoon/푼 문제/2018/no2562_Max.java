package codeBaekJoon;
import java.util.*;
public class no2562_Max {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int max=0, num=0, maxNum=0;
		while(input.hasNext()){
			int n = input.nextInt();
			num++;
			if(n>max){
				max=n;
				maxNum = num;
			}
		}
		System.out.println(max);
		System.out.println(maxNum);
	}

}
