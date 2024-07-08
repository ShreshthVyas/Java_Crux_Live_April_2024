package Lecture36;

public class LinkedListMiddle {

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
	    public ListNode middleNode(ListNode head) {
	        ListNode slow = head;
	        ListNode fast = head;
	        
	        while(fast!=null && fast.next!=null) { // for prev node in even change fast.next to fast.next.next
	        	fast = fast.next.next;
	        	slow = slow.next;
	        }
	        
	        return slow;
	    }
	}

}
