package codeBaekJoon;
import java.math.BigInteger;
import java.util.Scanner;
public class no2355_sigma {
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		long a = input.nextLong();
		long b = input.nextLong();
		if (a > b) {
			long temp = a;
			a = b;
			b= temp;
		}
		BigInteger big1 = new BigInteger((b - a + 1) + "");
		BigInteger big2 = new BigInteger((b + a) + "");
		BigInteger result = big1.multiply(big2).divide(new BigInteger("2"));

		System.out.println(result);


	}

}
