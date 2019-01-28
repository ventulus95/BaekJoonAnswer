package codeBaekJoon;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class no11723_set {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedReader br = new BufferedReader(new FileReader(new File("/Users/LeeChnagSup/Desktop/Data1.txt")));
		int T = Integer.parseInt(br.readLine());
		int S[] = new int [21];
		Arrays.fill(S, 0);
		StringBuilder output = new StringBuilder();
		String[] arr = new String[2];
		String temp = br.readLine();
		while(T-->0){
			if(temp.equals("all")){
				Arrays.fill(S, 1);
			}
			else if(temp.equals("empty")){
				Arrays.fill(S, 0);
			}
			else{
				arr = temp.split(" ");
				String move = arr[0];
				int num = Integer.parseInt(arr[1]);
				if(move.equals("add")){
					S[num] =1;
				}
				if(move.equals("remove")){
					S[num] =0;
				}
				if(move.equals("check")){
					output.append(S[num]+"\n");
				}
				if(move.equals("toggle")){
					if(S[num]==0){
						S[num]=1;
					}
					else{
						S[num]=0;
					}
				}

			}
			temp = br.readLine();
		}
		System.out.print(output);
	}
}
