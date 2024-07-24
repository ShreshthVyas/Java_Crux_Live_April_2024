package Lecture42;

import java.util.ArrayList;

public class Heap {
	
	private ArrayList<Integer> heap;
	
	public Heap() {
		heap = new ArrayList<>();
	}
	
	public void add(int val) { //O(logN)
		heap.add(val);
		upheapify(heap.size()-1);
	}

	private void upheapify(int ci) {
		// TODO Auto-generated method stub
		int pi = (ci-1)/2;
		if(heap.get(pi) > heap.get(ci)) {
			swap(pi,ci);
			upheapify(pi);
		}
		
	}

	private void swap(int pi, int ci) {
		// TODO Auto-generated method stub
		int tc = heap.get(ci);
		int tp = heap.get(pi);
		
		heap.set(pi, tc);
		heap.set(ci, tp);
		
	}
	
	public int remove() {
		int rv = heap.get(0);
		swap(0, heap.size()-1);
		heap.remove(heap.size()-1);
		downheapify(0);
		return rv;
	}

	private void downheapify(int pi) {
		// TODO Auto-generated method stub
		int c1 = 2*pi +1;
		int c2 = 2*pi +2;
		int mini =pi;
		
		if(c1< heap.size() && heap.get(mini)>heap.get(c1)) {
			mini = c1;
		}
		if(c2< heap.size() && heap.get(mini)>heap.get(c2)) {
			mini = c2;
		}
		
		if(mini!=pi) {
			swap(pi, mini);
			downheapify(mini);
		}
	}
	
	public int peek() {
		return heap.get(0);
	}
	
	public void Display() {
		System.out.println(heap);
	}
	
}
