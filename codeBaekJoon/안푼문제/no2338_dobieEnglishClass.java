package codeBaekJoon.안푼문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no2338_dobieEnglishClass {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String check = br.readLine();
		StringTokenizer st = new StringTokenizer(check, " ");
		char wordcheck = st.nextToken().charAt(0);
		while(wordcheck!='#'){
			String word="";
			while(st.hasMoreTokens()){
				word += st.nextToken();
			}
			word = word.toLowerCase();
			int count =0;
			for(int i =0; i<word.length(); i++){
				if(word.charAt(i)==wordcheck)
					count++;
			}
			System.out.println(wordcheck+" "+count);
			check = br.readLine();
			st = new StringTokenizer(check, " ");
			wordcheck = st.nextToken().charAt(0);
		}
	}

}
