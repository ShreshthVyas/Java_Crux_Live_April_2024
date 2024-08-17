package Lecture52;

import java.util.Arrays;

public class LongestClearSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int lengthOfLIS(int[] nums) {
		int dp[] = new int[nums.length];
		Arrays.fill(dp, 1);

		for (int i = 1; i < dp.length; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (nums[j] < nums[i]) {
					int prev = dp[j];
					dp[i] = Math.max(dp[i], prev + 1);
				}
			}
		}
		System.out.println(Arrays.toString(dp));
		int ans = 0;
		for (int i : dp) {
			ans = Math.max(ans, i);
		}
		return ans;

	}

}
