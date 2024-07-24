package Lecture42;

import java.util.Collections;
import java.util.PriorityQueue;

public class HeapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		PriorityQueue<Integer>  pq = new PriorityQueue<>(); //min heap
		PriorityQueue<Integer>  pq = new PriorityQueue<>(Collections.reverseOrder());// max heap
		pq.add(4);
		pq.add(5);
		pq.add(20);
		pq.add(-1);
		pq.add(2);
		pq.add(3);
		pq.add(11);
		pq.add(9);
		pq.add(8);
		pq.add(100);
		
		System.out.println(pq.remove());
	}

}
