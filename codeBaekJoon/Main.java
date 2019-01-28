package codeBaekJoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int p[] = new int[9];
		int sum =0;
		for(int i=0; i<9; i++){
			int n = Integer.parseInt(br.readLine());
			sum += n;
			p[i] = n;
		}
		Arrays.sort(p);
		for(int i = 0; i<9; i++){
			boolean check = true; 
			for(int j=i+1; j<9; j++){
				if(sum - (p[i]+p[j])==100){
					p[i] =100;
					p[j]=100;
					check  = false; 
					break;
				}
			}
			if(check==false){
				break;
			}
		}
		for(int i = 0; i<9; i++){
			if(p[i]!=100)
			System.out.println(p[i]);
		}
		
		System.out.println("github test !!!");
		
	}
}	