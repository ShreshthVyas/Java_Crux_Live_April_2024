package Lecture41;

import Lecture38.BinaryTree.Node;

public class BST {
	
	class Node{
		int val;
		Node left;
		Node right;
	}
	
	private Node root;
	
	public BST(int in[]) {
		this.root = createTree(in,0,in.length-1);
	}

	private Node createTree(int[] in, int si, int ei) {
		// TODO Auto-generated method stub
		if(si>ei) {
			return null;
		}
		
		int mid = (si+ei)/2;
		Node nn = new Node();
		nn.val =in[mid];
		
		nn.left = createTree(in, si, mid-1); //left sub-tree
		nn.right = createTree(in, mid+1, ei);//right sub -tree
		
		return nn;
	}
	
	public void Display() {
		display(root);
	}

	private void display(Node temp) {
		// TODO Auto-generated method stub
		if(temp == null) { //Base case
			return;
		}
		String s =""+ temp.val;
		if(temp.left!=null) {
			s = temp.left.val + "<--" + s;
		}
		else {
			s = ". <--" + s;
		}
		if(temp.right!=null) {
			s = s + "-->" + temp.right.val;
		}
		else {
			s = s + "--> ." ;
		}
		System.out.println(s);
		display(temp.left);
		display(temp.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int in[] = {15,50,60,75,100,125,150,175};
		BST bst = new BST(in);
		
		bst.Display();
	}

}
