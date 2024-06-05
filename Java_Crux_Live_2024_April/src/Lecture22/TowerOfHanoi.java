package Lecture22;

public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		System.out.println(toh(n,1,3,2));;
	}

	public static int toh(int n, int src, int help, int dest) {
		// TODO Auto-generated method stub
		if(n == 0) {
			System.out.println("Move " + n + "th disc from " + src + " to " + dest);
			return 1;
		}
		int count =0;
		count+= toh(n-1, src, dest, help);
		System.out.println("Move " + n + "th disc from " + src + " to " + dest);
		count+= toh(n-1 , help , src, dest);
		return count -1;
	}

}
