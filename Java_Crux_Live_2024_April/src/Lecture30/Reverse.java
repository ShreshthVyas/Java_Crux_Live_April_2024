package Lecture30;

import java.util.Stack;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		System.out.println(st);
		reverse(st);
		System.out.println(st);
	}

	public static void reverse(Stack<Integer> st) {
		// TODO Auto-generated method stub
		if(st.isEmpty()) {
			return;
		}
		int val = st.pop();
		reverse(st);
		iab(st, val);
	}
	
	public static void iab(Stack<Integer> st, int item) {
		// TODO Auto-generated method stub
		if(st.isEmpty()) {
			st.push(item);
			return;
		}
		
		int val = st.pop();
		iab(st, item);
		st.push(val);
	}

}
