package codeBaekJoon;
import java.util.Scanner;
public class no5597_ReportCheck {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int student[] = new int[30];
		for(int i=0; i<28; i++){
			int check = input.nextInt();
			student[check-1] = 1;
		}
		for(int v=0; v<30; v++){
			if(student[v] == 0){
				System.out.println(v+1);
			}
		}
	}

}
