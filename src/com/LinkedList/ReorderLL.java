package com.LinkedList;

import com.LinkedList.LinkedList.Node;

public class ReorderLL {
	
	static int len(Node head) {
		int c = 0;
		Node mover = head;
		while(mover!=null) {
			c++;
			mover = mover.next;
		}
		return c;
	}
	
	static Node reverse(Node head,int l) {
		Node mover = head;
		Node prev = null;
		for(int i=1;i<l;i++) {
			mover = mover.next;
		}
		Node curr  = mover;
		while(curr!=null) {
			Node front = curr.next;
			curr.next = prev;
			prev = curr;
			curr = front;
		}
		
		return prev;
	}
	
	static Node Reorder(Node head) {
		Node t1 = head;
		int l  = len(head);
		Node t2 = reverse(head,l/2+1);
		Node prev = null;
		while(t2!=null && t2.next!=null) {
			Node front1 = t1.next;
			t1.next = t2;
			Node front2 = t2.next;
			t2.next = front1; 
			t1 = front1;
			t2 = front2;
		}
		return head;
	}
	
	public static void main(String args[]) {
		int[] arr = {1};
		Node head = LinkedList.Convert(arr);
		
		Node newhead = Reorder(head);
		LinkedList.Traversal(newhead);
	}
}
