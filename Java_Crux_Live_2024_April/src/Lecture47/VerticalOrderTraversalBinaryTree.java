package Lecture47;

import java.util.List;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class VerticalOrderTraversalBinaryTree {

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
		TreeMap<Integer, TreeMap<Integer , PriorityQueue<Integer>>> map;
	    public List<List<Integer>> verticalTraversal(TreeNode root) {
	        map =  new TreeMap<>();
	        dfs(root, 0, 0);
	        List<List<Integer>> ans = new ArrayList<>();
	        
	        for (int vl : map.keySet()) { // vertical levels
				List<Integer> list =  new ArrayList<>();
				TreeMap<Integer , PriorityQueue<Integer>> tm = map.get(vl);
				for (int hl : tm.keySet()) { // each horizontal corresponding to vl
					PriorityQueue<Integer> tpq = tm.get(hl);
					while(!tpq.isEmpty()) {
						list.add(tpq.poll());
					}
				}
				ans.add(list);
			}
	        
	        return ans;
	    }
	    
	    private void dfs(TreeNode root,int vidx , int lvl) {
	    	if(root == null) {
	    		return;
	    	}
	    	
	    	map.putIfAbsent(vidx, new TreeMap<>());
	    	map.get(vidx).putIfAbsent(lvl, new PriorityQueue<>());
	    	map.get(vidx).get(lvl).add(root.val);
	    	
	    	dfs(root.left,vidx-1,lvl+1);// left subtree
	    	dfs(root.right,vidx+1,lvl+1);// right subtree
	    }
	}
	

}
