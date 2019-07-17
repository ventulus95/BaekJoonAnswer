package codeBaekJoon;
import java.util.Scanner;
public class no5032_Coke {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int bag =0, search = 0, change =0;
		bag = input.nextInt();
		search = input.nextInt();
		change =input.nextInt();
		int remain = (bag+search)/change;
		int rest = (bag+search)%change;
		int total = remain;
		while(remain+rest>=change){
			int sum = (remain+rest);
					remain = sum/change;
			total += remain;
			rest =sum%change;
		}
		System.out.println(total);
	}

}
