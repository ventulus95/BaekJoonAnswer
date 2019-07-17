package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no1987_alphabet {
	static int count = 0; 
	static int max  = 0;
	static char map[][];
	static boolean alpha [];
	static int dx[] = {-1, 0, 1, 0};
	static int dy[] = {0, 1, 0 , -1};
	static void search(int x, int y){
		alpha[map[x][y]-'A'] = true;
		count++;
		max = Math.max(count, max);
		for(int i=0; i<4; i++){
		if(map[x+dx[i]][y+dy[i]]>='A'&&map[x+dx[i]][y+dy[i]]<='Z'&& alpha[map[x+dx[i]][y+dy[i]]-'A']==false){
			search(x+dx[i], y+dy[i]);
			}
		}
		alpha[map[x][y]-'A'] = false;
		count--;
		
	}	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		StringTokenizer st = new StringTokenizer(a, " ");
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		alpha = new boolean[26];
		map = new char[R+2][C+2];
		Arrays.fill(alpha, false);
		for(int i=0; i<R+2; i++){
			Arrays.fill(map[i], ' ');
		}
		for(int i =1; i<R+1; i++){
			String b = br.readLine();
			for(int j=1; j<C+1; j++){
				map[i][j] =  b.charAt(j-1);
			}
		}
		search(1,1);
		System.out.println(max);
	}
}
