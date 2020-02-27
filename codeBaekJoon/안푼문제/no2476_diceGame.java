package codeBaekJoon.안푼문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no2476_diceGame {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int max = 0;
		while(n-->0){
			String diceGame = br.readLine();
			int sum=0;
			StringTokenizer st = new StringTokenizer(diceGame, " ");
			int d1 = Integer.parseInt(st.nextToken());
			int d2 = Integer.parseInt(st.nextToken());
			int d3 = Integer.parseInt(st.nextToken());
			if(d1==d2&&d1==d3){
				sum += 10000 + (d1*1000);
				if(max<sum){
					max =sum;
				}
			}
			else if(d1==d2 || d1==d3 || d2==d3){
				if(d1==d2){
					sum+= 1000+(d1*100);
				}
				if(d2==d3){
					sum+= 1000+(d2*100);
				}
				if(d3==d1){
					sum+= 1000+(d3*100);
				}
				if(max<sum){
					max =sum;
				}
			}
			else{
				if(d1>d2&& d2>d3 || d3>d2){
					sum = d1*100;
				}
				if(d2>d1&& d1>d3 || d3>d1){
					sum = d2*100;
				}
				if(d3>d2&& d2>d1 || d1>d2){
					sum = d3*100;
				}
				if(max<sum){
					max =sum;
				}
			}
		}
		System.out.println(max);
	}
}
