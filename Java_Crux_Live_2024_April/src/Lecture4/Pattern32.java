package Lecture4;

public class Pattern32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		int i =1;
		int nst =1;
		int val = 1;
		while(i<= 2*n -1){
			int cst =0;
			while(cst<nst) {
				if(cst%2 == 0) {
					System.out.print(val + " ");
				}
				else {
					System.out.print("* ");
				}
				
				cst++;
			}
			System.out.println();
			if(i<n) {//upper half
				nst+=2;
				val++;
			}
			else { // lowr half
				nst-=2;
				val--;
			}
			
			i++;
		}
	}

}
