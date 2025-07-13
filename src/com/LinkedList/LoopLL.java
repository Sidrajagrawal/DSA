package com.LinkedList;

import com.LinkedList.LinkedList.Node;

public class LoopLL {
	
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
	
	static Node LoopPoint = null;
	
	private static boolean Loop(Node head) {
		if(head == null) return false;
		Node fast = head;
		Node slow = head;
		while(fast != null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			if(fast == slow) {
				LoopPoint = slow;
				return true;
			}
		}
		return false;
	}
	
	private static int LenLoop(Node head) {
		int c=0;
		Node mover = LoopPoint;
		boolean flag = true;
		while(flag) {
			c++;
			mover = mover.next;
			if(mover == LoopPoint) {
				break;
			}
		}
		return c;
	}
	
	public static void main(String args[]) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int [] vrr = {1,2,3,4,5};
		Node Linear = LinkedList.Convert(vrr);
		Node head = convert(arr);
		Loop(head);
		if(Loop(head)) {
			int len = LenLoop(head);
			System.out.print(len);
		}else {
			System.out.print(0);
		}

	}
}
