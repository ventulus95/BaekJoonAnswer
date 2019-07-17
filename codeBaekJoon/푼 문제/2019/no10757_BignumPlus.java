package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no10757_BignumPlus {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s= br.readLine();
		StringTokenizer st= new StringTokenizer (s, " ");
		String as = st.nextToken();
		String bs = st.nextToken();
		int a[] = new int[1000];
		int b[] = new int[1000];
		Arrays.fill(a, 0);
		Arrays.fill(b, 0);
		int v = as.length()-1;
		for(int i=10004; i>10004-as.length(); i--){
			a[i] = as.charAt(v)-'0';
			v--;
		}
		int vv = bs.length()-1;
		for(int i=10004; i>10004-bs.length(); i--){
			b[i] = bs.charAt(vv)-'0';
			vv--;
		}
		for(int i=10004; i>0; i--){
			if(a[i]+b[i]>=10){
				a[i-1] += (a[i]+b[i])/10;
				a[i] = (a[i]+b[i])%10;
				
			}
			else{
				a[i] = (a[i]+b[i]);
			}
		}
		int t=0;
		while(t<10004){
			if(a[t]>0){
				break;
			}
			t++;
		}
		for(int i=t; i<10005; i++){
			System.out.print(a[i]);
		}
	}
}
