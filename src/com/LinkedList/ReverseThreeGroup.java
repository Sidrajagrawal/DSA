package com.LinkedList;

import com.LinkedList.LinkedList.Node;
import java.util.*;

public class ReverseThreeGroup {
	
	private static Node reverse(Node t1,Node t2) {
		Node curr = t1;
		Node prev = null;
		while(curr!=t2) {
			Node front = curr.next;
			curr.next = prev;
			prev = curr;
			curr = front;
		}
		Node front = curr.next;
		curr.next = prev;
		prev = curr;
		curr = front;
		return prev;
	}
	
	private static Node Group(Node head,int k) {
		Node t1 = head;
		Node t2 = head;
		while(t2!=null) {
			if(k==1) {
				Node front = t2.next;
				Node newNode = reverse(t1,t2);
				t1.next = front;
				t1=front;
				t2=front;
				k=3;
			}else {
				k--;
			}
			t2 = t2.next;
		}
		return head;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int k=3;
		Node head = LinkedList.Convert(arr);
		Node newHead = Group(head,k);
		LinkedList.Traversal(newHead);
	}

}
