package codeBaekJoon;

import java.io.*;
import java.util.*;

public class No13459_ballExit {
	static int n,m,gx,gy,ans=0;
	static char board[][];
	static boolean visited[][][][];
	static boolean done = false;

	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tc = br.readLine();
		StringTokenizer st = new StringTokenizer(tc, " ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		board = new char[n][m];
		visited = new boolean [n][m][n][m];
		int srx=-1, sry=-1, sbx=-1,sby=-1;
		for(int i =0; i<n; i++){
			char temp[] = br.readLine().toCharArray();
			for(int j =0; j<m; j++){
				if(temp[j]=='R'){
					srx=i;
					sry=j;
				}
				else if(temp[j]=='B'){
					sbx = i;
					sby = j;
				}
				else if(temp[j]=='O'){
					gx = i;
					gy = j;
				}
				board[i][j] = temp[j];
			}
		}
		Queue<node> q = new LinkedList<node>();;
		q.offer(new node(0, srx, sry, sbx, sby));
		while(!q.isEmpty()&&!done){
			int cnt=q.peek().count;
			int rx=q.peek().rx;
			int ry=q.peek().ry;
			int bx=q.peek().bx;
			int by=q.peek().by;
			q.poll();
			if(cnt==10){
				break;
			}
			for(int i =0; i<4; i++){
				int dx[] = {0,0,1,-1};
				int dy[] = {1,-1,0,0};
				int rex = 0;
				int blue =0;
				int nrx=rx+dx[i], nry=ry+dy[i]; // 다음 빨간공 위치.
				int rmove =0; //빨간공 굴러간 횟수.
				while(board[nrx][nry]!='#'){ 
					rmove++;
					if(nrx==bx && nry == by){//파란공 만난경우.
						blue = rmove;
					}
					if(board[nrx][nry]=='O'){ //구멍에 빠진경
						rex = rmove;
					}
					nrx+=dx[i];
					nry+=dy[i];
				} //벽꿍하기 전까지 굴리기.
				boolean bex = false;
				boolean red = false;
				int nbx = bx+dx[i], nby = by+dy[i];
				int bmove=0;  //파란공 굴러간 횟수.
				while(board[nbx][nby]!='#'){ 
					bmove++;
					if(nbx==rx && nby == ry){// 빨간공을 만난 경우..
						red = true;
					}
					if(board[nbx][nby]=='O'){ //구멍에 빠진경
						bex = true;
					}
					nbx+=dx[i];
					nby+=dy[i];
				} //파란공 벽꿍하기 전까지 굴리기.
				//둘 다 안만난 경우. 
				if(blue==0&&!red){
					if(rex>0){
						ans =1;
						done = true;
						break;
					}
					else if(bex){
						continue;
					}
					else{
						q.offer(new node(cnt+1, rx+dx[i]*rmove, ry+dy[i]*rmove, bx+dx[i]*bmove, by+dy[i]*bmove));
					}
				}

				else if(blue!=0){ // 빨강공이 구르다가 파란공 만난경우.
					//구멍이 B보다 앞쪽에 있는 경우 하나 빼야댐
					if(rex>0){ //구멍에 빠진경우.
						if(rex<blue){
							ans=1;
							done = true;
							break;
						}
						continue;
					}
					else{ // 구멍에 안빠진경우.
						rmove--;
						q.offer(new node(cnt+1, rx+dx[i]*rmove, ry+dy[i]*rmove, bx+dx[i]*bmove, by+dy[i]*bmove));
					}
				}

				else{ //파란공이 구르다가 빨강공을 만난 경우.
					if(rex>0){
						continue;
					}
					else{
						bmove--;
						q.offer(new node(cnt+1, rx+dx[i]*rmove, ry+dy[i]*rmove, bx+dx[i]*bmove, by+dy[i]*bmove));
					}
				}
			} //for();
			
		} //queue; 
		System.out.println(ans);
	} // main 

} // class 

class node{
	int rx, ry, bx, by,count;
	public node(int count, int rx, int ry, int bx, int by){
		this.count = count;
		this.rx = rx;
		this.ry = ry;
		this.bx = bx;
		this.by = by;
	}
}
