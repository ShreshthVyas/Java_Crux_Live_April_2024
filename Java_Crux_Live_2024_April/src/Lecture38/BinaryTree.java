package Lecture38;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
	
	public class Node{
		int val;
		Node left;
		Node right;
	}
	
	private Node root;
	Scanner sc = new Scanner(System.in);
	
	public BinaryTree() {
		this.root = createTree();
	}

	private Node createTree() {
		// TODO Auto-generated method stub
		int item = sc.nextInt();
		Node nn =new Node();
		nn.val = item;
		
//		System.out.println("Has Left Child ?");
		boolean hlc = sc.nextBoolean();
		if(hlc) {
			nn.left = createTree();
		}
		
//		System.out.println("Has Right Child");
		boolean hrc = sc.nextBoolean();
		if(hrc) {
			nn.right = createTree();
		}
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
	
	public int Max() {
		return max(this.root);
	}

	private int max(Node node) {
		// TODO Auto-generated method stub
		if(node == null) {
			return Integer.MIN_VALUE;
		}
		
		int leftmax = max(node.left);
		int rightmax= max(node.right);
		
		return Math.max(node.val, Math.max(leftmax, rightmax));
	}
	
	public boolean Find(int k) {
		return find(this.root,k);
	}

	private boolean find(Node node, int k) {
		// TODO Auto-generated method stub
		if(node == null) { //negetive base case
			return false;
		}
		if(node.val == k) { // positive base case
			return true;
		}
		
		boolean left = find(node.left, k);
		boolean right = find(node.right, k);
		
		return left || right;
	}
	
	public int Height() {
		return height(this.root);
	}

	private int height(Node node) {
		// TODO Auto-generated method stub
		if(node == null) {
			return -1;
		}
		int left = height(node.left);
		int right = height(node.right);
		
		return Math.max(left, right) +1;
	}
	
	public void PreOrder() {
		preOrder(root);
		System.out.println();
	}

	private void preOrder(Node node) { // Node Left Right
		// TODO Auto-generated method stub
		if(node == null) {
			return;
		}
		System.out.print(node.val+ " "); //N
		preOrder(node.left);//L
		preOrder(node.right);//R
	}
	
	public void InOrder() {
		inOrder(root);
		System.out.println();
	}

	private void inOrder(Node node) { // Left Node Right
		// TODO Auto-generated method stub
		if(node == null) {
			return;
		}
		inOrder(node.left); //L
		System.out.print(node.val+ " ");//N
		inOrder(node.right);//R
	}
	
	public void PostOrder() {
		postOrder(root);
		System.out.println();
	}

	private void postOrder(Node node) { //Left Right Node
		// TODO Auto-generated method stub
		if(node == null) {
			return;
		}
		postOrder(node.left); //L
		postOrder(node.right); //R
		System.out.print(node.val+ " ");
	}
	
	public void LevelOrder() {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty()) {
			Node temp = q.remove();
			System.out.print(temp.val+" ");
			
			if(temp.left !=null) {
				q.add(temp.left);
			}
			if(temp.right !=null) {
				q.add(temp.right);
			}
		}
		System.out.println();	
	}
	
	
}
