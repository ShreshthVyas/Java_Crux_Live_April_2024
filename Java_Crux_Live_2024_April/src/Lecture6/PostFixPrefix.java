package Lecture6;

public class PostFixPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b =9;
//		System.out.println(a++);
//		System.out.println(a);
//		System.out.println(++a);
		int c = ++a + --b + b +9 + a++ + 7 + b--;
		
		System.out.println(c);
		System.out.println(b);
		System.out.println(a);
		
		
		
		
	}

}
