package Lecture30;

import java.util.Stack;

public class InsertAtbottomOptimised {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TC -O(n)  Sc- O(1)
		Stack<Integer>  st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		iab(st,60);
		System.out.println(st);
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
