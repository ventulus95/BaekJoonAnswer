package codeBaekJoon;
import java.util.*;
public class no4470_lineNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String line[] = new String[n];
		String esp = input.nextLine();
		for(int i=0; i<n; i++){
			line[i] = input.nextLine();
		}
		for(int t=0; t<n; t++){
			System.out.println((t+1)+". "+line[t]);
		}
	}

}
