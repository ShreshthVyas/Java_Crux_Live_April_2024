package Lecture34;

import Lecture33.Dynamicqueue;

public class StackUsingQ {
	private Dynamicqueue q;
	
	public StackUsingQ() {
		q = new Dynamicqueue();
	}
	public boolean isFull() {
		return q.isFull();
	}
	public boolean isEmpty() {
		return q.isEmpty();
	}
	
	public void push(int n) throws Exception { // O(N)
		Dynamicqueue h = new Dynamicqueue();
		while(!q.isEmpty()) {
			h.Enqueue(q.Deque());
		}
		q.Enqueue(n);
		while(!h.isEmpty()) {
			q.Enqueue(h.Deque());
		}
	}
	public int pop() throws Exception { //O(1)
		return q.Deque();
	}
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StackUsingQ st = new StackUsingQ();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		
		System.out.println(st.pop());
		System.out.println(st.pop());
		
		st.push(70);
		st.push(80);
		System.out.println(st.pop());

	}

}
