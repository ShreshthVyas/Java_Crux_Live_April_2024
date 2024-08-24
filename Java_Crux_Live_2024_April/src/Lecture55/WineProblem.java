package Lecture55;

import java.util.Arrays;


public class WineProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int wine[] = {2,4,6,2,5};
//		int[][] dp = new int[wine.length][wine.length];
//		int a = rec(wine,0,wine.length-1,1,dp);
//		System.out.println(a);
		System.out.println(wineBU(wine));
	}

	private static int rec(int[] wine, int i, int j,int year,int dp[][]) {
		// TODO Auto-generated method stub
		if(i>j) {
			return 0;
		}
		if(dp[i][j]!=0) {
			return dp[i][j];
		}
		int front = wine[i] * year + rec(wine, i+1, j, year+1,dp);
		int back  =	wine[j] * year + rec(wine, i, j-1, year+1,dp);
		return dp[i][j] = Math.max(front, back);
	}
	
	private static int wineBU(int wine[]) {
		int dp[][] = new int[wine.length][wine.length];
		for (int i = 0; i < dp.length; i++) { // filling diagonal with every bottle sold in last year
			dp[i][i] = wine[i] * wine.length;
		}
		int year = wine.length-1;
		for (int d = 1; d < dp.length; d++) { // filling wine.length-1 diagonals
			for (int j = d; j < dp.length; j++) {
				int i = j-d;
				int front = wine[i] * year + dp[i+1][j];
				int back  =	wine[j] * year + dp[i][j-1];
				dp[i][j] = Math.max(front, back);
			}
			year--;
		}
		for (int[] is : dp) {
			System.out.println(Arrays.toString(is));
		}
		return dp[0][dp[0].length-1];
	}

}
