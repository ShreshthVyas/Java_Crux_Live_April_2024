package Lecture37;

import Lecture36.LinkedListMiddle.ListNode;

public class MergetwoSortedList {
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
	class Solution {
	    public ListNode mergeTwoLists(ListNode A, ListNode B) {
	        ListNode newhead = new ListNode() ;
	        ListNode temp = newhead;
	        while(A!=null && B!=null) {
	        	if(A.val<B.val) {
	        		temp.next =A;
	        		A =A.next;
	        		temp = temp.next;
	        	}
	        	else {
	        		temp.next = B;
	        		B =B.next;
	        		temp =temp.next;
	        	}
	        }
	        
	        if(A == null) {
	        	temp.next =B;
	        }
	        if(B == null) {
	        	temp.next = A;
	        }
	        
	        return newhead.next; 
	    }
	}

}
