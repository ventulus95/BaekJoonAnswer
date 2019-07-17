package codeBaekJoon;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

class treeNode{
	int data;
	treeNode right;
	treeNode left;
}

class BinaraySearchTree{
	treeNode root = new treeNode();
	String output = "";
	public BinaraySearchTree(){
		this.root = null;
	}
	
	public treeNode search(treeNode n, int x){
		treeNode curr = n;
		while(curr!=null){
		if(curr.data == x){
				return curr;
			}
			else if(curr.data>x){
				curr = curr.left;
			}
			else if(curr.data<x){
				curr= curr.right;
			}
		}
			return curr;
			
	}
	
	public void insert(int x){
		treeNode node = new treeNode();
		node.data= x;
		if(root==null){
			root = node;
			return;
		}
		treeNode curr = root; 
		treeNode parent = null;
		while(true){
			parent = curr;
			if(x<curr.data){
				curr= curr.left;
				if(curr==null){
					parent.left = node;
					return;
				}
			}
			else{
				curr = curr.right;
				if(curr==null){
					parent.right=node;
					return;
				}
			}
		}
	}
	
	public void inorder(treeNode n){
		if(n!=null){
			
			inorder(n.left);
			
			inorder(n.right);
			output+=n.data+" ";
			
		}
	}
	
	public boolean  delete(treeNode n, int x) {
		treeNode curr = n;
		treeNode parent = n;
		boolean isLeftChild = false;
		while(curr.data!=x){
			parent =curr;
			if(curr.data>x){
				isLeftChild = true;
				curr = curr.left;
			}
			else{
				isLeftChild = false;
				curr = curr.right;
			}
			if(curr== null){
				return false;
			}
			
		}
		
		if(curr.left ==null && curr.right == null){
			if(curr==root){
				root = null;
			}
			if(isLeftChild == true){
				parent.left =null;
			}
			else{
				parent.right =null;
			}
		}
		else if(curr.left == null){
			if(curr==root){
				root = curr.left;
			}
			else if(isLeftChild){
				parent.left=curr.left;
			}
			else{
				parent.right = curr.right;
			}
		}
		else if(curr.right == null){
			if(curr==root){
				root = curr.left;
			}
			else if(isLeftChild){
				parent.right = curr.right;
			}
			else{
				parent.left=curr.left;
			}
		}
		else if(curr.left!=null && curr.right !=null){
			
	        treeNode successor = getSuccessor(curr);
            if(curr==root){
                root = successor;
            }else if(isLeftChild){
                parent.left = successor;
            }else{
                parent.right=successor;
            }            
            successor.left = curr.left;
        }        
        return true;        
    }
 
    public treeNode getSuccessor(treeNode deleleNode){
        treeNode successsor =null;
        treeNode successsorParent =null;
        treeNode current = deleleNode.right;
        while(current!=null){
            successsorParent = successsor;
            successsor = current;
            current = current.left;
        }
        if(successsor!=deleleNode.right){
            successsorParent.left = successsor.right;
            successsor.right = deleleNode.right;
        }
        return successsor;
    }


}
	
public class no1005_ACMCraft {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(new File("/Users/LeeChnagSup/Desktop/Data1.txt")));
		int T = Integer.parseInt(br.readLine());
		BinaraySearchTree Tree = new BinaraySearchTree();
		while(T-->0){
			String build = br.readLine();
			StringTokenizer st = new StringTokenizer(" ", build);
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			int bn[] = new int[N+1];
			String time = br.readLine();
			StringTokenizer st1 = new StringTokenizer(" ", time);
			for(int i =1; i<N+1; i++){
				bn[i] = Integer.parseInt(st1.nextToken());
			}
			while(K-->0){
				
			}
		}
		
	}
}
