package com.LinkedList;

import com.LinkedList.LinkedList.Node;

public class Add1ToLL {

	private static Node reverse(Node head) {
		if(head == null || head.next == null) return head;
		
		Node current = head;
		Node prev = null;
		while(current!=null) {
			Node front = current.next;
			current.next = prev;
			prev = current;
			current = front;
		}
		return prev;
	}
	
	private static Node add(Node head) {
		if(head == null) return head;
		
		Node rev = reverse(head);
		int carry = 1;
		Node dummy = new Node(-1);
		Node mover = dummy;
		while(rev!=null) {
			int sum = rev.data + carry;
			Node newNode = new Node(sum%10);
			carry = sum/10;
			mover.next = newNode;
			mover = newNode;
			rev = rev.next;
		}
		if(carry > 0) {		
			mover.next = new Node(1);
		}
		return reverse(dummy.next);
	}
	
	public static void main(String args[]) {
		int[] arr = {1,5,9};
		Node head = LinkedList.Convert(arr);
		Node addHead = add(head);
		LinkedList.Traversal(addHead);
	}
}
