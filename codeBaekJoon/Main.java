package codeBaekJoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int alpha[] = new int [26];
		boolean check = false;
		String v = br.readLine();
		v = v.toUpperCase();
		for(int i=0; i<v.length(); i++){
			alpha[v.charAt(i)-'A']++;
		}
		int max =-1;
		int mi = 0;
		for(int i =0; i<26; i++){
			if(max<alpha[i]){
				max = alpha[i];
				mi = i;
			}
		}
		for(int i =0; i<26; i++){
			if(mi!=i && max==alpha[i]){
				check = true;
			}
		}
		if(check ==true){
			System.out.println("?");
		}
		else{
			System.out.println((char)('A'+mi));
		}
	}
}	