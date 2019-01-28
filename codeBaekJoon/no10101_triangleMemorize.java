package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no10101_triangleMemorize {

	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int pastAngle = 0;
		int totalAngle =0;
		boolean iso = false;
		int t=3;
		while(t-->0){
			int n= Integer.parseInt(br.readLine());
			if(totalAngle-pastAngle == n || pastAngle ==n){
				iso = true;
			}
			pastAngle =n;
			totalAngle += n;	
		}
		if(totalAngle>180 || totalAngle<180){
			System.out.println("Error");
		}
		else{
			if(iso==true && pastAngle == 60 ){
				System.out.println("Equilateral");
			}
			else if(iso==true){
				System.out.println("Isosceles");
			}
			else{
				System.out.println("Scalene");
			}
		}
	
	}

}
