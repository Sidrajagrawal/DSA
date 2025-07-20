package com.LinkedList;

import com.LinkedList.LinkedList.Node;
import java.util.*;

public class RotateLL {
	
	private static Node getTail(Node head) {
		Node curr = head;
		while(curr.next.next!=null) {
			curr = curr.next;
		}
		return curr;
	}
	
	private static int len(Node head) {
		Node curr = head;
		int c=0;
		while(curr!=null) {
			c++;
			curr=curr.next;
		}
		return c;
	}
	
	private static Node Rotate(Node head,int k) {
		Node temp = head;
		Node fast = head;
		for(int i=1;i<k;i++) {
			fast = fast.next;
		}
		Node nextNode = fast.next;
		fast.next = null;
		Node t1 = nextNode;
		while(t1.next!=null) {
			t1 = t1.next;
		}
		head = nextNode;
		t1.next = temp;
		return head;
	}
	
	public static void main(String args[]) {
		int[] arr = {1,2,3,4,5};
		int k=0;
		Node head = LinkedList.Convert(arr);
		int l =len(head);
		if(k%l==0) {
			LinkedList.Traversal(head);
		}else {
			Node newHead = Rotate(head,l-k%l);
			LinkedList.Traversal(newHead);		
		}
	}
}
