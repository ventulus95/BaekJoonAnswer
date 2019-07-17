/* 2019.02.08 이진 탐색하기 
 * 이진탐색 알고리즘을 사용하려면, 
 * Arrays.binaraySearch를 사용하려면 "정렬된" 배열을 사용해야합니다.
*/
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class no1920_findNum {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int a[] = new int [n+1];
		String ns = br.readLine();
		StringTokenizer st= new StringTokenizer(ns, " ");
		for(int i =1; i<n+1; i++){
			a[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(a);
		int m = Integer.parseInt(br.readLine());
		String ms = br.readLine();
		StringTokenizer st1= new StringTokenizer(ms, " ");
		for(int i=0; i<m; i++){
//			System.out.println(a[i+1]);
			if(Arrays.binarySearch(a, Integer.parseInt(st1.nextToken()))>0){
				System.out.println(1);
			}
			else{
				System.out.println(0);
			}
			
		}
	}
}
