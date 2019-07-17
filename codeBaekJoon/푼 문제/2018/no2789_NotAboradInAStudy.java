package codeBaekJoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no2789_NotAboradInAStudy {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringBuilder  v= new StringBuilder();
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)=='C'){
			}
			else if(s.charAt(i)=='A'){
			}
			else if(s.charAt(i)=='M'){
			}
			else if(s.charAt(i)=='B'){
			}
			else if(s.charAt(i)=='R'){
			}
			else if(s.charAt(i)=='I'){
			}
			else if(s.charAt(i)=='D'){
			}
			else if(s.charAt(i)=='G'){
			}
			else if(s.charAt(i)=='E'){
			}
			else{
				 v.append(s.charAt(i));
			}
			
		}
		System.out.println(v);
	}

}
