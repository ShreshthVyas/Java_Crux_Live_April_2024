package Lecture54;

public class Knapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cap = 4;
		int wt [] = { 1, 2, 3, 2, 2 };
		int val[] = { 8, 4, 0, 5, 3 };
		
		int ans = knapsack(wt,val,cap,0);
		System.out.println(ans);
	}

	private static int knapsack(int[] wt, int[] val, int cap, int idx) {
		// TODO Auto-generated method stub
		if(idx==wt.length || cap == 0) {
			return 0;
		}
		int inc =0;int exc =0;
		if(cap>= wt[idx]) {
			inc  = val[idx] + knapsack(wt, val, cap- wt[idx], idx+1);
		}
		exc = knapsack(wt, val, cap, idx+1);
		return Math.max(inc, exc);
		
	}
	
	

}
