package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no14500_tetromino {
	static int map [][];
	static int x, y;
	static int max=0;

	static void dfs(int a, int b){
		int sum=0;
		// 1-1. 직선 case (세로 놓기)
		sum += map[a][b];
		sum += map[a+1][b];
		sum += map[a+2][b];
		sum += map[a+3][b];
		if(max<sum){
			max = sum;
		}
		// 1-2 직선 case (가로 놓기)
		sum=0;
		sum += map[a][b];
		sum += map[a][b+1];
		sum += map[a][b+2];
		sum += map[a][b+3];
		if(max<sum){
			max = sum;
		} 
		// 2. 네모 case 
		sum=0;
		sum += map[a][b];
		sum += map[a+1][b];
		sum += map[a+1][b+1];
		sum += map[a][b+1];
		if(max<sum){
			max = sum;
		}
		// 3-1. ㄴ case // 왼상단시작 오른 하단 종료. (반시계방향)
		sum=0;
		sum += map[a][b];
		sum += map[a+1][b];
		sum += map[a+2][b];
		sum += map[a+2][b+1];
		if(max<sum){
			max = sum;
		}
		// 3-1-2. ㄴ case // 왼상단시작 오른 하단 종료. (반시계방향)의 대칭.
		sum=0;
		sum += map[a][b+1];
		sum += map[a+1][b+1];
		sum += map[a+2][b+1];
		sum += map[a+2][b];
		if(max<sum){
			max = sum;
		}

		// 3-2. ㄴ case // 왼하단시작 오른 상단 종료.
		sum=0;
		sum += map[a][b];
		sum += map[a+1][b];
		sum += map[a][b+1];
		sum += map[a][b+2];
		if(max<sum){
			max = sum;
		}
		// 3-2-2. ㄴ case // 왼하단시작 오른 상단 종료. 의 대
		sum=0;
		sum += map[a][b];
		sum += map[a+1][b+2];
		sum += map[a][b+1];
		sum += map[a][b+2];
		if(max<sum){
			max = sum;
		}


		// 3-3. ㄴ case // 왼상단시작 오른 하단 종료 (시계방향) 
		sum=0;
		sum += map[a][b];
		sum += map[a][b+1];
		sum += map[a+1][b+1];
		sum += map[a+2][b+1];
		if(max<sum){
			max = sum;
		}
		// 3-3-2. ㄴ case // 왼상단시작 오른 하단 종료 (시계방향) 의 대칭
		sum=0;
		sum += map[a][b];
		sum += map[a][b+1];
		sum += map[a+1][b];
		sum += map[a+2][b];
		if(max<sum){
			max = sum;
		}
		// 3-4. ㄴ case // 오른 상단시작  왼 하단 종료
		sum=0;
		sum += map[a][b+2];
		sum += map[a+1][b+2];
		sum += map[a+1][b+1];
		sum += map[a+1][b];
		if(max<sum){
			max = sum;
		}
		// 3-4-2. ㄴ case // 오른 상단시작  왼 하단 종료 의 대칭  
		sum=0;
		sum += map[a+1][b+2];
		sum += map[a+1][b+1];
		sum += map[a+1][b];
		sum += map[a][b];
		if(max<sum){
			max = sum;
		}
		
		// 4-1. ㄴㄱ case // 왼상단시작 오른 하단 종료.  (ㄴㄱ)
		sum=0;
		sum += map[a][b];
		sum += map[a+1][b];
		sum += map[a+1][b+1];
		sum += map[a+2][b+1];
		if(max<sum){
			max = sum;
		}
		// 4-2. ㄴㄱ case // 오른 상단시작  하단 종료. 
		sum=0;
		sum += map[a][b+2];
		sum += map[a][b+1];
		sum += map[a+1][b+1];
		sum += map[a+1][b];
		if(max<sum){
			max = sum;
		}
		// 4-3. ㄴㄱ case // 왼하단시작 오른 상단 종료. 
		sum=0;
		sum += map[a+2][b];
		sum += map[a+1][b];
		sum += map[a+1][b+1];
		sum += map[a][b+1];
		if(max<sum){
			max = sum;
		}
		// 4-4. ㄴㄱ case // 왼상단시작 오른 하단 종료.  (ㄱㄴ꼴)
		sum=0;
		sum += map[a][b];
		sum += map[a][b+1];
		sum += map[a+1][b+1];
		sum += map[a+1][b+2];
		if(max<sum){
			max = sum;
		}
		// 5-1.  ㅗ  case //  ㅜ
		sum=0;
		sum += map[a][b];
		sum += map[a][b+1];
		sum += map[a][b+2];
		sum += map[a+1][b+1];
		if(max<sum){
			max = sum;
		}
		// 5-2.  ㅗ  case // ㅓ  
		sum=0;
		sum += map[a][b+1];
		sum += map[a+1][b+1];
		sum += map[a+2][b+1];
		sum += map[a+1][b];
		if(max<sum){
			max = sum;
		}
		// 5-3.  ㅗ  case //  ㅗ  
		sum=0;
		sum += map[a+1][b];
		sum += map[a+1][b+1];
		sum += map[a+1][b+2];
		sum += map[a][b+1];
		if(max<sum){
			max = sum;
		}	
		// 5-4.  ㅗ  case //  ㅏ  
		sum=0;
		sum += map[a][b];
		sum += map[a+1][b];
		sum += map[a+2][b];
		sum += map[a+1][b+1];
		if(max<sum){
			max = sum;
		}


	}



	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String p = br.readLine();
		StringTokenizer st = new StringTokenizer(p, " ");
		y = Integer.parseInt(st.nextToken());
		x = Integer.parseInt(st.nextToken());
		map = new int[x+6][y+6];
		for(int i = 3; i<y+3; i++){
			p = br.readLine();
			st = new StringTokenizer(p, " ");
			for(int j = 3; j<x+3; j++){
				map[j][i] = Integer.parseInt(st.nextToken());
			}
		}
		for(int j=0; j<x+3; j++){
			for(int i=0; i<y+3; i++){
				dfs(j, i);  //x, y랑 값바꿔서 틀림...
			}
		}
		System.out.println(max);
/*
			for(int i = 0; i<y+6; i++){
			for(int j = 0; j<x+6; j++){
				System.out.print(map[j][i]+" ");
			}
			System.out.println();
		}*/
	}
}
