package Lecture22;

public class LexographicPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20;
		lex(0,n);
	}

	public static void lex(int ans, int n) {
		// TODO Auto-generated method stub
		if(ans>n) {
			return;
		}
		System.out.println(ans);
		int i =0;
		if(ans == 0) {
			i =1;
		}
		for (; i <=9; i++) {
			lex(ans*10 + i, n);
		}
	}

}
