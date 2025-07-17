	package com.LinkedList;
import com.LinkedList.LinkedList.Node;

public class RemoveNBack {
	
	static int len(Node head) {
		int cin=0;
		Node mover = head;
		
		while(mover!=null) {
			cin++;
			mover = mover.next;
		}
		return cin;
	}
	
	static Node Method1(Node head,int l) {
		if(head == null ) return head;
		
		Node mover = head;
		if(l==0) {
			Node newHead = head.next;
			head.next = null;
			return newHead;
		}
		while(mover!=null) {
			l--;
			if(l==0) {
				break;
			}
			mover = mover.next;
		}
		if(mover.next == null) {
			return head;
		}
		Node dummy = mover.next;
		mover.next = mover.next.next;
		return head;
	}
	
	private static Node Method2(Node head,int c) {
		Node fast = head;
		Node slow = head;
		for(int i=0; i<c;i++) {
			fast = fast.next;
		}
		if(fast == null) {
			return head.next;
			
		}
		
		while(fast.next != null ) {
			fast = fast.next;
			slow = slow.next;
		}
		Node dummy = slow.next;
		slow.next = slow.next.next;
		dummy= null;
		return head;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int c = 2;
		Node head = LinkedList.Convert(arr);
//		int l = len(head)-c;
//		Node head1 = Method1(head,l);
		Node head2 = Method2(head,c);
		LinkedList.Traversal(head2);
		
	}
}
