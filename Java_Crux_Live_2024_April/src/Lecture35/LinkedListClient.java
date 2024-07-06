package Lecture35;

public class LinkedListClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linkedlist ll = new Linkedlist();
//		ll.Display();
		ll.addFirst(10);
//		ll.addFirst(20);
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(40);
		ll.addLast(50);
		ll.addLast(60);
//		ll.removeFirst();
//		ll.removeLast();
		
		ll.Display();
		ll.addatindx(100, 3);
		ll.Display();
		ll.removeAtIndx(3);
		ll.Display();
		System.out.println(ll.getValueATindx(3));
		System.out.println(ll.linearSearch(400));
	}

}
