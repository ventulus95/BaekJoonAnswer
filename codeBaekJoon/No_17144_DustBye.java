/** 2020. 5. 28. 오후 2:38:15
 * @author ventulus95
 */
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class No_17144_DustBye {

	static int map[][], spreadMap[][];
	static int R,C,T, upy, upx, downy, downx;
	static int[] dx = {0,1,0,-1}; //위 오른 아래 왼
	static int[] dy = {1,0,-1,0};
	static Queue<node17144> q = new LinkedList<>();

	static void spread(){ //Xy가 반대.
		while(!q.isEmpty()){
			node17144 temp = q.poll();
			int amount = map[temp.x][temp.y];
			int cnt = 0;
			for(int i=0; i<4; i++){
				int x = temp.x+dx[i];
				int y = temp.y+dy[i];
				if(map[x][y] != -1){
					spreadMap[x][y] += amount/5;
					cnt++;
				}
			}
			amount -= (amount/5)*cnt;
			spreadMap[temp.x][temp.y] += amount;
		}
	}

	static void aircleaner(){
		for (int i = upy - 1; i > 0; i--)
			spreadMap[i][1] = spreadMap[i - 1][1];
		// 청정기 아래 왼쪽
		for (int i = downy + 1; i < R ; i++)
			spreadMap[i][1] = spreadMap[i + 1][1];
		// 제일 위줄
		for (int i = 1; i <=C ; i++)
			spreadMap[1][i] = spreadMap[1][i + 1];
		// 제일 아래 줄
		for (int i = 1; i <= C; i++)
			spreadMap[R ][i] = spreadMap[R][i + 1];
		// 청정기 위 오른쪽
		for (int i = 1; i <= upy; i++)
			spreadMap[i][C ] = spreadMap[i + 1][C];
		// 청정기 아래 오른쪽
		for (int i = R ; i >= downy; i--)
			spreadMap[i][C] = spreadMap[i - 1][C];
		// 가운데 두 줄
		for (int i = C ; i > 2; i--) {
			spreadMap[upy][i] = spreadMap[upy][i - 1];
			spreadMap[downy][i] = spreadMap[downy][i - 1];
		}
		spreadMap[upy][2] = 0;
		spreadMap[downy][2] = 0;
//				int sx = 1;
//				int sy = upy-2;
//				while(sy>0){
//					spreadMap[sy+1][1] = spreadMap[sy][1]; //첫열위로 끝까지.
//					sy--;
//				}
//				while(sx<=R){
//					spreadMap[1][sx] = spreadMap[1][sx+1]; //첫행 오른쪽 끝까지.
//					sx++;
//				}
//				sy++;
//				while(sy<upy){
//					spreadMap[sy][C] = spreadMap[sy+1][C]; // 마지막열 아래로 
//					sy++;
//				}
//				while(sx>2){
//					spreadMap[upy][sx] = spreadMap[upy][sx-1]; //마지먹열 왼쪽으로.
//					sx--;
//				}
//				spreadMap[upy][sx] = 0;
//				int sdx = 1;
//				int sdy = downy+1;
//				while(sdy<R){
//					spreadMap[sdy][1] = spreadMap[sdy+1][1]; // 첫번째열 아래로 
//					sdy++;
//				}
//				while(sdx<C){
//					spreadMap[R][sdx] = spreadMap[R][sdx+1]; //첫행 오른쪽 끝까지.
//					sdx++;
//				}
//				while(sdy>downy){
//					spreadMap[sdy][C] = spreadMap[sdy-1][C]; //첫열위로 끝까지.
//					sdy--;
//				}
//				while(sdx>2){
//					spreadMap[downy][sdx] = spreadMap[downy][sdx-1]; //머자먹열 오른쪽으로.
//					sdx--;
//				}
//				spreadMap[downy][sdx] = 0;

	}

	static void copy() {
		for(int i=1; i<R+1; i++){
			for(int j=1; j<C+1; j++){
				map[i][j] = spreadMap[i][j];
				if(spreadMap[i][j] > 0){
					q.add(new node17144(i, j));
				}
				spreadMap[i][j] = 0;
			}
		}
		spreadMap[upy][upx] = -1;
		spreadMap[downy][downx] = -1;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tc  = br.readLine();
		StringTokenizer st = new StringTokenizer(tc, " ");
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		T = Integer.parseInt(st.nextToken());
		map = new int[R+2][C+2];
		spreadMap = new int[R+2][C+2];
		for(int i=0; i<R+2; i++){
			Arrays.fill(map[i], -1);
			Arrays.fill(spreadMap[i], -1);
		}
		for(int i=1; i<R+1; i++){
			String t = br.readLine();
			st = new StringTokenizer(t, " ");
			for(int j=1; j<C+1; j++){
				map[i][j] =Integer.parseInt(st.nextToken());
				spreadMap[i][j] = 0;
				if(map[i][j] > 0 ){
					q.add(new node17144(i, j));
				}
				if(map[i][j] == -1 && upx !=0 ){
					downy = i;
					downx = j;
					spreadMap[i][j] = -1;
				}
				if(map[i][j] == -1 && upx ==0 ){
					upy = i;
					upx = j;
					spreadMap[i][j] = -1;
				}
			}
		}
		while(T>0){
			//1. 미세먼지 확산
			spread();
			//2. 공기청정기를 통한 이동
			aircleaner();
			/*for(int i=0; i<R+2; i++){
				for(int j=0; j<C+2; j++){
					System.out.print(spreadMap[i][j]+ " ");
				}
				System.out.println();
			}*/
			//3. 복사 후 큐에 다시 넣기.
			copy();
			T--;

		}
		int cnt =0; 
		for(int i=0; i<R+2; i++){
			for(int j=0; j<C+2; j++){
				if(map[i][j]>0)
					cnt += map[i][j]; 
			}
		}
		System.out.println(cnt);
	}
}

class node17144{
	int x,y;

	public node17144(int x, int y){
		this.x = x;
		this.y = y;
	}
}
