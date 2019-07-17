package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class no10825_KEM {
	public String name;
	public int kor;
	public int eng;
	public int math;
	public no10825_KEM(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setKor(int n){
		this.kor = n;
	}
	public int getKor(){
		return kor;
	}

	public void setEng(int n){
		this.eng = n;
	}
	public int getEng(){
		return eng;
	}
	public void setMath(int n){
		this.math = n;
	}
	public int getMath(){
		return math;
	}

	public static Comparator<no10825_KEM> Comparator = new Comparator<no10825_KEM>(){
		public int compare(no10825_KEM n1, no10825_KEM n2){
			if(n1.getKor()<n2.getKor()){
				return 1;
			}
			else{
				if(n1.getKor()==n2.getKor()){
					if(n1.getEng()>n2.getEng()){
						return 1;
					}
					else{
						if(n1.getEng()==n2.getEng()){
							if(n1.getMath()<n2.getMath()){
								return 1;
							}
							else{
								if(n1.getMath()==n2.getMath()){
									if(n1.getName().compareTo(n2.getName())>0){
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
						else{
							return -1;
						}

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
		no10825_KEM baek[] = new no10825_KEM[n];
		int i =0; 
		while(n-->0){
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s," ");
			String a = st.nextToken();
			int b=Integer.parseInt(st.nextToken());
			int c=Integer.parseInt(st.nextToken());
			int d=Integer.parseInt(st.nextToken());
			baek[i] =  new no10825_KEM(a,b,c,d);
			i++;
		}
		Arrays.sort(baek, Comparator);
		for(int j =0; j<baek.length; j++){
			System.out.println(baek[j].getName());
		}
	}	
}
