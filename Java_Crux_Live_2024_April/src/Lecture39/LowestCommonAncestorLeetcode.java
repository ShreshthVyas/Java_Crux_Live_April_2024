package Lecture39;


public class LowestCommonAncestorLeetcode {
	
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
	    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	        if(root == null) {
	        	return null;
	        }
	        if(root == p || root == q) {
	        	return root;
	        }
	        TreeNode left= lowestCommonAncestor(root.left, p, q);
	        TreeNode right = lowestCommonAncestor(root.right, p, q);
	        //both not null
	        if(left!=null && right!=null) {
	        	return root;
	        }
	        // 1 null 1 not null
	        else if(left!=null) { 
	        	return left;
	        }
	        else{
	        	return right;
	        }
	    }
	}

}
