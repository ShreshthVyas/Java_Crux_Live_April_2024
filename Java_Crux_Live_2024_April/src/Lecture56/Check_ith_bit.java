package Lecture56;

public class Check_ith_bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int i = 2;
		int mask = 1<< i;
		if((n & mask) == 0) {
			System.out.println("Not Set");
		}
		else {
			System.out.println("Set");
		}
		
	}

}
