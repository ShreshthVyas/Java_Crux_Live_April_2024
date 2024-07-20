package Lecture40;

import Lecture39.DiameterLeetcode.TreeNode;

public class BalancedBinaryTree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	
	 public boolean isBalanced(TreeNode root) {
		 return isBalance(root).isbal;
	 }
	 
	 public balpair isBalance(TreeNode root) {
		 if(root == null) {
			 return new balpair();
		 }
		 
		 balpair lbp = isBalance(root.left);
		 balpair rbp = isBalance(root.right);
		 
		 boolean sb = Math.abs(lbp.ht -rbp.ht)  <=1;
		 balpair sbp = new balpair();
		 sbp.ht = Math.max(lbp.ht, rbp.ht) +1;
		 sbp.isbal = lbp.isbal && rbp.isbal && sb;
		 
		 return sbp;
	 }
	 
	 
	  class balpair{
		  boolean isbal= true;
		  int ht = -1;
	  }

	public boolean isBalanced2(TreeNode root) {
		if(root == null) {
			return true;
		}
		
		boolean lb = isBalanced2(root.left);
		boolean rb = isBalanced2(root.right);
		boolean sb = Math.abs(height(root.left) - height(root.right)) <= 1;
		
		return sb && rb && lb;
		
	}

	private int height(TreeNode node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return -1;
		}
		int left = height(node.left);
		int right = height(node.right);

		return Math.max(left, right) + 1;
	}

}
