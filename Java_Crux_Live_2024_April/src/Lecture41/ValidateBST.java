package Lecture41;

public class ValidateBST {

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
	    public boolean isValidBST(TreeNode root) {
	        return isvalid(root).isBST;
	    }
	    
	    public bstpair isvalid(TreeNode root) {
	    	if(root == null) {
	    		return new bstpair();
	    	}
	    	
	    	bstpair left = isvalid(root.left);
	    	bstpair right = isvalid(root.right);
	    	
	    	bstpair self = new bstpair();
	    	self.min =  Math.min(root.val, Math.min(left.min,right.min));
	    	self.max  = Math.max(root.val, Math.max(left.max,right.max));
	    	
	    	self.isBST = left.isBST && right.isBST && root.val>left.max && root.val <right.min;
	    	
	    	return self;
	    }
	    
	    class bstpair{
	    	boolean isBST = true;
	    	long min = Long.MAX_VALUE;
	    	long max = Long.MIN_VALUE;
	    }
	}

}
