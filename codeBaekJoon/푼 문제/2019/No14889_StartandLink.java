
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No14889_StartandLink {
	static int n,tsSum,tlSum,min=Integer.MAX_VALUE;
	static int arr[], teamStart[], teamLink[],cteamStart[], cteamLink[], sx[], lx[]; 
	static int map[][];
	static boolean visited[]; 
	

	static void teamDfs(int index ,int depth){
		if(depth==n/2){ // 재귀 탈출 조건.
			int cnt =0;
			for(int i =0; i<n; i++){ //teamStart에서 안뽑힌 인원을 teamLink로 다 뽑아가기.
				if(visited[i]==false){
					teamLink[cnt] = i;
					cnt++;
				}
			}
			tsSum = 0;
			tlSum = 0;
			cteamStart = Arrays.copyOf(teamStart, n/2);
			cteamLink =Arrays.copyOf(teamLink, n/2);
			sumDfs(0);
			/*for(int i=0; i<cteamStart.length; i++){
				System.out.print(cteamStart[i]+" ");
			}
			System.out.println();
			for(int i=0; i<cteamLink.length; i++){
				System.out.print(cteamLink[i]+" ");
			}
			System.out.println();
			System.out.println("tsS: "+tsSum);
			System.out.println("tlS: "+tlSum);
			System.out.println("diff : "+Math.abs(tsSum-tlSum));*/
			min = Math.min(min, Math.abs(tsSum-tlSum));
			return;
		}
		for(int i=index; i<n; i++){
			if(visited[i]!=true){
				visited[i] = true;
				teamStart[depth] = i;
				teamDfs(i+1, depth+1);
				visited[i] = false; 
			}
		}
	}

	static void sumDfs(int depth){ // 모든 팀원의 경우를 찾아서 더하는 dfs.
		if(depth==2){ // 재귀 탈출 조건.
			for(int i=0; i<2; i++){
				System.out.println(i+": sx: "+sx[i]+" lx: "+lx[i]);
			}
			tsSum += map[sx[0]][sx[1]]; //저장한 좌표를 map에서 찾아서 각 팀마다 합을 찾아서 더하는 것.
			tlSum += map[lx[0]][lx[1]];
			return;
		}
		//		System.out.println("sumdfs depth: "+depth);
		for(int i=0; i<n/2; i++){
			if(cteamStart[i]>=0 && cteamLink[i]>=0){ //동시에 map에 있는 걸 찾아서 더해줘야해서 두팀원을 뽑기위한 dfs
				sx[depth] = cteamStart[i]; //스타트와 링크의 map상 좌표를 sx, lx배열에 저장
				lx[depth] = cteamLink[i];
				cteamStart[i]=-1; // -1로 만들어서 dfs시 두경우를 따지는 경우를 삭제
				cteamLink[i]=-1;
				sumDfs(depth+1);
				cteamStart[i] = teamStart[i]; //여러가지 경우를 하기위해서 원래 배열에서 다시 clone배열에 복붙.
				cteamLink[i] = teamLink[i];
			}
		}
		/*for(int i = 0; i < teamStart.length; i ++) {
            for(int j = i + 1; j < teamStart.length; j ++) {
                tsSum += map[teamStart[i]][teamStart[j]] + map[teamStart[j]][teamStart[i]];
            }
        }
		for(int i = 0; i < teamLink.length; i ++) {
            for(int j = i + 1; j < teamLink.length; j ++) {
                tlSum += map[teamLink[i]][teamLink[j]] + map[teamLink[j]][teamLink[i]];
            }
        }*/
	}


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(br.readLine());
		map = new int [n][n];
		arr = new int[n];
		visited= new boolean [n];
		sx = new int[2];
		lx = new int[2];
		teamStart = new int [n/2];
		teamLink = new int [n/2];
		cteamStart = new int [n/2];
		cteamLink = new int [n/2];
		Arrays.fill(arr, 1); //뽑아서 팀짤 조원 1로 각 배열에 넣는 것.
		StringTokenizer st;
		for(int i =0; i<n; i++){
			String m = br.readLine(); 
			st = new StringTokenizer(m, " ");
			for(int j=0; j<n; j++){
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		} //인풋값 가져오기. 
		teamDfs(0,0);
		bw.write(String.valueOf(min));
		bw.flush();
		bw.close();


	}

}
