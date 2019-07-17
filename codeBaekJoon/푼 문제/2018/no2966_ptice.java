package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no2966_ptice {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String s = br.readLine();
		char test[] = new char[s.length()];
		for(int i=0; i<s.length(); i++){
			test[i]=s.charAt(i);
		}
		char a[] = {'A', 'B' ,'C'};
		char b[] = {'B', 'A', 'B', 'C'};
		char g[] = {'C', 'C', 'A', 'A', 'B', 'B'};
		int ap=0, bp=0, gp=0;
		int k=0;
		int max=-1;
		while(k<s.length()){
			if(test[k]==a[k%3]){
				ap++;
				if(max<ap)
					max=ap;
			}
			if(test[k]==b[k%4]){
				bp++;
				if(max<bp)
					max=bp;
			}
			if(test[k]==g[k%6]){
				gp++;
				if(max<gp)
					max=gp;
			}
			k++;
		}
		System.out.println(max);
		if(max==ap){
			System.out.println("Adrian");
		}
		if(max==bp){
			System.out.println("Bruno");
		}
		if(max==gp){
			System.out.println("Goran");
		}
		
		

	}
}
