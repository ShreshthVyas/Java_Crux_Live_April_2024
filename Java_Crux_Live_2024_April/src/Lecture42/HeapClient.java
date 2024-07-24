package Lecture42;

public class HeapClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heap h = new Heap();
		h.add(4);
		h.add(5);
		h.add(20);
		h.add(-1);
		h.add(2);
		h.add(3);
		h.add(11);
		h.add(9);
		h.add(8);
		h.add(100);
		
		h.Display();
		h.remove();
		h.Display();
		
		System.out.println(h.peek());
	}

}
