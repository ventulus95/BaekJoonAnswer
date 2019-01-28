package codeBaekJoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class no1547_ball {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int s = Integer.parseInt(br.readLine());
		int cup[] = new int [4];
		Arrays.fill(cup, -1);
		cup[1] = 1;
		for(int i=0; i<s; i++){
			String a= br.readLine();
			StringTokenizer st = new StringTokenizer(a, " ");
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			if(cup[b]*cup[c]<0){
				if(cup[b]>cup[c]){
					cup[b]*=-1;
					cup[c]*=-1;//c로 위치변경 
				}
				else{
					cup[b]*=-1;
					cup[c]*=-1;
				}
			}
		}
		int r =0;
		for(int i=1; i<4; i++){
			if(cup[i]>0){
				r=i;
				break;
			}
		}
		System.out.println(r);
	}

}
