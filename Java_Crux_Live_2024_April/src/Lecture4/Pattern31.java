package Lecture4;

public class Pattern31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int i = 1;
		
		while(i<=n) {
			int val =n;
			int cst = 0;
			while(cst<n) {
				if(cst == n-i) {
					System.out.print("* ");
				}
				else {
					System.out.print(val + " ");
				}
				cst++;
				val--;
			}
			System.out.println();
			i++;
		}
	}

}
