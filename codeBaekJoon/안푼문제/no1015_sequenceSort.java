package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no1015_sequenceSort {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int notSort[] = new int[T];
		int Sort[] = new int[T];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int i =0;
		while(st.hasMoreTokens()){
			notSort[i] = Integer.parseInt(st.nextToken());
			Sort[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(Sort);
		for(int v=0; v<T; v++){
			for(int j=0; j<T; j++){
				if(notSort[v]==Sort[j]){
					System.out.print(j+" ");
					break;
				}
			}
			
		}
	}

}
