package codeBaekJoon;
import java.util.*;
public class no1843_divdeBorrowSame {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        long n = input.nextLong();
	        long result =0;
	        for(int i=0; i<n; i++){
	            result+= (n*i)+i;
	        }
	        System.out.println(result);
	}

}
