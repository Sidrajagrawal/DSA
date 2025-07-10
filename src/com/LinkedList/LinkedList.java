package com.LinkedList;

public class LinkedList {

	static class Node {
		int data;
		Node next;

		protected Node(int data) {
			this.data = data;
		}

		protected Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	public static Node Convert(int[] arr){
		Node head = new Node(arr[0]);
		Node mover = head;

		for(int i=1; i<arr.length;i++) {
			Node temp = new Node(arr[i]);
			mover.next = temp;
			mover = temp;
		}

		return head;
	}

	static void Traversal(Node head) {
		if(head == null) {
			System.out.print("null");
			return;
		}
		
		Node mover = head;

		while(mover.next!=null) {
			System.out.print(mover.data+"->");
			mover = mover.next;
		}
		System.out.print(mover.data);
	}

	static void Traversal1(Node head) {
		Node mover = head;

		while(mover != null) {
			System.out.print(mover.data+" ");
			mover = mover.next;
		}
	}

	private static int len(Node head) {
		Node mover = head;
		int c=0;
		while(mover != null) {
			mover = mover.next;
			c++;
		}
		return c;
	}

	private static boolean search(Node head,int ele) {
		Node mover = head;
		while(mover != null) {
			if(mover.data == ele) {
				return true;
			}
			mover = mover.next;
		}
		return false;
	}

	private static Node HeadDeletion(Node head) {
		if(head == null) return head;
		head = head.next;
		return head;
	}

	private static Node TailDeletion(Node head) {
		Node mover = head;
		if(mover == null || mover.next == null) {
			return null;
		}
		while(mover.next.next != null) {
			mover = mover.next;
		}
		mover.next = null;
		return head;
	}

	private static Node removeK(Node head,int k) {
		if(head == null) return head;
		if(k==1) {
			head = head.next;
			return head;
		}
		int c=0;
		Node temp = head;
		Node prev = null;
		while(temp != null) {
			c++;
			if(c==k) {
				prev.next = prev.next.next;
				break;
			}
			prev = temp;
			temp = temp.next;
		}
		return head;
	}

	private static Node removeByVal(Node head,int val) {
		if(head == null) return head;

		if(head.data == val) {
			head = head.next;
			return head;
		}

		Node temp = head;
		Node prev = null;

		while(temp != null) {
			if(temp.data == val) {
				prev.next = prev.next.next;
				break;
			}
			prev = temp;
			temp = temp.next;
		}
		return head;
	}

	private static Node insertHead(Node head,int val) {
		Node newhead = new Node(val,head);
		return newhead;
	}

	private static Node insertTail(Node head, int val) {
		if(head == null) {
			return new Node(val);
		}

		Node mover = head;

		while(mover.next != null) {
			mover = mover.next;
		}
		Node temp = new Node(val);
		mover.next = temp;
		return head;
	}

	private static Node insert(Node head,int k,int val) {
		if(head == null || k==1) {
			return new Node(val,head);
		}
		int c=0;
		Node mover = head;
		Node prev = null;
		while(mover!=null) {
			c++;
			if(c==k) {
				Node newNode = new Node(val,mover);
				prev.next = newNode;
				break;
			}
			prev = mover;
			mover = mover.next;
		}
		return head;
	}

	public static void main(String args[]) {
		int[] arr = {10,20,30,40,50};
		Node head = Convert(arr);
//		int l = len(head);
//		boolean found = search(head,20);
//		head = HeadDeletion(head);
//		head = TailDeletion(head);
//		head = removeK(head,3);
//		head = removeByVal(head,40);
//		head = insertHead(head,5);
//		head = insertTail(head,55);
//		head = insert(head,6,25);
		Traversal(head);
	}
}