package codeBaekJoon;
//2019.01.09 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

	
public class no1463_MakeaOne {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cache[] = new int[n+1];
		cache[1]=0;
		for(int i =2; i<=n; i++){
			if(n%6==0){
				cache[i] = Math.min(cache[i/3]+1, Math.min(cache[i/2]+1, cache[i-1]+1));
			}
			else if(i%3==0){
				cache[i] = Math.min(cache[i/3]+1, cache[i-1]+1);
			}
			else if(i%2==0){
				cache[i] = Math.min(cache[i/2]+1, cache[i-1]+1);
			}
			else{
				cache[i] = cache[i-1]+1;
			}
		}
		System.out.println(cache[n]);
	}
	
}
