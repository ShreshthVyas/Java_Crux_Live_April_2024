package Lecture20;

public class StaticDemo {
	static int val =0;
	static char ch = 'a';
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		val++;
//		System.out.println(val);
//		System.out.println(ch);
		dummy();
	}
	public static void dummy() {
//		System.out.println(ch);
		val++;
		System.out.println(val);
		int val = 0;
		val++;
		System.out.println(val);
	}

}
