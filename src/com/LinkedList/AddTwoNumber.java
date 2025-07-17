package com.LinkedList;

import com.LinkedList.LinkedList.Node;

public class AddTwoNumber {
	
	static Node add (Node head1,Node head2) {
		Node t1= head1,t2=head2;
		Node dummy = new Node(-1);
		Node current = dummy;
		int carry=0,sum=0;
		while(t1!=null || t2!=null) {
			sum=carry;
			if(t1!=null) {
				sum += t1.data;
				t1 = t1.next;
			}if(t2!=null) {
				sum += t2.data;
				t2 = t2.next;
			}
			Node newNode = new Node(sum%10);
			carry = sum/10;
			current.next = newNode;
			current = current.next;
		}
		if(carry>0) {
			Node newNode = new Node(carry);
			current.next = newNode;
			current = current.next;
		}
		return dummy.next;
	}
	
	public static void main(String[] args) {
		int[] arr = {2,4,3};
		int[] vrr = {5,6,4};
		
		Node head1 = LinkedList.Convert(arr);
		Node head2 = LinkedList.Convert(vrr);
		Node head3 = add(head1,head2);
		LinkedList.Traversal(head3);
	}
}
