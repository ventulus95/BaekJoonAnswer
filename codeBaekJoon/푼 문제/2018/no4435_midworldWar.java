package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no4435_midworldWar {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T= Integer.parseInt(br.readLine());
		int count = 1; 
		int [] human = new int [6];
		int [] oak = new int[7];
		while(T-->0){
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s," ");
			int i=0;
			while(st.hasMoreTokens()){
				human[i]=Integer.parseInt(st.nextToken());
				i++;
			}
			i =0;
			String a = br.readLine();
			StringTokenizer st1 = new StringTokenizer(a," ");
			while(st1.hasMoreTokens()){
				oak[i] =Integer.parseInt(st1.nextToken());
				i++;
			}
			int hsum =0;
			for(int j=0; j<human.length; j++){
				if(j==0){
					hsum+= human[j]*1;
				}
				else if(j==1){
					hsum+= human[j]*2;
				}
				else if(j==4){
					hsum+= human[j]*4;
				}
				else if(j==5){
					hsum+= human[j]*10;
				}
				else{
					hsum+= human[j]*3;
				}

			}
			int osum =0;
			for(int t=0; t<oak.length; t++){
				if(t==0){
					osum+= oak[t]*1;
				}
				else if(t==4){
					osum+= oak[t]*3;
				}
				else if(t==5){
					osum+= oak[t]*5;
				}
				else if(t==6){
					osum+= oak[t]*10;
				}
				else{
					osum+= oak[t]*2;
				}
			}
			if(hsum>osum){
				System.out.println("Battle "+count+": Good triumphs over Evil");
			}
			else if(osum>hsum){
				System.out.println("Battle "+count+": Evil eradicates all trace of Good");
			}
			else{
				System.out.println("Battle "+count+": No victor on this battle field");
			}
			count++;
		}

	}

}

