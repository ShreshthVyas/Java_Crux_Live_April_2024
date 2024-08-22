package Lecture54;

import java.util.Arrays;

public class MinPathFallingSumII {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid =  {{2,1,3},{6,5,4},{7,8,9}};
		int dp[][] = new int[grid.length][grid[0].length];
		for (int[] a : dp) {
			Arrays.fill(a, -10001);
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < grid[0].length; i++) {
			ans = Math.min(ans,rec(0,i,grid,dp));
		}
		System.out.println(ans);
	}

	private static int rec(int cr, int cc, int[][] grid,int dp[][]) {
		// TODO Auto-generated method stub
		if(cr == grid[0].length -1) {
			return grid[cr][cc];
		}
		if(dp[cr][cc]!=-10001) {
			return dp[cr][cc];
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < grid[0].length; i++) {
			if(i!=cc) {
				ans  =  Math.min(ans,rec(cr+1, i, grid, dp));
			}
		}
		
		return dp[cr][cc] = ans + grid[cr][cc];
	}
}
