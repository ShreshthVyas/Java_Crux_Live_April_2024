package Lecture36;


public class CycleDetectionLinkedList {
	
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
	
	public class Solution {
	    public boolean hasCycle(ListNode head) {
	    	 ListNode slow = head;
		        ListNode fast = head;
		        
		        while(fast!=null && fast.next!=null) { 
		        	fast = fast.next.next;
		        	slow = slow.next;
		        	if(slow == fast) { //cycle found
		        		return true;
		        	}
		        }
		        
		        return false;
	    }
	}
	

}
