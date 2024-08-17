package Lecture52;

import java.util.Arrays;

public class House_Robber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {2,7,9,3,1};
		int dp[] = new int[arr.length];
		Arrays.fill(dp, -1);
		int i = RobberTD2(arr,arr.length-1,dp);
		System.out.println(i);
	}
	
	private static int RobberBU(int[] arr) {
		 if(arr.length ==1){
	            return arr[0];
	        }
		int dp[] = new int[arr.length];
		dp[0] = arr[0];
		dp[1] = Math.max(arr[0], arr[1]);
		
		for (int i = 2; i < dp.length; i++) {
			int rob = arr[i] + dp[i-2];
			int notrob = dp[i-1];
			dp[i] = Math.max(rob, notrob);
		}
		
		return dp[arr.length-1];
		
	}

	private static int RobberTD2(int[] arr, int i, int dp[]) {
		// TODO Auto-generated method stub
		if(i <0) {
			return 0;
		}
		if(dp[i]!=-1) { // if answer calculated , return directly
			return dp[i];
		}
		int rob = arr[i] + RobberTD2(arr,i-2,dp);
		int notrob = RobberTD2(arr,i-1,dp);
		return dp[i] = Math.max(rob, notrob); // Yadd karna
	}
//	private static int RobberTD(int[] arr, int i, int dp[]) {
//		// TODO Auto-generated method stub
//		if(i >= arr.length) {
//			return 0;
//		}
//		if(dp[i]!=-1) { // if answer calculated , return directly
//			return dp[i];
//		}
//		int rob = arr[i] + RobberTD(arr,i+2,dp);
//		int notrob = RobberTD(arr,i+1,dp);
//		return dp[i] = Math.max(rob, notrob); // Yadd karna
//	}
//	private static int rec(int[] arr, int i) {
//		// TODO Auto-generated method stub
//		if(i >= arr.length) {
//			return 0;
//		}
//		int rob = arr[i] + rec(arr,i+2);
//		int notrob = rec(arr,i+1);
//		return Math.max(rob, notrob);
//	}

	

}
