package Lecture42;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



public class TreeBuildLevelOrder {
	
	public class Node{
		int val;
		Node left;
		Node right;
	}
	
	private Node root;
	Scanner sc = new Scanner(System.in);
	
	public TreeBuildLevelOrder() {
		createTree();
	}

	private void createTree() {
		// TODO Auto-generated method stub
		int r = sc.nextInt();
		Node nn = new Node();
		nn.val = r;
		root = nn;
		
		Queue<Node>  q = new LinkedList<>();
		q.offer(nn); // similar to add , handles exception
		
		while(!q.isEmpty()) {
			Node rv = q.poll(); // similar to remove , handles exception
			
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			
			if(c1!=-1) { // left
				Node l = new Node();
				l.val = c1;
				rv.left =l;
				q.offer(l);
			}
			if(c2!=-1) { // right
				Node ri = new Node();
				ri.val = c2;
				rv.right =ri;
				q.offer(ri);
			}	
		}
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
		TreeBuildLevelOrder tree = new TreeBuildLevelOrder();
		tree.Display();
	}
}
