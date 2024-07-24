package Lecture42;


public class TreeBuild_InOrder_PreOrder {
	
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
	    public TreeNode buildTree(int[] preorder, int[] inorder) {
	        return build(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
	    }

		private TreeNode build(int[] preorder, int plo, int phi, int[] inorder, int inlo, int inhi) {
			// TODO Auto-generated method stub
			if (inlo > inhi || plo > phi) {
				  return null;
			}
			
			TreeNode node = new TreeNode(preorder[plo]); // Make first element of preorder root
			int idx = find(inlo,inhi,inorder,preorder[plo]);// find the element inorder
			int count = idx-inlo;
			node.left = build(preorder, plo+1, plo+count, inorder, inlo, idx-1); // call for left subtree
			node.right = build(preorder, plo+count+1, phi, inorder, idx+1, inhi);// call for right subtree
			
			return node;
		}

		private int find(int inlo, int inhi, int[] inorder, int i) {
			// TODO Auto-generated method stub
			for (int j = inlo; j <=inhi; j++) {
				if(inorder[j] == i) {
					return j;
				}
			}
			return 0;
		}
	}

}
