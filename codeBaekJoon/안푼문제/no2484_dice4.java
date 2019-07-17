package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no2484_dice4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int price = 0;
		int dice[] = new int[4];
		while(T-->0){
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s, " ");
			dice[0]= Integer.parseInt(st.nextToken());
			dice[1]= Integer.parseInt(st.nextToken());
			dice[2]= Integer.parseInt(st.nextToken());
			dice[3]= Integer.parseInt(st.nextToken());
			Arrays.sort(dice);
			if(dice[0]==dice[1]&&dice[0]==dice[2]&&dice[0]==dice[3]){ //주사위 4개가 같은경우.
				price += (50000+(5000*dice[0]));
			}
			else if(dice[1]==dice[2]&&dice[1]==dice[3]&&dice[0]!=dice[1]){//3개가 같은경우.
				price += (10000+(1000*dice[3]));
			}
			/*else if(){//2개가 쌍으로 같은경우.
			}
			else if(){ //2개만 같은경

			}*/
			else{//없

			}
		}
	}
}
