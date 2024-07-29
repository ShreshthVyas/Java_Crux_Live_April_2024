package Lecture44;

import java.util.PriorityQueue;

public class MinimumSumPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = { 100,1,3,9,6,7,14,10 };
		int arr[] = {1, 2, 3, 4};
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for (int i = 0; i < arr.length; i++) {
			pq.offer(arr[i]);
		}
		int sum =0;
		while(pq.size()>1) {
			int a = pq.poll();
			int b = pq.poll();
			sum+= (a+b);
			
			pq.add(a+b);
		}
		
		System.out.println(sum);
	}

}
