package Lecture19;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(5));
	}

	public static int fact(int n) {
		// TODO Auto-generated method stub
		if(n==1) {
			return 1;
		}
		return fact(n-1)*n;
	}

}
