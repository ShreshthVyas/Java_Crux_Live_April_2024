package Lecture43;

public class AbstractChild extends AbstractDemo {

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		System.out.println("Random");
	}

	@Override
	public int payment() {
		// TODO Auto-generated method stub
		return 10;
	}

	public void f1() {
		System.out.println("Random in f1");
	}
	
	public static void main(String[] args) {
		AbstractChild ac = new AbstractChild();
		ac.f1();
		ac.fun();
		System.out.println(ac.payment());
	}
}
