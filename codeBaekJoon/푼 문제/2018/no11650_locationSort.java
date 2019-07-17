package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
//11651번은 같은 문제고 y를 먼저 정렬하고 같으면 x로 바꿔주는 문제다.
public class no11650_locationSort {
	public int x;
	public int y;
	public no11650_locationSort(int name, int age){
		this.x = name;
		this.y = age;
	}
	public int getX(){
		return x;
	}
	public void setName(int name){
		this.x = name;
	}
	public void setY(int n){
		this.y = n;
	}
	public int getY(){
		return y;
	}
	
	   public static Comparator<no11650_locationSort> Comparator = new Comparator<no11650_locationSort>(){
	        public int compare(no11650_locationSort n1, no11650_locationSort n2){
	        	if(n1.getX()>n2.getX()){
	        		return 1;
	        	}
	        	else{
	        		if(n1.getX()==n2.getX()){
	        			if(n1.getY()>n2.getY()){
	        				return 1;
	        			}
	        			else{
	        				return -1;
	        			}
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
		no11650_locationSort baek[] = new no11650_locationSort[n];
		int i =0; 
		while(n-->0){
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s," ");
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			baek[i] =  new no11650_locationSort(a,b);
			i++;
		}
		Arrays.sort(baek, Comparator);
		for(int j =0; j<baek.length; j++){
			System.out.println(baek[j].getX()+" "+baek[j].getY());
		}
	}	
}
