package linkedList;

public class Find_length_of_Loop {
	class Node {
		int data;
		Node next;

		Node(int x) {
			data = x;
			next = null;
		}
	}

	class Solution {
		public int lengthOfLoop(Node head) {
			if (head == null)
				return 0;
			Node fast = head;
			Node slow = head;
			while (fast != null && fast.next != null) {
				slow = slow.next;
				fast = fast.next.next;
				if (slow == fast)
					break;
			}
			if (fast == null || fast.next == null)
				return 0;
			fast = fast.next;
			int l = 1;
			while (fast != slow) {
				fast = fast.next;
				l++;
			}
			return l;
		}
	}
}
