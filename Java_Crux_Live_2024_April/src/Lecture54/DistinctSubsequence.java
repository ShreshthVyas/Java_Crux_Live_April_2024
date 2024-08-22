package Lecture54;

import java.util.Arrays;

public class DistinctSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "rabbbit";
		String t = "rabbit";
		int dp[][] = new int[s.length()][t.length()];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(coinTD(s, t, 0, 0, dp));
	}
	private static int coinTD(String s, String t , int i,int j, int dp[][]) {
		// TODO Auto-generated method stub
		if (j == t.length()) {
			return 1;
		}
		if (i == s.length()) {
			return 0;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int inc = 0;
		int exc = 0;
		if (s.charAt(i)== t.charAt(j)) {
			inc = coinTD(s,t,i+1,j+1, dp);
		}
		exc = coinTD(s, t, i + 1,j, dp);

		return dp[i][j] = exc + inc;
	}

}
