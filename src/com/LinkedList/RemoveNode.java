package com.LinkedList;

import com.LinkedList.LinkedList.Node;

public class RemoveNode {
	public static void main(String args[]) {
		int[] arr = {1,2,3,4,5};
		Node head = new Node(arr[0]);
		Node ref = head;
		Node mover = head;
		for(int i=1; i<arr.length; i++) {
			Node newNode = new Node (arr[i]);
			mover.next = newNode;
			mover = newNode;
		}
		
		Node prev = ref;
		Node curr = ref.next;
		while(curr.next != null) {
			prev.data = curr.data;
			prev = prev.next;
			curr = curr.next;
		}
		prev.data = curr.data;
		prev.next = null;
		LinkedList.Traversal(head);
	}
}
