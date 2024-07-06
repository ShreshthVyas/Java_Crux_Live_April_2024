package Lecture35;

public class Linkedlist {

	public class Node{
		int val;
		Node next;
		public Node() {
			this.val =-1;
			this.next =null;
		}
		public Node(int val) {
			this.val = val;
			this.next =null;
		}
	}
	
	private Node head;
	private int size;
	private Node tail;
	
	public void addFirst(int n) { //O()1
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
	
	public void addLast(int n) { //O(1)
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
	
	
	public void addatindx(int val,int idx) {
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
	
	public int getValueATindx(int idx) {
		Node temp = this.head;
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp.val;
	}
	
	public int linearSearch(int value) {
		Node temp = this.head;
		int idx =0;
		while(temp!=null) {
			if(temp.val == value) {
				return idx;
			}
			temp =temp.next;
			idx++;
		}
		return -1;
	}
}
