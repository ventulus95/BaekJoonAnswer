package codeBaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main{
   static int n;
   static int cache[];
   static int s[];
    
    public static int dp(int x){
    	if(cache[x] != -1){
			return cache[x];
		}
    	else{
	        if(cache[x-2]==-1 && cache[x-3]==-1){
	            return cache[x] = Math.max(dp(x-3)+s[x-1]+s[x],dp(x-2)+s[x]);
	        }
	        else if(cache[x-2]==-1){
	            return cache[x] = Math.max(cache[x-3]+s[x-1]+s[x],dp(x-2)+s[x]);
	        }
	        else if(cache[x-3]==-1){
	            return cache[x] = Math.max(dp(x-3)+s[x-1]+s[x],cache[x-2]+s[x]);
	        }
	        else{
	            return cache[x] = Math.max(cache[x-3]+s[x-1]+s[x],cache[x-2]+s[x]);
	        }
    	}
    }

    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
       int n = Integer.parseInt(br.readLine());
       s = new int [n+5];
       cache = new int[n+5];
       Arrays.fill(cache,-1);
       for(int i=0; i<n; i++){
           s[i+1] = Integer.parseInt(br.readLine());
       }
       cache[1]=s[1];
       cache[2]=s[1]+s[2];
       cache[3]=Math.max(s[1]+s[3], s[2]+s[3]);
       dp(n);
       wr.write(String.valueOf(cache[n]));
       wr.flush();
       wr.close();
   }
}