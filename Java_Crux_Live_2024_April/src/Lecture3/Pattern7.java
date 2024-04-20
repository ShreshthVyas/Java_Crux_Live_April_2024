package Lecture3;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		int i =1;
		int nsp = n-2;
		while(i<=n) {
			if(i==1 || i==n) {
				int cst=0;
				while(cst<n) {
					System.out.print("* ");
					cst++;
				}
			}
			else {
				System.out.print("* ");
				int csp = 0;
				while(csp<nsp) {
					System.out.print("  ");
					csp++;
				}
				System.out.print("* ");
			}
			System.out.println();
			i++;
		}
	}

}
