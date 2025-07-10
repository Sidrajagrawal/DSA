package com.LinkedList;
import com.LinkedList.LinkedList.Node;

public class SortZeroOneTwo {
	
	private static Node Method1(Node head) {
		int c1=0,c2=0,c3=0;
		Node mover = head;
		while(mover!=null) {
			if(mover.data == 0) {
				c1++;
			}else if(mover.data == 1) {
				c2++;
			}else {
				c3++;
			}
			mover = mover.next;
		}
		mover = head;
		for(int i=0;i<c1;i++) {
			mover.data = 0;
			mover = mover.next;
		}
		for(int i=0;i<c2;i++) {
			mover.data = 1;
			mover = mover.next;
		}
		for(int i=0;i<c3;i++) {
			mover.data = 2;
			mover = mover.next;
		}
		return head;
	}
	
	private static Node Method2(Node head) {
		if (head == null || head.next == null) return head;

		Node zeroHead = new Node(-1);
		Node oneHead = new Node(-1);
		Node twoHead = new Node(-1);
		Node zero = zeroHead;
		Node one = oneHead;
		Node two = twoHead;

		Node mover = head;
		while (mover != null) {
			if (mover.data == 0) {
				zero.next = mover;
				zero = mover;
			} else if (mover.data == 1) {
				one.next = mover;
				one = mover;
			} else {
				two.next = mover;
				two = mover;
			}
			mover = mover.next;
		}

		zero.next = (oneHead.next != null) ? oneHead.next : twoHead.next;
		one.next = twoHead.next;
		two.next = null;

		return zeroHead.next;
	}

	public static void main(String[] args) {
		int[] arr = {1,0,1,2,0,2,1};
		Node head = LinkedList.Convert(arr);
//		Node head1 = Method1(head);
//		LinkedList.Traversal(head1);
		Node head2 = Method2(head);
		LinkedList.Traversal(head2);		
	}

}
