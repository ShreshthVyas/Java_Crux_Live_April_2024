package Lecture3;

public class pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int i = 1;
		int nst1 = (n+1)/2;
		int nst2 = (n+1)/2;
		int nsp = -1;
		 
		while(i<=n) {
			int cst1 =0;
			while(cst1<nst1) {
				System.out.print("* ");
				cst1++;
			}
			
			int csp = 0;
			while(csp<nsp) {
				System.out.print("  ");
				csp++;
			}
			
			int cst2=0;
			if(i==1 || i==n) {
				cst2++;
			}
			
			while(cst2<nst2) {
				System.out.print("* ");
				cst2++;
			}
			
			System.out.println();
			if(i >=  (n+1)/2) {
				nst1++;
				nst2++;
				nsp-=2;
			}
			else {
				nst1--;
				nst2--;
				nsp+=2;
			}
			
			i++;
		}
	}

}
