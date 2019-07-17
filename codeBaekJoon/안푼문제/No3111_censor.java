//2019.07.08 

package codeBaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class No3111_censor {

	static int find(StringBuilder a, StringBuilder b){
		if(a.length()<b.length()) return -1;
		String A[] = new String [a.length()];
		for(int i=0 ; i<a.length(); i++){
			A[i] = a.toString().substring(i, i+1);
		}
		String B[] = new String [b.length()];
		for(int i=0 ; i<b.length(); i++){
			B[i] = b.toString().substring(i, i+1);
		}
		for(int st=0; st<=a.length()-b.length(); st++){
			int isMatch = -1; 
			for(int i=st; i<st+ b.length(); i++){
//				System.out.println("B[i-st] value: "+B[i-st]+" A[i] value: "+A[i]);
				if(A[i].equals(B[i-st])){
					isMatch = st;
				}
				if(!A[i].equals(B[i-st])){
					isMatch = -1;
					break;
				}
			}
			if(isMatch!=-1) return isMatch;
		}
		return -1;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder A = new StringBuilder(br.readLine());
		StringBuilder T = new StringBuilder(br.readLine());
		Stack array = new Stack();
		int tFind = 0;
		int rtFind = 0;
//		System.out.println(find(T,A));
		while(tFind!=-1 && rtFind!=-1){
	    	tFind = find(T,A);
			if(tFind != -1){
	    		T.delete( tFind ,tFind+A.length());
			}
			T = T.reverse();
	    	rtFind = find(T,A);
			if(rtFind != -1){
				T.delete( tFind ,tFind+A.length());
			}
		}
		wr.write(T.toString());
		wr.flush();
	}

}
