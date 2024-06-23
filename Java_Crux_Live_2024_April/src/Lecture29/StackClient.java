package Lecture29;

public class StackClient {

	public static void main(String[] args) throws Exception {
		Stack s = new Stack(6);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
//		s.display();
//		System.out.println(s.pop());
//		System.out.println(s.peek());
//		System.out.println(s.isFull());
//		s.clear();
//		System.out.println(s.isEmpty());
		s.push(10);
		s.display();
		System.out.println(s.isFull());
	}

}
