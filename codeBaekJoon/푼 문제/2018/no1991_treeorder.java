package codeBaekJoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node{
	char data;
	Node right;
	Node left;
	public Node(char data){
		this.data = data;
	}
}

class Tree{
	Node root;
	
	public void insert(char x, char left, char right){
		if(root== null){
			Node n = new Node(x);
			if(left!='.'){
				Node l = new Node(left);
				n.left= l;
			}
			if(right!='.'){
				Node r = new Node(right);
				n.right=r;
			}
			root = n;
		}
		else{
			search(root, x, left, right);
		}
	}
	
	public void search(Node n, char x, char left, char right){
		if(n==null){
			return;
		}
		else if(n.data==x){
			if(left!='.') 
				n.left = new Node(left);
			if(right!='.')
				n.right = new Node(right);
		}
		else{
			search(n.left, x, left, right);
			search(n.right, x, left, right);
		}
	}

	public void inorder(Node n){
		if(n!=null){
			inorder(n.left);
			System.out.print(n.data);
			inorder(n.right);
		}
	}
	public void preorder(Node n){
		if(n!=null){
			System.out.print(n.data);
			preorder(n.left);
			preorder(n.right);
		}
	}

	public void postorder(Node n){
		if(n!=null){
			postorder(n.left);
			postorder(n.right);
			System.out.print(n.data);
		}
	}	
}
public class no1991_treeorder {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Tree Tree = new Tree();
		int T = Integer.parseInt(br.readLine());
		while(T-->0){
			String tc = br.readLine();
			Tree.insert(tc.charAt(0), tc.charAt(2), tc.charAt(4));
		}
		Tree.preorder(Tree.root);
		System.out.println();
		Tree.inorder(Tree.root);
		System.out.println();
		Tree.postorder(Tree.root);
	}
}
