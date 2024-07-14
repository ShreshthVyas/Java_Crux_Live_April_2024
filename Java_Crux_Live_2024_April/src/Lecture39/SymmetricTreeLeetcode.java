package Lecture39;

public class SymmetricTreeLeetcode {
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

	public boolean isSymmetric(TreeNode root) {
		return symmetric(root.left,root.right);
	}

	private boolean symmetric(TreeNode root1, TreeNode root2) {
		// TODO Auto-generated method stub
		if(root1 == null && root2 == null) { // no child
			return true;
		}
		if(root1 == null || root2 == null) { // 1 child and 1 null
			return false;
		}
		if(root1.val!=root2.val) {
			return false;
		}
		boolean left = symmetric(root1.left, root2.right);
		boolean right = symmetric(root1.right, root2.left);
		
		return left && right;
	}
}
