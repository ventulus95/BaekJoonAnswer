package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no1371_Manysentence {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int alphabet[] = new int[26]; 
		String str; 
		while ((str = br.readLine()) != null) { 
			for (int i = 0; i < str.length(); i++) { 
				if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
					alphabet[str.charAt(i) - 'a']++; 
				}
			}
		}

		int max = 0;
		int maxn = 0;
		for(int k=0; k<26; k++){
			if(max<alphabet[k]){
				max = alphabet[k];
				maxn = k;
			}
		}
		System.out.println((char) ('a'+maxn));
	}

}
