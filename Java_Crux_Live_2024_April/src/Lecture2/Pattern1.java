package Lecture2;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int i = 1;
		
		while(i<=n) {
			int cst = 0;
			while(cst<n) {
				System.out.print("* ");
				cst++;
			}
			System.out.println();
			i++;
		}
	}

}
