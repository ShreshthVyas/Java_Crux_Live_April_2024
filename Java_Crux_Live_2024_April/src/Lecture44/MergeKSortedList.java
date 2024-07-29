package Lecture44;

import java.util.Comparator;
import java.util.PriorityQueue;

import Lecture36.LinkedListMiddle.ListNode;

public class MergeKSortedList {
	
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public ListNode mergeKLists(ListNode[] lists) {
		PriorityQueue<ListNode>  pq =  new PriorityQueue<>(new Comparator<ListNode>() {

			@Override
			public int compare(ListNode o1, ListNode o2) {
				// TODO Auto-generated method stub
				return o1.val -o2.val;
			}
		});
		
		for (int i = 0; i < lists.length; i++) { // Insert All head in pq
			if(lists[i]!=null){
                pq.offer(lists[i]);
            }
		}
		
		ListNode dummy = new ListNode();
		ListNode temp = dummy;
		
		while(!pq.isEmpty()) {
			ListNode rv = pq.poll(); // retuen node with smallest val
			dummy.next = rv;
			dummy = rv;
			if(rv.next!=null) {
				pq.offer(rv.next);
			}
		}
		
		return temp.next;
		
	}
}
