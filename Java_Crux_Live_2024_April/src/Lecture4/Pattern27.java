package Lecture4;

public class Pattern27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		int i =1;
		int nst = 1;
		int nsp = n-1;
		
		while(i<=n) {
			int val =1;
			int csp = 0;
			while(csp<nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst = 0;
			while(cst<nst) {
				
				System.out.print(val + " ");
				if(cst<nst/2) {
					val++;
				}
				else {
					val--;
				}
				cst++;
				
			}
			System.out.println();
			nsp--;
			nst+=2;
			i++;
		}
	}

}
