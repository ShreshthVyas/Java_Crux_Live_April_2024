package Lecture19;

public class SumofNnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(10));
	}
	public static int sum(int n) {
		if(n==1) {
			return 1;
		}
		int prev = sum(n-1);
		return prev + n;
	}

}
