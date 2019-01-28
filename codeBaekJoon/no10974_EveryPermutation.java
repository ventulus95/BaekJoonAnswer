package codeBaekJoon;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no10974_EveryPermutation {
	static String output ="";
	
	public static void perm(int[] a, int depth, int n){
		if(depth==n){
			print(a, n);
			
			return;
		}
		for(int i=depth; i<n; i++){
			Rswap(a, depth, i);
			perm(a, depth+1, n);
			Lswap(a, depth, i);
		}
	}
	
	
	static void Rswap(int[] a, int depth, int n) { // 순서 섞주 depth값에 따라서 앞으로 땡겨주기.
		int temp = a[n];
		for(int i= n; i>depth; i--){
			a[i] = a[i-1];
		}
		a[depth] = temp;
//		System.out.print("R순열 바뀐순서: ");
//		for(int i=0; i<3; i++){
//			System.out.print(a[i]+" ");
//		}
//		System.out.println();
		
		
	}
	static void Lswap(int[] a, int depth, int n) { //원래 순서로 돌리기  1 2 3으로 초기값으로 돌리
		int temp = a[depth];
		for(int i= depth; i<n; i++){
			a[i] = a[i+1];
		}
		a[n] = temp;
//		System.out.print("L순열 바뀐순서: ");
//		for(int i=0; i<3; i++){
//			System.out.print(a[i]+" ");
//		}
//		System.out.println();
	}


	static void print(int[] a, int k) {
		for (int i = 0; i < k; i++) { 
			output+=a[i]+" ";
		}

	}


	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	BufferedReader br = new BufferedReader(new FileReader(new File("/Users/LeeChnagSup/Desktop/Data1.txt")));
	int N = Integer.parseInt(br.readLine());
	int per[] = new int[N];
	for(int i =0; i<N; i++){
		per[i] = i+1;
	}
	perm(per, 0, N);
	}
}
