package Lecture33;

public class Methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(10,20);
		add(10,20,30);
		System.out.println("..");
		add(2.2,4,1,3,4,5,7,8,9,0,4,5,6);
	}

	private static int add(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}
	
	private static int add(double i, int j) {
		// TODO Auto-generated method stub
		return (int)i+j;
	}
	
	private static int add(int j ,double i) {
		// TODO Auto-generated method stub
		return (int)i+j;
	}
	
	private static int add(int i, int j ,int k) {
		// TODO Auto-generated method stub
		return i+j +k;
	}
	
	private static int add(int i, int j ,double k) {
		// TODO Auto-generated method stub
		return (int) (i+j +k);
	}
	private static int add(long i, int j ,double k) {
		// TODO Auto-generated method stub
		return (int) (i+j +k);
	}
	
	private static int add(double i, int j ,int... args) { //variable arguments
		// TODO Auto-generated method stub
		int sum =0;
//		for (int k = 0; k < args.length; k++) {
//			sum+=args[k];
//			System.out.println(args[k]);
//		}
		System.out.println(args);
		
		return (int)i+j + sum;
		
	}
	

}
