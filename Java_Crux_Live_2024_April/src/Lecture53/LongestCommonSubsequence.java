package Lecture53;

import java.util.Arrays;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcde";
		String t =  "ace";
		int dp[][] = new int[s.length()][t.length()];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		int a = lcsTD(s,t,0,0,dp);
		System.out.println(a);
	}

	private static int lcsBU(String s, String t) {
		// TODO Auto-generated method stub
		int dp[][] = new int[s.length()+1][t.length()+1];

		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				if(s.charAt(i-1) == t.charAt(j-1)) { // this char becomes part of lcs
					dp[i][j] = 1 + dp[i-1][j-1]; 
				}
				else {
					int skipS = dp[i-1][j];//ignore ith in s
					int skipT = dp[i][j-1];//ignore jth in t
					dp[i][j] = Math.max(skipS, skipT);
				}
			}
		}
//		for (int[] a : dp) {
//			System.out.println(Arrays.toString(a));
//		}
		return dp[dp.length-1][dp[0].length-1];
	}
	private static int lcsTD(String s, String t, int i, int j, int dp[][]) {
		// TODO Auto-generated method stub
		if(i ==s.length() || j == t.length()) {
			return 0;
		}
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		int ans =0;
		//inc
		if(s.charAt(i) == t.charAt(j)) { // this char becomes part of lcs
			ans = 1 + lcsTD(s, t, i+1, j+1,dp);
		}
		//exc
		else {
			int skipS = lcsTD(s, t, i+1, j,dp);//ignore ith in s
			int skipT = lcsTD(s, t, i, j+1,dp);//ignore jth in t
			ans = Math.max(skipS, skipT);
			
		}
		return dp[i][j]=ans;
	}
	private static int lcs(String s, String t, int i, int j) {
		// TODO Auto-generated method stub
		if(i ==s.length() || j == t.length()) {
			return 0;
		}
		int ans =0;
		//inc
		if(s.charAt(i) == t.charAt(j)) { // this char becomes part of lcs
			ans = 1 + lcs(s, t, i+1, j+1);
		}
		//exc
		else {
			int skipS = lcs(s, t, i+1, j);//ignore ith in s
			int skipT = lcs(s, t, i, j+1);//ignore jth in t
			ans = Math.max(skipS, skipT);
			
		}
		return ans;
	}
	
	

}
