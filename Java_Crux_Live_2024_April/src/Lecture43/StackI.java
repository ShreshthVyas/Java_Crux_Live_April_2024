package Lecture43;

public interface StackI {
	
	public void push();
	public void pop();
	public void top();
	
//	protected void f();
	
	//java 8
	static void f() {
		
	}
	
	default void f1() {
		
	}
	
	//java 9
	private void f2() {
		
	}
	
	public static void main(String[] args) {
		StackI.f();
	}
	
}
