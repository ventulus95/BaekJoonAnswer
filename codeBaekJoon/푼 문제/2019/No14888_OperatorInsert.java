/** 2019.07.16
 * 
 */
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No14888_OperatorInsert {
	static int n, max=-1000000000, min=1000000000;
	static int num [],cNum[],opum[];
	static int oper[] = new int [4];
	
	 public static void perm(int[] arr, int pivot) { //연산자 순열로 섞어주는 것.
	        if (pivot == arr.length) { //깊이가 n이된경우.
	        	cNum = Arrays.copyOf(num, n); //받아 둔 숫자값이 꼬이면 안되니까 복사.
	        	int sum = cNum[0];
	        	for(int v = 1; v<n; v++){
	        		if(opum[v-1]==0){ // +
	        			sum += cNum[v];
	        		}
	        		else if(opum[v-1]==1){ // -
	        			sum -= cNum[v];
	        		}
	        		else if(opum[v-1]==2){ // *
	        			sum *= cNum[v];
	        		}
	        		else{ // /(나누기)
	        			if(sum<0){
	        				sum *= -1; //양수로 바꾸기.
	        				sum /= cNum[v];
	        				sum *= -1; // 몫을 음수로..
	        			}
	        			else{ //sum 양수면 그냥 나누면댐.
	        				sum /= cNum[v];
	        			}
	        		}
	        	}
	        	max = Math.max(max, sum);
	        	min = Math.min(min, sum);
	            return;
	        }

	        for (int i = pivot; i < arr.length; i++) { // 일단 섞어주면서 모든 경우 확인하는 
	            swap(arr, i, pivot);
	            perm(arr, pivot + 1);
	            swap(arr, i, pivot);
	        }

	    }

	    public static void swap(int[] arr, int i, int j) { 
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }

	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(br.readLine());
		String number = br.readLine();
		StringTokenizer st= new StringTokenizer(number, " ");
		num = new int [n];
		cNum = new int [n];
		for(int i=0; i<n; i++){
			num[i] = Integer.parseInt(st.nextToken());
		}
		String operator = br.readLine();
		st = new StringTokenizer(operator," ");
		int cnt =0;
		opum = new int [n-1];
		for(int i=0; i<4; i++){
			oper[i] = Integer.parseInt(st.nextToken());
			while(oper[i]!=0){
				opum[cnt] = i;
				oper[i]--;
 				cnt++;
			}
		}
		perm(opum, 0);
		bw.write(String.valueOf(max));
		bw.newLine();
		bw.write(String.valueOf(min));
		bw.flush();
		bw.close();
	}

}
