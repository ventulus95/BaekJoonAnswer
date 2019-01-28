package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class no11652_card {
	public int cardnum;
	public int cardcount;
	public no11652_card(int name, int age){
		this.cardnum = name;
		this.cardcount= age;
	}
	public int getCardNum(){
		return cardnum;
	}
	public void setCardNum(int name){
		this.cardnum = name;
	}
	
	public int getCardCount(){
		return cardcount;
	}
	
	public void setCardCount(int n){
		this.cardcount = n;
	}
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
		no11652_card baek[] = new no11652_card[n];
		int i =0; 
		while(n-->0){
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s," ");
			int k=Integer.parseInt(st.nextToken());
			String a = st.nextToken();
			i++;
		}
		for(int j =0; j<baek.length; j++){
		}
	}	
}
