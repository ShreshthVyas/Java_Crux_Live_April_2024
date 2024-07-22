package Lecture41;

import Lecture41.InsertInBST.TreeNode;

public class DeleteInBST {
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
	
	class Solution {
	    public TreeNode deleteNode(TreeNode root, int key) {
	        if(root == null) {
	        	return null;
	        }
	        if(root.val<key) { //right
	        	root.right = deleteNode(root.right, key);
	        }
	        else if (root.val>key) {// left
	        	root.left = deleteNode(root.left, key);
	        }
	        else { // equal || key found
	        	
	        	// Both null || 1 right child
	        	if(root.left == null) {
	        		return root.right;
	        	}
	        	else if(root.right==null) { // 1 left child
	        		return root.left;
	        	}
	        	else { //both child present
	        		int leftmax = max(root.left);// get leftmax
	        		deleteNode(root.left, leftmax); //delete leftmax
	        		root.val =leftmax; // replace curr root val with leftmax
	        	}
	        }
	        
	        return root;
	    }
	    
	    private int max(TreeNode root) {
	    	if(root == null) {
	    		return Integer.MIN_VALUE;
	    	}
	    	
	    	int r = max(root.right);
	    	
	    	return Math.max(root.val, r);
	    }
	}
}
