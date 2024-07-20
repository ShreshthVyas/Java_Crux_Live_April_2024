package Lecture40;

import java.util.ArrayList;
import java.util.List;

import Lecture40.Diameter_Optimised.TreeNode;

public class RightView {
	
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
		List<Integer>  ans;
		int maxLvl =-1;
	    public List<Integer> rightSideView(TreeNode root) {
	        ans = new ArrayList<>();
	        dfs(root,0);
	        return ans;
	    }
		private void dfs(TreeNode root, int currLvl) {
			// TODO Auto-generated method stub
			if(root ==null) {
				return;
			}
			
			if(currLvl > maxLvl) {
				ans.add(root.val);
				maxLvl = currLvl;
			}
			
			dfs(root.right, currLvl+1);
			dfs(root.left, currLvl+1);
		}
	}

}
