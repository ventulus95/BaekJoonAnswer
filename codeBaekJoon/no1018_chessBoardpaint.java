package codeBaekJoon;
//https://www.acmicpc.net/board/view/24843 여기에 tc 좋은거 많아서 확인할것.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no1018_chessBoardpaint {
	static int n,m,count;
	static int min = Integer.MAX_VALUE;
	static int Bmap[][] = {{0,1,0,1,0,1,0,1},
			{1,0,1,0,1,0,1,0},
			{0,1,0,1,0,1,0,1},
			{1,0,1,0,1,0,1,0},
			{0,1,0,1,0,1,0,1},
			{1,0,1,0,1,0,1,0},
			{0,1,0,1,0,1,0,1},
			{1,0,1,0,1,0,1,0},};
	static int Wmap[][] = {{1,0,1,0,1,0,1,0},
			{0,1,0,1,0,1,0,1},
			{1,0,1,0,1,0,1,0},
			{0,1,0,1,0,1,0,1},
			{1,0,1,0,1,0,1,0},
			{0,1,0,1,0,1,0,1},
			{1,0,1,0,1,0,1,0},
			{0,1,0,1,0,1,0,1},};

	static void check(int board[][], int x, int y){
		count =0;
			int a=0, b=0;
			for(int i=x; i<x+8; i++){
				for(int j=y; j<y+8; j++){
					
					if(Bmap[a][b]!=board[i][j]){
						count++;
					}
					b++;
				}
				a++;
				b=0;
			}
			if(count<min){
				min = count;
			}
			count=0;
			a=0; b=0;
			for(int i=x; i<x+8; i++){
				for(int j=y; j<y+8; j++){
					if(Wmap[a][b]!=board[i][j]){
						count++;
					}
					b++;
				}
				a++;
				b=0;
			}
			if(count<min){
				min = count;
			}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s, " ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		int board[][] = new int[n][m];
		for(int i=0; i<n; i++){
			String a = br.readLine();
			for(int j=0; j<m; j++){
				if(a.charAt(j)=='B'){
					board[i][j] = 0;
				}
				else{
					board[i][j] = 1;
				}
			}
		}

		for(int i=0; i<=n-8; i++){
			for(int j=0; j<=m-8; j++){
				check(board,i,j);
			}
		}
		System.out.println(min);
		/*for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
					System.out.print(board[i][j]);
			}
			System.out.println();
		}*/
	}
}
