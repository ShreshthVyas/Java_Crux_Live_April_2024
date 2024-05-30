package Lecture19;

public class PrintDecreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =10;
		printdec(n);
		
	}

	public static void printdec(int n) {
		// TODO Auto-generated method stub
		if(n==0) {
			return;
		}
		
		System.out.println(n);
		printdec(n-1);
		
		
	}

}
