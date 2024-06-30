package Lecture33;

import Lecture29.Stack;

public class Dynamicstack extends Stack {
	
	@Override
	public void push(int n) throws Exception {
		if(isFull()) {
			int newarr[] = new int[2*arr.length];
			for (int i = 0; i < arr.length; i++) {
				newarr[i] = arr[i];
			}
			arr= newarr;
		}
		super.push(n);
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Dynamicstack s = new Dynamicstack();
		s.push(0);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(5);
		s.push(6);
		s.push(7);
		s.push(8);
		s.display();
		s.pop();
		s.display();
		
	}

}
