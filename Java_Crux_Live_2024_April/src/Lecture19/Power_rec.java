package Lecture19;

public class Power_rec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 3;
		int b =4;
		System.out.println(pow(a,b));
		
	}

	public static int pow(int a, int b) {
		// TODO Auto-generated method stub
		if(b==0) {
			return 1;
		}	
		int prev = pow(a,b-1);
		return prev *a;
	}
	
	

}
