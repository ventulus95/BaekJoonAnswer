package codeBaekJoon;
import java.util.*;
public class no3047_ABC {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int []ABC = new int[3];
		ABC[0] = input.nextInt();
		ABC[1] = input.nextInt();
		ABC[2] = input.nextInt();
		String alpha = input.next();
		Arrays.sort(ABC);
		for(int i=0; i<3; i++){
		for(int k=0; k<3; k++){
		if(alpha.charAt(i)=='A'+k){
			System.out.print(ABC[k]+" ");
		}
		}
		}
	}

}
