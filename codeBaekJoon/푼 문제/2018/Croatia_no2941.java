package codeBaekJoon;
import java.util.*;

public class Croatia_no2941 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String alpha = input.next();
		String arr[] = new String [alpha.length()];
		for(int i=0; i<alpha.length();i++){
			arr[i]=alpha.charAt(i)+"";
		}
		int count =0;
		for(int j=0; j<arr.length-2; j++){
			if(arr[j].equals("d")&&arr[j+1].equals("z")&&arr[j+2].equals("=")){
				count++;
				arr[j]="";
				arr[j+1]="";
				arr[j+2]="";
			}
		}
		for(int j=0; j<arr.length-1; j++){
			if(arr[j].equals("d")&&arr[j+1].equals("z")&&arr[j+2].equals("=")){
				count++;
				arr[j]="";
				arr[j+1]="";
				arr[j+2]="";
			}
		}
		for(int k=0; k<arr.length; k++){
			if(arr[k].equals("n")&&arr[k+1].equals("j") ||arr[k].equals("l")&&arr[k+1].equals("j")){
				count++;
				arr[k]="";
				arr[k+1]="";
			}
		}
		for(int t=0; t<arr.length; t++){
			if(arr[t].equals("-") ||arr[t].equals("=")){
				arr[t]="";
			}
		}
		String output ="";
		for(int v =0; v<arr.length; v++){
			output+=arr[v];
		}
		System.out.println(output.length()+count);
	}

}
