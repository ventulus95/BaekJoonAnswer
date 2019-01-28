package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class no10814_ageSort {
	public String name;
	public int age;
	public no10814_ageSort(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int n){
		this.age = n;
	}
	public int getAge(){
		return age;
	}
	
	   public static Comparator<no10814_ageSort> Comparator = new Comparator<no10814_ageSort>(){
	        public int compare(no10814_ageSort n1, no10814_ageSort n2){
	        	if(n1.getAge()>n2.getAge()){
	        		return 1;
	        	}
	        	else{
	        		if(n1.getAge()==n2.getAge()){
	        			return 0;
	        		}
	        		else{
	        			return -1;
	        		}
	        	}
	        }
	    };
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
		no10814_ageSort baek[] = new no10814_ageSort[n];
		int i =0; 
		while(n-->0){
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s," ");
			int k=Integer.parseInt(st.nextToken());
			String a = st.nextToken();
			baek[i] =  new no10814_ageSort(a,k);
			i++;
		}
		Arrays.sort(baek, Comparator);
		for(int j =0; j<baek.length; j++){
			System.out.println(baek[j].getAge()+" "+baek[j].getName());
		}
	}	
}
