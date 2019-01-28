package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no1748_intLongWriting {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N =  Integer.parseInt(br.readLine());
		int count =0;
		int total = 0;
		while(count<N){
			count++;
			if(count<10){
				total += 1;
			}
			else if(count<100 && count>=10){
				total += 2;
			}
			else if(count<1000 && count>=100){
				total += 3;
			}else if(count<10000 && count>=1000){
				total +=4;
			}
			else if(count<100000 && count>=10000){
				total += 5;
			}else if(count<1000000 && count>=100000){
				total += 6;
			}
			else if(count<10000000 && count>=1000000){
				total += 7;
			}
			else if(count<100000000 && count>=10000000){
				total += 8;
			}
			else if(count==100000000){
				total +=9;
			}
		}
		System.out.println(total);
	}

}
