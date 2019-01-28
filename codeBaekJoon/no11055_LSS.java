package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no11055_LSS {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String t = br.readLine();
		StringTokenizer st = new StringTokenizer(t," ");
		int arr[] = new int [n];
		int cache[] = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = Integer.parseInt(st.nextToken());
			cache[i] = arr[i];
		}
		int max = 1;
		for(int i=0; i<n; i++){
			for(int j=0; j<i; j++){
				if(arr[i]>arr[j] &&cache[i]<cache[j]+arr[i]){
						cache[i]=cache[j]+arr[i];
					}
				}
			
			max = Math.max(max, cache[i]);
		}
		System.out.println(max);
		
	}
}

