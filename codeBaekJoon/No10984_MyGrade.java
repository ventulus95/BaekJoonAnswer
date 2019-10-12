/** 2019. 10. 9. 오후 4:03:15
 * @author ventulus95
 */
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No10984_MyGrade {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i =0; i<T; i++){
			int n = Integer.parseInt(br.readLine());
			int gradePointSum = 0;
			float gradeSum = 0;
			for(int j =0; j<n; j++){
				String tc = br.readLine();
				st = new StringTokenizer(tc, " ");
				int gradepoint = Integer.parseInt(st.nextToken());
				float grade =  Float.parseFloat(st.nextToken());
				gradePointSum += gradepoint;
				gradeSum += grade*gradepoint;
			}
			System.out.println(gradePointSum+" "+Math.round(gradeSum*10/gradePointSum)/10.0);
		}
			
	}

}
