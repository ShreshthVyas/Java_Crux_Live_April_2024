package Lecture15;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
//		System.out.println(s);
		String s1 = "hello";
		
		String s2 = new String("hello");
//		s2 = "hello";
//		s= s2;
		String s4 =  new String("hello");
//		System.out.println(s==s1);
//		System.out.println(s==s2);
		
		System.out.println(s2 == s4);
		
	}

}
;