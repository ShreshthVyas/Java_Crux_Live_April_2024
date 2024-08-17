package Lecture52;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(fib(5));
//		int n =50;
//		int dp[] =  new int[n+1];
//		System.out.println(fibTD(n, dp));
		int n=40;
		System.out.println(fibBu(n));
	}

	private static int fib(int n) {
		// TODO Auto-generated method stub
		if(n ==0 || n==1) {
			return n;
		}
		int f1 = fib(n-1);
		int f2 = fib(n-2);
		return f1+f2;
	}
	
	private static int fibTD(int n, int dp[]) {
		// TODO Auto-generated method stub
		if(n ==0 || n==1) {
			return n;
		}
		if(dp[n]!=0) { // If already calculated return value directly
			return dp[n];
		}
		int f1 = fib(n-1);
		int f2 = fib(n-2);
		return dp[n] = f1+f2;
	}
	
	private static int fibBu(int n) {
		// TODO Auto-generated method stub
		int dp[] = new int[n+1];
		dp[0] =0;
		dp[1] = 1;
		
		for (int i = 2; i < dp.length; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		return dp[n];
	}
	 
	

}
