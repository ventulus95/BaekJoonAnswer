package codeBaekJoon;
import java.util.*;
public class no5054_ParkingsGod { //brutal force ㄴㄴ 그렇게 안풀어도됨.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tc = input.nextInt();
		while(tc-->0){
			int n = input.nextInt();
			int shop[] = new int[n];
			for(int i=0; i<n; i++){
				shop[i] = input.nextInt();
			}
			Arrays.sort(shop);
			System.out.println(2*shop[n-1]-(2*shop[0]));
		}
	}

}