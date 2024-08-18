package Lecture53;

public class UncrossedLines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxUncrossedLines(int[] s, int[] t) {
		int dp[][] = new int[s.length+1][t.length+1];

		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				if(s[i-1] == t[j-1]) { // this char becomes part of lcs
					dp[i][j] = 1 + dp[i-1][j-1]; 
				}
				else {
					int skipS = dp[i-1][j];//ignore ith in s
					int skipT = dp[i][j-1];//ignore jth in t
					dp[i][j] = Math.max(skipS, skipT);
				}
			}
		}
		return dp[dp.length-1][dp[0].length-1];
	}

}
