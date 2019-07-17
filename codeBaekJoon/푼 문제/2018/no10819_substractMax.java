package codeBaekJoon;
import java.util.*;
public class no10819_substractMax {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int max [] = new int [n];
 		for(int i =0; i<n; i++){
			max[i] =input.nextInt();
		}
 		Arrays.sort(max);
 		for(int t =0; t<n; t++){
 			System.out.print(max[t]+" ");
 		}
 		int substract[] = new int [n];
 		for(int k=0; k<n; k++){
 			if(k%2==0){
 			substract[k]=max[k/2];
 			}
 			if(k%2==1){
 				substract[k]=max[n-(k/2+1)];
 			}
 		}
 		int sum =0;
 		for(int v=0; v<n-1; v++){
 			int sub = substract[v]- substract[v+1];
 			sub = Math.abs(sub);
 			sum+=sub;
 		}
 		System.out.println(sum);
 		
	}

}
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
// 
//public class no10819_substractMax {
//    
//    static int max=0;
//    static int N;
//    
//    public static void main(String[] args) throws IOException{
//        
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        N =  Integer.parseInt(br.readLine());
//        int[] val = new int[N];
//        
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        for(int i=0; i<N; ++i){
//        val[i] = Integer.parseInt(st.nextToken());
//        }
//        
//        f(val, 0);
//        System.out.println(max);
//    
//    }
//    //순열 알고리즘(팩토리얼)
//    public static void f(int[] arr, int d){
//        
//        if(d == N){
//            return;
//        }
//        
//        for(int i=d; i<N; ++i){
//            swap(arr, d, i);
//            f(arr, d+1);
//            findMax(arr);
//            swap(arr, d, i);
//        }
//        
//    }
//    
//    //스왑
//    public static void swap(int[] arr, int d, int i){
//        int temp = arr[i];
//        arr[i] = arr[d];
//        arr[d] = temp;
//    }
//    
//    //최댓값 찾기
//    public static void findMax(int[] arr){
//        
//        int temp=0; 
//        int sum=0;
//        
//        for(int i=0; i<N-1; ++i){
//            temp=arr[i]-arr[i+1];
//            if(temp < 0){
//                temp*=-1;
//            }
//            sum+=temp;
//        }
//        
//        if(sum > max){
//            max = sum; 
//        }
//    }
//}
