package com.LinkedList;

import java.util.*;

import com.LinkedList.LinkedList.Node;

public class IntersectingPointLL {
	
	private static Node Method1(Node head,Node head1) {
		Node temp1 = head;
		List<Node> ref = new ArrayList<>();
		while(temp1!=null) {
			ref.add(temp1);
			temp1 = temp1.next;
		}
		Node temp2 = head1;
		while(temp2!=null) {
			for (Node node : ref) {
	            if (node == temp2) {
	                return node; 
	            }
	        }
			temp2 = temp2.next;
		}
		return null;
	}
	
	private static int len(Node head) {
		if(head == null) return 0;
		
		int c =0;
		Node mover = head;
		while(mover!=null) {
			c++;
			mover = mover.next;
		}
		return c;
	}
	
	private static Node Method2(Node head,Node head1) {
		int l1 = len(head);
		int l2 = len(head1);
		Node t1 = head;
		Node t2 = head1;
		if(l1>l2) {
			for(int i=0;i<l1-l2;i++) {
				t1 = t1.next;
			}
		}else {
			for(int i=0;i<l2-l1;i++) {
				t2 = t2.next;
			}
		}
		while(t1!=null || t2!=null) {
			if(t1.next == t2.next) {
				return t1.next;
			}
			t1 =t1.next;
			t2 = t2.next;
		}
		return null;
	}
	
	private static Node Method3(Node head,Node head1) {
		if(head == null || head1 == null) return null;
		
		Node t1 = head;
		Node t2 = head1;
		
		while(t1!=t2) {
			t1 = (t1!=null) ? t1.next : head1;
            t2 = (t2!=null) ? t2.next : head;
			
		}
		return t1;
	}
	
	public static void main(String args[]) {
		int[] arr = {3, 1, 4, 6, 2};
	    int[] vrr = {1, 2, 4, 5};

	    Node head = new Node(arr[0]);
	    Node mover = head;
	    Node ref = null;

	    for (int i = 1; i < arr.length; i++) {
	        Node temp = new Node(arr[i]);
	        mover.next = temp;
	        if (i == 2) { 
	            ref = temp;
	        }
	        mover = temp;
	    }

	    Node head1 = new Node(vrr[0]);
	    Node mover1 = head1;

	    for (int i = 1; i < vrr.length; i++) {
	        Node temp = new Node(vrr[i]);
	        mover1.next = temp;
	        mover1 = temp;
	    }

	    mover1.next = ref;

//	    Node head2 = Method1(head, head1);		
//	    Node head2 = Method2(head,head1);
	    Node head2 = Method3(head,head1);
	    LinkedList.Traversal(head2);
	}
}
 