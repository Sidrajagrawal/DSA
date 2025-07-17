package com.LinkedList;

import com.LinkedList.LinkedList.Node;
import java.util.*;

public class StartPointOfLoop {
	
	private static Node convert(int[] arr) {
		if(arr.length == 0) return null;
		
		Node head = new Node(arr[0]);
		Node mover = head;
		Node ref = null;
		for(int i=1;i<arr.length-1; i++) {
			Node temp = new Node(arr[i]);
			if(i==2) {
				ref = temp;
			}
			mover.next = temp;
			mover = temp;
		}
		Node newNode = new Node(arr[arr.length-1]);
		mover.next = newNode;
		newNode.next = ref;
		return head;
		
	}
	
	private static Node Loop(Node head) {
		ArrayList<Node> list = new ArrayList<>();
		Node curr = head;
		Node ref = null;
		while(curr!=null) {
			if(list.contains(curr)) {
				ref = curr;
				break;
			}
			list.add(curr);
		}
		return ref;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		Node head = convert(arr);
		Node newHead = Loop(head);
		System.out.println(newHead.data);
	}
}
