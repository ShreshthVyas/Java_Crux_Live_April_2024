package Lecture2;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		int i = 1;
		int nst = 1;
		while(i<=n) {
			int cst =0;
			while(cst<nst) { // print the n .of stars in row
				System.out.print("* ");
				cst++;
			}
			System.out.println();
			i++;
			nst++;
		}
	}

}
