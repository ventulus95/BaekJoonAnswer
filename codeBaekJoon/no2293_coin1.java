package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no2293_coin1 {
	static int cache[] ;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String p = br.readLine();
		StringTokenizer st = new StringTokenizer(p, " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int arr[] = new int [n];
		for(int i=0; i<n; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		cache = new int[n];
		Arrays.sort(arr);
		cache[0] =1 ;
		for(int i =1; i<n; i++){
			if(arr[i]%arr[i-1]==0){
				cache[i] = arr[i]/arr[i-1];
			}
			else{
				cache[i] = arr[i]/arr[i-1]+1;
			}
		}
		System.out.println((cache[n-1]*cache[n-1]) +1);
	
	
	}
}
