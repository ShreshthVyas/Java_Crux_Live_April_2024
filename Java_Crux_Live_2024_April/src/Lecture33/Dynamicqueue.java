package Lecture33;

import Lecture29.Queue;

public class Dynamicqueue extends Queue{
	
	@Override
	public void Enqueue(int n) throws Exception {
		
		if(isFull()) {
			int newarr[] = new int[2*arr.length];
			for (int i = 0; i < size; i++) {
				int idx = (front+i)%arr.length;
				newarr[i] = arr[idx];
			}

			arr = newarr;
		}
		super.Enqueue(n);
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Dynamicqueue dq = new Dynamicqueue();
		dq.Enqueue(0);
		dq.Enqueue(1);
		dq.Enqueue(2);
		dq.Enqueue(3);
		dq.Enqueue(4);
		dq.Enqueue(5);
		dq.Enqueue(6);
		dq.Enqueue(7);
		dq.Enqueue(8);
		dq.Enqueue(9);
		dq.Enqueue(10);
		
		dq.display();
//		System.out.println(dq.arr.length);
		
		
		
	}

}
