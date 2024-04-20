package Lecture3;

public class Patterndollar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		int i =1;
		int nst = 1;
		int nsp = n-1;
		int nod = n-1;
		while(i<=n) {
			//spaces
			int csp = 0;
			while(csp<nsp) {
				System.out.print("$ ");
				csp++;
			}
			//stars
			int cst = 0;
			while(cst<nst) {
				System.out.print("* ");
				cst++;
			}
			//dollar
			int cod = 0;
			while(cod<nod) {
				System.out.print("$ ");
				cod++;
			}
			System.out.println();
			nsp--; //spaces --
			nst+=2;//stars plus 2
			nod--;//dollar--
			i++;
		}
	}

}
