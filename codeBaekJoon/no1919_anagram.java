/* 2019.02.09 문자열 처리 
*/
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no1919_anagram {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		String b = br.readLine();
		int aap[] = new int [26];
		int bap[] = new int [26];
		int sum=0;
		for(int i=0; i<a.length(); i++){
			aap[a.charAt(i)-'a']++;
		}
		for(int i=0; i<b.length(); i++){
			bap[b.charAt(i)-'a']++;
		}
		for(int i=0; i<26; i++){
			if(aap[i]==bap[i]){
				aap[i]=0;
				bap[i]=0;
			}
			else{
				if(aap[i]>bap[i]){
					aap[i] -= bap[i];
					bap[i] =0;
				}
				else{
					bap[i] -= aap[i];
					aap[i] =0;
				}
				sum+=aap[i];
				sum+=bap[i];
			}
		}
		System.out.println(sum);
	}
}
