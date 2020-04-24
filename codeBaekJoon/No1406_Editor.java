/** 2020. 3. 31. 오후 10:04:39
 * @author ventulus95
 */
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class No1406_Editor {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tc = br.readLine();
		LinkedList<Character> list = new LinkedList<>();
		for(int i=0; i<tc.length(); i++){
			list.add(tc.charAt(i));
		}
		ListIterator<Character> iter = list.listIterator(list.size());
		int n = Integer.parseInt(br.readLine());
		for(int i =0; i<n; i++){
			String t = br.readLine();
			if(t.length()==1){
				if(t.equals("L")){ //왼
					if(iter.hasPrevious())
						iter.previous();
				}
				else if(t.equals("D")){ //오른쪽.
					if(iter.hasNext())
						iter.next();
				}
				else if(t.equals("B")){ //지운다.
					if(iter.hasPrevious()){
						iter.previous();
						iter.remove();
					}
				}	
			}
			else{
				iter.add(t.charAt(2));
			}
		}
		for(char c : list){
			System.out.print(c);
		}
	}
}
