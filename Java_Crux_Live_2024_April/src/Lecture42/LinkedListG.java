package Lecture42;


public class LinkedListG <T> {
	
	public class Node{
		T val;
		Node next;
		
		public Node(T val) {
			this.val = val;
			this.next =null;
		}
	}
	
	private Node head;
	private int size;
	private Node tail;
	
	public void addFirst(T n) { //O()1
		if(this.head == null) {
			Node nn = new Node(n);
			this.head =nn;
			this.tail =nn;
			this.size++;
			return;
		}
		Node nn= new Node(n);
		nn.next = this.head;
		this.head = nn;
		this.size++;
	}
	
	public void addLast(T n) { //O(1)
		if(this.head == null) {
//			Node nn = new Node(n);
//			this.head =nn;
//			this.tail =nn;
//			this.size++;
			addFirst(n);
			return;
		}
		Node nn = new Node(n);
		this.tail.next = nn;
		this.tail = nn;
		this.size++;
	}
	
	public void Display() {
		Node temp = this.head;
		while(temp!=null) {
			System.out.print(temp.val+ "==> ");
			temp = temp.next;
		}
		System.out.println("END");
	}
	
	public void removeFirst() {
		this.head = this.head.next;
		this.size--;
	}

	public void removeLast() {
		Node temp = this.head;
		while(temp.next!=this.tail) {
			temp =temp.next;
		}
		temp.next = null;
		this.tail = temp;
		this.size--;
	}
	
	
	public void addatindx(T val,int idx) {
		Node temp = this.head;
		int i =1;
		while(i<idx) {
			temp =temp.next;
			i++;
		}
		Node nn = new Node(val);
		nn.next =temp.next;
		temp.next =nn;
		this.size++;
	}
	
	public void removeAtIndx(int idx) {
		Node temp = this.head;
		int i =1;
		while(i<idx) {
			temp =temp.next;
			i++;
		}
		temp.next = temp.next.next;
		this.size--;
	}
	
	public static void main(String[] args) {
		LinkedListG<Integer> ll=  new LinkedListG<>();
		ll.addLast(10);
		ll.addLast(10);
		ll.addLast(10);
		ll.addLast(10);
		
		ll.Display();
		
		LinkedListG<String> ls=  new LinkedListG<>();
		ls.addLast("A");
		ls.addLast("A");
		ls.addLast("A");
		ls.addLast("A");
		ls.addLast("A");
		
		ls.Display();
		
		
		
		
	}
}
