/*2019.02.09 문자열 처리 .. 
*/
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1357_ReversePlus {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st= new StringTokenizer(s, " ");
		String xs = st.nextToken();
		StringBuffer xss = new StringBuffer();
		String ys = st.nextToken();
		StringBuffer yss = new StringBuffer();
		for(int i =xs.length()-1; i>=0; i--){
			xss.append(xs.charAt(i));
		}
		for(int i =ys.length()-1; i>=0; i--){
		yss.append(ys.charAt(i));
		}
		int x = Integer.parseInt(xss.toString());
		int y = Integer.parseInt(yss.toString());
		int sum = x+y;
		String SUM = String.valueOf(sum);
		StringBuffer result = new StringBuffer();
		for(int i =SUM.length()-1; i>=0; i--){
			result.append(SUM.charAt(i));
		}
		System.out.println(Integer.parseInt(result.toString()));
	}
}
