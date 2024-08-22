package Lecture54;

public class MinimumPathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int minPathSum(int[][] grid) {
        int dp[][] = new int[grid.length+1][grid[0].length+1];
        return sum(grid,0,0,dp);
        
    }
    public int sum(int arr[][], int i, int j, int dp[][]){
        if(i>=arr.length||j>=arr[0].length){
            return Integer.MAX_VALUE;
        }
        if(i==arr.length-1&&j==arr[0].length-1){
            return arr[i][j];
        }
        if(dp[i][j]!=0){
            return dp[i][j];
        }
        
        return dp[i][j] =arr[i][j] + Math.min(sum(arr,i,j+1,dp),sum(arr,i+1,j,dp));
    }

}
