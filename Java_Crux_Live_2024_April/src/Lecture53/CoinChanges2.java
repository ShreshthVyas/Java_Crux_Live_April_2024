package Lecture53;

import java.util.Arrays;

public class CoinChanges2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 1, 5 };
		int amount = 0;
		int dp[][] = new int[arr.length][amount + 1];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		int a = coinTD(arr, amount, 0, dp);
		System.out.println(a);
	}

	private static int coinBU(int arr[], int amount) {
		int dp[][] = new int[amount + 1][arr.length + 1];

		for (int i = 0; i < dp[0].length; i++) {// base case
			dp[0][i] = 1;
		}
		for (int amnt = 1; amnt < dp.length; amnt++) {
			for (int i = 1; i < dp[0].length; i++) {
				int inc = 0;
				int exc = 0;
				if (arr[i - 1] <= amnt) {
					inc = dp[amnt - arr[i - 1]][i];
				}
				exc = dp[amnt][i - 1];
				dp[amnt][i] = inc + exc;
			}
		}
		for (int[] a : dp) {
			System.out.println(Arrays.toString(a));
		}
		return dp[dp.length - 1][dp[0].length - 1];
	}

	private static int coinTD(int[] arr, int amnt, int idx, int dp[][]) {
		// TODO Auto-generated method stub
		if (amnt == 0) {
			return 1;
		}
		if (idx == arr.length) {
			return 0;
		}
		if (dp[idx][amnt] != -1) {
			return dp[idx][amnt];
		}
		int inc = 0;
		int exc = 0;
		if (arr[idx] <= amnt) {
			inc = coinTD(arr, amnt - arr[idx], idx, dp);
		}
		exc = coinTD(arr, amnt, idx + 1, dp);

		return dp[idx][amnt] = exc + inc;
	}
//	private static int rec(int[] arr, int amnt, int idx) {
//		// TODO Auto-generated method stub
//		if(amnt == 0) {
//			return 1;
//		}
//		if(idx == arr.length) {
//			return 0;
//		}
//		int inc =0;int exc =0;
//		if(arr[idx]<= amnt) {
//			inc = rec(arr, amnt-arr[idx], idx); 
//		}
//		exc = rec(arr, amnt, idx+1);
//		
//		return exc + inc;
//	}

}
