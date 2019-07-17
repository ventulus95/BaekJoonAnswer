package codeBaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No14499_diceRolling {
	static int n,m,x,y,k;
	static int [][] map;
	static int sero[] = new int [4];
	static int garo[] = new int [4];
	static int dx[]= {0,0,0,-1,1};
	static int dy[] ={0,1,-1,0,0}; //1,2,3,4에 따른 방향성.

	//세로면의 바닥면은 주사위에 가져오고 상단은 출력하는 함수.
	static void seroPrint(int i, int j){
		if(map[i][j]==0){
			map[i][j] = sero[1];
			garo[1] = sero[1];
		}
		else{ //0이 아니라면
			sero[1] = map[i][j];
			garo[1] = sero[1];
			map[i][j] = 0;
		}
		System.out.println(sero[3]);
	}

	//가로면의 바닥면은 주사위에 가져오고 상단은 출력하는 함수.
	static void garoPrint(int i, int j){
		if(map[i][j]==0){
			map[i][j]= garo[1];
			sero[1] = garo[1];
		}
		else{
			garo[1] = map[i][j];
			sero[1] = garo[1];
			map[i][j] =0;
		}
		System.out.println(garo[3]);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tc = br.readLine();
		StringTokenizer st= new StringTokenizer(tc, " ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		x = Integer.parseInt(st.nextToken())+1;
		y = Integer.parseInt(st.nextToken())+1;
		k = Integer.parseInt(st.nextToken());
		map = new int [n+2][m+2];
		//주사위 면의 숫자 0으로 초기화.
		Arrays.fill(sero, 0);
		Arrays.fill(garo, 0);
		//지도 Mapping
		for(int i=0; i<n+2; i++){
			Arrays.fill(map[i], -1);
		}
		for(int i=1; i<n+1; i++){
			String mapp = br.readLine();
			st = new StringTokenizer (mapp, " ");
			for(int j=1; j<m+1; j++){
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// 방향 받기.
		String d = br.readLine();
		st = new StringTokenizer(d," ");
		for(int i=0; i<k; i++){ // 방향별로 루틴 시작.
			int dir = Integer.parseInt(st.nextToken());
			x +=dx[dir];
			y +=dy[dir];
//			System.out.println("x, y :"+x+" , "+y+" map[x][y]: "+map[x][y]);
//			for(int a=1; a<n+1; a++){
//				for(int b=1; b<m+1; b++){
//					System.out.print(map[a][b]+" ");
//				}
//				System.out.println();
//			}
			/*System.out.print("sero[]: ");
			for(int a=0; a<4; a++){
				System.out.print(sero[a]+" ");
			}
			System.out.println();
			System.out.print("garo[]: ");
			for(int a=0; a<4; a++){
				System.out.print(garo[a]+" ");
			}
			System.out.println();*/

			if(map[x][y]!=-1){ //이동시 밖으로 이동하지 않은 경우면 진행. 
				if(dir==1 || dir==2){ //동쪽 과 서쪽.
					if(dir==1){//동쪽.
						int temp = garo[0];
						for(int j=0; j<3; j++){ //가로면의 순서를 섞는 과정.
							garo[j] = garo[j+1];
						}
						garo[3] = temp;
						sero[1] = garo[1];
						sero[3] = garo[3];
						garoPrint(x,y); 
					}
					else{ //서쪽.
						int temp = garo[3];
						for(int j=3; j>0; j--){ //가로면의 순서를 섞는 과정. 반대방향으로.
							garo[j] = garo[j-1];
						}
						garo[0] = temp;
						sero[1] = garo[1];
						sero[3] = garo[3];
						garoPrint(x,y);
					}
				}
				if(dir==3 || dir==4){ //북쪽 과 남쪽.
					if(dir==3){//북쪽.
						int temp = sero[0]; //세로면의 순서를 섞는 과정.
						for(int j=0; j<3; j++){
							sero[j] = sero[j+1];
						}
						sero[3] = temp;
						garo[1] = sero[1];
						garo[3] = sero[3];
						seroPrint(x,y);
					}
					else{ //남쪽.
						int temp = sero[3]; //세로면의 순서를 섞는 과정. 반대방향으로.
						for(int j=3; j>0; j--){
							sero[j] = sero[j-1];
						}
						sero[0] = temp;
						garo[1] = sero[1];
						garo[3] = sero[3];
						seroPrint(x,y); 
					}
				}
			}
			else{
				x -=dx[dir];
				y -=dy[dir];
			}
		}




	}

}
