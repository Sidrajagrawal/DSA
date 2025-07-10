package com.LinkedList;
import com.LinkedList.LinkedList.Node;;

public class ReverseLL {
	
	static Node Reverse(Node head) {
		if(head == null) return head;
		
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
	
	public static void main(String args[]) {
		int[] arr = {1,2,3,4,5};
		Node head = LinkedList.Convert(arr);
		Node head1 = Reverse(head);
		LinkedList.Traversal(head1);
	}
}