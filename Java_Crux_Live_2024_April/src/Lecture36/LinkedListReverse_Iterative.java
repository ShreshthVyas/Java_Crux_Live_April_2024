package Lecture36;


public class LinkedListReverse_Iterative {
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

	public ListNode reverseList(ListNode head) { //O(n) //sc - O(1)
		if(head == null) {
			return null;
		}
		ListNode prev =null;
		while(head!=null) {
			ListNode curr = head.next;
			head.next = prev;
			prev =head;
			head =curr;
		}
		return prev;
	}
}
