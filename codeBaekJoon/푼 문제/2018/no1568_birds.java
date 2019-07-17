package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no1568_birds {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
		int first = 1;
		int second = 0;
		while(n>0){
			if(n<first){
				first = 1;
			}
			else{
			n -= first;
			first++;
			second++;
			}
		}
		System.out.println(second);
	}

}
