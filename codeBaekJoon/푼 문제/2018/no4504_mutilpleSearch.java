package codeBaekJoon;
import java.util.*;
public class no4504_mutilpleSearch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int mutilple = input.nextInt();
		while(input.hasNext()){
			int check = input.nextInt();
			if(check==0){
				break;
			}
			if(check%mutilple==0){
				System.out.println(check+" is a multiple of "+mutilple+".");
			}
			else{
				System.out.println(check+" is NOT a multiple of "+mutilple+".");
			}
		}
	}

}
