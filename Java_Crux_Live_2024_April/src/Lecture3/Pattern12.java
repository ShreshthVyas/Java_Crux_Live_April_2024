package Lecture3;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		int i =1;
		int nst = 1;
		int nsp = n-1;
	
		while(i<=n) {
			int csp = 0;
			while(csp<nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst = 0;
			//star
			while(cst<nst) {
				if(cst%2 == 0) { //even condnt
					System.out.print("* ");
				}
				else {
					System.out.print("! ");
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
