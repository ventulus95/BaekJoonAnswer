package codeBaekJoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String v = br.readLine();
		StringTokenizer st= new StringTokenizer (v, " " );
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(br.readLine());
		if(a+b>=2*c){
			System.out.println( a+b-(2*c) );
		}
		else{
			System.out.println(a+b);
		}
	}
}	