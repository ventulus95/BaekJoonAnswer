package codeBaekJoon;

import java.util.Scanner;

public class no11006_chickenCage {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int tc = input.nextInt();
		while(tc-->0){
			int n = input.nextInt();
			int m = input.nextInt();
			for(int i=0; i<m; i++){
				int k = n-(2*i);
				if(i+k==m){
					System.out.print(k+" ");
					System.out.println(i);
				}
			}
		}
	}

}
