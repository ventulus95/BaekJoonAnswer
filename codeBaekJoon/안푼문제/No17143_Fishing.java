package codeBaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

class sharkInfo {
	int x, y,speed,dir,size;

	public sharkInfo(int x, int y, int s, int d, int z){
		this.x = x;
		this.y = y;
		this.speed = s;
		this.dir = d;
		this.size = z;
	}
	
	public void move(){
		int temp = speed;
		while(temp!=0){
			if(this.dir==1){// 위 방향
				this.y -= this.speed;
				if(this.y<=0){
					
				}
			}
			else if(this.dir==2){ // 아래 방향.
				
			}
			else if(this.dir==3){ //오른쪽 방향.
				
			}
			else{ // 왼쪽방향.
				
			}
		}
			
	}
}

public class No17143_Fishing {
	static int r,c,m;
	static sharkInfo map[][];
	static sharkInfo temp[][];
	static sharkInfo shark[];

	public static void main(String[] args) throws NumberFormatException, IOException {
		//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new FileReader("/Users/LeeChnagSup/Desktop/input.txt"));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String init = br.readLine();
		StringTokenizer st = new StringTokenizer(init, " ");
		r= Integer.parseInt(st.nextToken());
		c= Integer.parseInt(st.nextToken());
		m= Integer.parseInt(st.nextToken());
		map = new sharkInfo [r+2][c+2];
		temp= new sharkInfo [r+2][c+2];
		shark = new sharkInfo [m+1]; 
		for(int i=0; i<m; i++){
			String a = br.readLine();
			st = new StringTokenizer(a, " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			int z = Integer.parseInt(st.nextToken());
			map[x][y] = new sharkInfo(x,y,s,d,z);
			temp[x][y] = new sharkInfo(x,y,s,d,z);
			shark[i] = temp[x][y];
		}


	}
}

