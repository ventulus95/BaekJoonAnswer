package codeBaekJoon;
import java.util.*;
public class BinomialTheorem_no11050 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long N = input.nextInt();
		long K = input.nextInt();
		int Nf=1,Kf=1,nMkf=1;
		for(long i=N; i>0; i--){
			Nf *=i;
		}
		for(long i=K; i>0; i--){
			Kf *=i;
		}
		for(long i=N-K; i>0; i--){
			nMkf *=i;
		}
		long total =Nf/(Kf*nMkf);
		System.out.println(total%10007);
	}
}
