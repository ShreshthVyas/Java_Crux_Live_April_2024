package Lecture29;

public class Stack {
	private int arr[];
	private int top =-1;
	
	public Stack() {
		this.arr = new int[5];
	}
	public Stack(int size) {
		this.arr = new int[size];
	}
	
	//O(1)
	public boolean isFull() {
		return top == arr.length-1;
	}
	//O(1)
	public boolean isEmpty() {
		return top == -1;
	}
	//O(1)
	public void push(int n) throws Exception {
		if(isFull()) {
			throw new Exception("Bhai stack full h");
		}
		top++;
		arr[top] = n;
	}
	//O(1)
	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Bhai Stack khali h");
		}
		int val = arr[top];
		arr[top] = 0;
		top--;
		return val;
	}
	//O(1)
	public int peek() throws Exception {
		if(isEmpty()) {
			throw new Exception("Bhai Stack khali h");
		}
		return arr[top];
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("NO ELEMENT IN STACK");
			return;
		}
		for (int i = top; i>=0; i--) {
			System.out.println(arr[i]);
		}
	}
	
	public void clear() {
		for (int i = top; i>=0; i--) {
			this.arr[i] = 0;
		}
		top =-1;
	}
	
	public int size() {
		return top+1;
	}
}
