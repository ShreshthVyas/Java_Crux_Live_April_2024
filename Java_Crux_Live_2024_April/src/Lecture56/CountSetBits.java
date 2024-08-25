package Lecture56;

public class CountSetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =127;
//		System.out.println(countsetbit(n));
		System.out.println(countsetbitFaster(n));
	}
	
	private static int countsetbitFaster(int n) {
		// TODO Auto-generated method stub
		int count =0;
		
		while(n>0) {
			count++;
			n = (n & (n-1));
		}
		return count;
		
	}

	private static int countsetbit(int n) {
		// TODO Auto-generated method stub
		int count =0;
		while(n>0) {
			if((n&1) != 0) {
				count++;
			}
			n>>=1; // n = n>>1
		}
		return count;
	}

}
