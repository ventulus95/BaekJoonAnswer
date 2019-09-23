/** 2019. 9. 23. 오전 3:23:43
 * @author ventulus95
 */
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2246_HolidayHotel {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		node hotel[] = new node[t];
		int num = 0;
		for(int i =0; i<t; i++){
			String tc = br.readLine();
			st = new StringTokenizer(tc, " ");
			int dst = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			hotel[i] = new node(dst,cost);
		}
		for(int i=0; i<t; i++){
			node temp = hotel[i];
			boolean check = true; 
			for(int j=0; j<t; j++){
				if(i!=j){
//					X보다 바닷가에 더 가까운 콘도들은 모두 X보다 숙박비가 더 비싸다.
					if(temp.dst >= hotel[j].dst){
						if(temp.cost>hotel[j].cost){
//							System.out.println("삑! 탈출입니다."+temp.cost);
							check = false;
							break;
						}
					}
//					X보다 숙박비가 더 싼 콘도들은 모두 X보다 바닷가에서 더 멀다.
					if(temp.cost>= hotel[j].cost){
						if(temp.dst>hotel[j].dst){
//							System.out.println("삑! 탈출입니다."+temp.cost);
							check = false;
							break;
						}
					}
				}
			}
			if(check==true){
//				System.out.println("exit num++!");
				num++;
			}
		}
		System.out.println(num);
	}

}

class node{
	int dst, cost;
	
	public node(int x, int y){
		this.dst = x;
		this.cost =y;
	}
}