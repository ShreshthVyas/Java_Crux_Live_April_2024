package Lecture19;

public class PrintInc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n  = 10;
		printinc(n);
	}
	
	public static void printinc(int n) {
		// TODO Auto-generated method stub
		if(n==0) {
			return;
		}
		printinc(n-1);
		System.out.println(n);
		
	}

}
