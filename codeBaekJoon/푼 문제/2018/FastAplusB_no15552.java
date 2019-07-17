package codeBaekJoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class FastAplusB_no15552 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String line = br.readLine();
		int T = Integer.parseInt(line);
		while(T>0) {
			StringTokenizer token = new StringTokenizer(br.readLine(), " ");
			while(token.hasMoreTokens()){
				int A = Integer.parseInt(token.nextToken());
				int B = Integer.parseInt(token.nextToken());
				out.write(String.valueOf(A+B));
				out.write("\n");
			}
			T--;
		}
		out.flush();
		out.close();
	}

}
