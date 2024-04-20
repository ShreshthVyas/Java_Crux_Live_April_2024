package Lecture3;

public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		 int i = 1;
		 int nst = n;
		 int nsp = n-1;
		 
		 while(i<= 2*n-1) {
			 //spaces
			 int csp = 0;
			 while(csp<nsp) {
				 System.out.print("  ");
				 csp++;
			 }
			 
			 // stars
			 int cst=0;
			 while(cst<nst) {
				 System.out.print("* ");
				 cst++;
			 }
			 System.out.println();
			 
			 if(i>=n) {
				 nsp++;
				 nst++;
			 }
			 else {
				 nsp--;
				 nst--;
			 }
			 i++;
		 }
	}

}
