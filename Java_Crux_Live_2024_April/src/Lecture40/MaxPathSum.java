package Lecture40;


public class MaxPathSum {
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
	
	int ans = Integer.MIN_VALUE;
	public int maxPathSum(TreeNode root) {
		max(root);
		return ans;
	}
	
	public int max(TreeNode root) {
		if(root == null) {
			return 0;
		}
		
		int left = Math.max(0, max(root.left));
		int right = Math.max(0, max(root.right));
		int self = root.val + left + right;
		
		ans= Math.max(ans, self);
		
		return root.val + Math.max(right, left);
		
	}
}
