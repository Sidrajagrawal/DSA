package com.LinkedList;

import com.LinkedList.LinkedList.Node;

public class RemoveLL {
	public static void main(String args[]) {
		int[] arr = {6,6,6,6};
		int val = 6;
		Node head = LinkedList.Convert(arr);
		Node dummy = new Node(-1);
		dummy.next = head;
		Node curr = dummy;
		
		while(curr.next!=null) {
			if(curr.next.data == val) {
				Node temp = curr.next;
				curr.next = curr.next.next;
				temp.next = null;
			}else {
				curr = curr.next;
			}
		}
		
		LinkedList.Traversal(dummy.next);
	}

}
