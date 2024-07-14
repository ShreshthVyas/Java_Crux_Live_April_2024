package Lecture39;



public class DiameterLeetcode {
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
	    public int diameterOfBinaryTree(TreeNode root) {
	    	if(root == null) {
	    		return 0;
	    	}
	    	int left = diameterOfBinaryTree(root.left);
	    	int right = diameterOfBinaryTree(root.right);
	    	int self =  height(root.left) + height(root.right) + 2;
	    	
	    	return Math.max(self,Math.max(right, left));
	    	
	    }
	    private int height(TreeNode node) {
			// TODO Auto-generated method stub
			if(node == null) {
				return -1;
			}
			int left = height(node.left);
			int right = height(node.right);
			
			return Math.max(left, right) +1;
		}
	}
}
