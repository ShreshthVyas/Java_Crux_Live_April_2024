package Lecture36;


public class LinkedListReverse_Recursive {
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
		return reverse(null,head);
	}

	private ListNode reverse(ListNode prev, ListNode curr) {
		// TODO Auto-generated method stub
		if(curr == null) {
			return prev;
		}
		ListNode temp = reverse(curr, curr.next);
		curr.next = prev;
		return temp;
		
	}
}
