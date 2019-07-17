package codeBaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;



public class No10026_CowArt {
	static int n,num, rgnum, eq;
	static int map[][];
	static boolean visited[][],rgvisited[][];
	static int dx[] = {0,1,0,-1};
	static int dy[] = {1,0,-1,0};
	
	public static void dfs(int i, int j){
		eq = map[i][j];
		visited[i][j] = false;
		for(int v = 0; v<4; v++){
			if(map[i+dx[v]][j+dy[v]] == eq && visited[i+dx[v]][j+dy[v]]==true){
				dfs(i+dx[v],j+dy[v]);
			}
		}
	}
	
	public static void rgdfs(int i, int j){
		eq = map[i][j];
		rgvisited[i][j] = false;
		for(int v = 0; v<4; v++){
			if(map[i+dx[v]][j+dy[v]] == eq && rgvisited[i+dx[v]][j+dy[v]]==true){
				rgdfs(i+dx[v],j+dy[v]);
			}
			if((map[i+dx[v]][j+dy[v]] == 2 && eq==1) || (map[i+dx[v]][j+dy[v]] ==1 && eq==2)  && rgvisited[i+dx[v]][j+dy[v]]==true){
				rgdfs(i+dx[v],j+dy[v]);
			}
		}
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedReader br = new BufferedReader(new FileReader("/Users/LeeChnagSup/Desktop/input.txt"));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(br.readLine());
		map = new int [n+2][n+2];
		visited = new boolean [n+2][n+2];
		rgvisited = new boolean [n+2][n+2];
		for(int i=0; i<n+2; i++){
			Arrays.fill(map[i], -1);
			Arrays.fill(visited[i], false);
			Arrays.fill(rgvisited[i], false);
		}
		for(int i=1; i<n+1; i++){
			String s = br.readLine();
			for(int j=0; j<n; j++){
				char c = s.charAt(j);
				if(c=='R'){
					map[i][j+1] = 1;
					visited[i][j+1] = true;
					rgvisited[i][j+1] = true;
				}
				if(c=='G'){
					map[i][j+1] = 2;
					visited[i][j+1] = true;
					rgvisited[i][j+1] = true;
				}
				if(c=='B'){
					map[i][j+1] = 3;
					visited[i][j+1] = true;
					rgvisited[i][j+1] = true;
				}
				
			}
		}
		for(int i = 1; i<n+1; i++){
			for(int j =1; j<n+1; j++){
				if(visited[i][j]==true){
					num++;
					dfs(i,j);
				}
			}
		}
		for(int i = 1; i<n+1; i++){
			for(int j =1; j<n+1; j++){
				if(rgvisited[i][j]==true){
					rgnum++;
					rgdfs(i,j);
				}
			}
		}
		
		bw.write(String.valueOf(num)+" ");
		bw.write(String.valueOf(rgnum));
		bw.flush();
		bw.close();
	}

}
