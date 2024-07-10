package Lecture37;

import Lecture35.Linkedlist.Node;
import Lecture36.CycleDetectionLinkedList.ListNode;

public class CycleRemovalLL {
	public class Node {
		int val;
		Node next;

		public Node() {
			this.val = -1;
			this.next = null;
		}

		public Node(int val) {
			this.val = val;
			this.next = null;
		}
	}

	private Node head;
	private int size;
	private Node tail;

	public void addFirst(int n) { // O()1
		if (this.head == null) {
			Node nn = new Node(n);
			this.head = nn;
			this.tail = nn;
			this.size++;
			return;
		}
		Node nn = new Node(n);
		nn.next = this.head;
		this.head = nn;
		this.size++;
	}

	public void addLast(int n) { // O(1)
		if (this.head == null) {
			addFirst(n);
			return;
		}
		Node nn = new Node(n);
		this.tail.next = nn;
		this.tail = nn;
		this.size++;
	}

	public Node getValueATindx(int idx) {
		Node temp = this.head;
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void createCycle() {
		tail.next = getValueATindx(2);
	}

	public boolean hasCycle(Node head) {
		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (slow == fast) { // cycle found
				return true;
			}
		}

		return false;
	}

	public Node meetpoint(Node head) {
		Node slow = head;
		Node fast = head;

		while (fast.next != null && fast.next.next != null) { // for prev node in even change fast.next to
																// fast.next.next
			fast = fast.next.next;
			slow = slow.next;
			if (slow == fast) { // cycle found
				return slow;
			}

		}

		return null;
	}

	public void removecycle() {
		Node meet = meetpoint(head);
		if (meet == null) {
			return;
		}

		Node start = head;
		while (start != null) {
			Node temp = meet;
			while (temp.next != meet) {
				if (temp.next == start) {
					temp.next = null;
					return;
				}
				temp = temp.next;
			}
			start = start.next;
		}

	}

	public void removecycle2() {
		Node meet = meetpoint(head);
		if (meet == null) {
			return;
		}
		int count = 1;
		Node temp = meet;
		// count the length of cycle
		while(temp.next!=meet) {
			count++;
			temp = temp.next;
		}
		Node fast = head;
		Node slow =head;
		//Move fast pointer from head cycle-length times
		for (int i = 0; i < count; i++) {
			fast = fast.next;
		}
		
		// find the meet point
		while(fast.next!=slow.next) {
			fast = fast.next;
			slow =slow.next;
		}
		
		fast.next =null;
	}
	
	public void FloydCycleRemoval() {
		Node meet = meetpoint(head);
		if (meet == null) {
			return;
		}
		int count = 1;
		Node fast = meet;
		Node slow = head;
		while(fast.next!=slow.next) {
			fast = fast.next;
			slow =slow.next;
		}
		
		fast.next =null;
	}
	public void Display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.val + "==> ");
			temp = temp.next;
		}
		System.out.println("END");
	}

	public static void main(String[] args) {
		CycleRemovalLL ll = new CycleRemovalLL();
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		ll.addLast(5);
		ll.addLast(6);
		ll.addLast(7);
		ll.createCycle();
//		ll.removecycle();
//		ll.removecycle2();
		ll.FloydCycleRemoval();
		ll.Display();
	}
}
