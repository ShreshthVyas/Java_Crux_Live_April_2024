package Lecture18;

public class WrapperClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		int b = 10;
		Integer c =10;
		Integer cc =  new Integer(10);
		System.out.println(cc == c);
		System.out.println(a==b);
		System.out.println(a==c);
		
		Integer f = 10;
		int g = 10;
		g = f; // Autoboxing  
		
		int e = 10;
		Integer u = 10;
		u =e;	
	}

}
