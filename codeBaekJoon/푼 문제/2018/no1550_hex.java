package codeBaekJoon;
import java.util.*;
public class no1550_hex {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String hex = input.next();
		int sum=0;
		for(int i=0; i<hex.length(); i++){
			if(hex.charAt(i)=='A'){
				sum+=10*Math.pow(16, hex.length()-i-1);
			}
			else if(hex.charAt(i)=='B'){
				sum+=11*Math.pow(16, hex.length()-i-1);
			}
			else if(hex.charAt(i)=='C'){
				sum+=12*Math.pow(16, hex.length()-i-1);
			}
			else if(hex.charAt(i)=='D'){
				sum+=13*Math.pow(16, hex.length()-i-1);
			}
			else if(hex.charAt(i)=='E'){
				sum+=14*Math.pow(16, hex.length()-i-1);
			}
			else if(hex.charAt(i)=='F'){
				sum+=15*Math.pow(16, hex.length()-i-1);
			}
			else{
				int t = hex.charAt(i) -'0';
				sum += t*Math.pow(16, hex.length()-i-1);
			}
		}
		System.out.println(sum);

	}

}
