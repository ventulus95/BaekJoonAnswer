package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No14468_CowCross2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cs[] = new int[27];
		int cd[] = new int[27];
		int cnt = 0;
		Arrays.fill(cs, -1);
		Arrays.fill(cd, -1);
		String meet = br.readLine();
		for(int i=0; i<52; i++){
			int cow = meet.charAt(i)-'A';
			if(cs[cow]<0){
				cs[cow]=i;
			}
			else{
				cd[cow]=i;
			}
		}
		for(int i =0; i<27; i++){
			int start = cs[i];
			int end = cd[i];
			for(int j=0; j<27; j++){
				if(start<cs[j]){
					if(end<cd[j]){
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);
	}
}
