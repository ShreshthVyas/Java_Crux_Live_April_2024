package Lecture43;

public abstract class AbstractDemo {

	public abstract void fun();
	
	public void f1() {
		System.out.println();
	}
	
	public abstract int payment();
	
	public static void main(String[] args) {
		AbstractDemo ab = new AbstractDemo(){
			
			@Override
			public int payment() {
				// TODO Auto-generated method stub
				System.out.println("COD");
				return 0;
			}
			
			@Override
			public void fun() {
				// TODO Auto-generated method stub
				
			}
		};
//		AbstractDemo ab1 = new AbstractDemo(){
//			
//			@Override
//			public int payment() {
//				// TODO Auto-generated method stub
//				System.out.println("UPI");
//				return 0;
//			}
//			
//			@Override
//			public void fun() {
//				// TODO Auto-generated method stub
//				
//			}
//		};
	}

}
