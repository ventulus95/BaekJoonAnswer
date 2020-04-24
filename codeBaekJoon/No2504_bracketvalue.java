/** 2020. 4. 2. 오후 4:32:28
 * @author ventulus95
 */
package codeBaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class No2504_bracketvalue {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String t = br.readLine();
		Stack<String> stack = new Stack();
		boolean correct = true;
		int total = 0;
		for(int i=0; i<t.length(); i++){
			String curr = String.valueOf(t.charAt(i));
			if(curr.equals("(") || curr.equals("[")){
				stack.push(curr);
			}
			else{
				if(curr.equals(")")){
					if(!stack.isEmpty()){
						String pop = (String) stack.pop();
						if(pop.equals("(")){
							stack.push("2");
						}
						else if(pop.equals("[")){
							total = 0;
							correct = false;
							break;
						}
						else{
							int s = Integer.parseInt(pop);
							if(!stack.isEmpty())
								pop = (String)stack.pop();
							else{
								total = 0;
								correct = false;
								break;
							}
							while(!pop.equals("[") && !pop.equals("(")){
								s += Integer.parseInt(pop);
								if(!stack.isEmpty())
									pop = (String)stack.pop();
								else{
									total = 0;
									correct = false;
									break;
								}
							}
							if(pop.equals("(")){
								s *= 2;
								stack.push(String.valueOf(s));
							}
						}
					}
					else{
						total = 0;
						correct = false;
						break;
					}
				}
				if(curr.equals("]")){
					if(!stack.isEmpty()){
						String pop = (String) stack.pop();
						if(pop.equals("[")){
							stack.push("3");
						}
						else if(pop.equals("(")){
							total = 0;
							correct = false;
							break;
						}
						else{
							int s = Integer.parseInt(pop);
							if(!stack.isEmpty())
								pop = (String)stack.pop();
							else{
								total = 0;
								correct = false;
								break;
							}
							while(!pop.equals("[") && !pop.equals("(")){
									s += Integer.parseInt(pop);
								if(!stack.isEmpty())
									pop = (String)stack.pop();
								else{
									total = 0;
									correct = false;
									break;
								}
							}
							if(pop.equals("[")){
								s *= 3;
								stack.push(String.valueOf(s));
							}
						}
					}
					else{
						total = 0;
						correct = false;
						break;
					}
				}
			}
		}
		if(correct == true)
			while(!stack.isEmpty()){
				String temp = stack.pop();
				if(!temp.equals("(") && !temp.equals("["))
					total+=Integer.parseInt(temp);
				else{
					total = 0; 
					break;
				}
			}
		System.out.print(total);

	}

}
