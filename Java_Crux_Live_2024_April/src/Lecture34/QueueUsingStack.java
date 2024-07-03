package Lecture34;

import Lecture33.Dynamicstack;

public class QueueUsingStack {
	private Dynamicstack s;
	
	public QueueUsingStack() {
		s = new Dynamicstack();
	}
	
	public void Enqueue(int n) throws Exception {
		s.push(n);
	}
	
	public int Dequeue() throws Exception {
		Dynamicstack h = new Dynamicstack();
		while(!s.isEmpty()) {
			h.push(s.pop());
		}
		int temp = h.pop();
		while(!h.isEmpty()) {
			s.push(h.pop());
		}
		return temp;
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		QueueUsingStack q = new QueueUsingStack();
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		
		System.out.println(q.Dequeue());
		System.out.println(q.Dequeue());
	}

}
