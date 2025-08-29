package linkedList;

import java.util.*;

import linkedList.LinkedList.Node;

public class ReverseKGroup {
	
	private static Node getkthNode(Node temp, int k ) {
		 k -= 1;
		 while(temp!=null && k>0) {
			 k--;
			 temp = temp.next;
		 }
		 return temp;
	}
	
	private static Node reverse(Node temp) {
		Node curr = temp;
		Node prev = null;
		while(curr!=null) {
			Node front = curr.next;
			curr.next = prev;
			prev = curr;
			curr = front;
		}
		return prev;
	}
	
	private static Node kReverse(Node head,int k) {
		Node temp = head;
		Node prevLast = null;
		while(temp!=null) {
			Node kthNode = getkthNode(temp,k);
			if(kthNode == null) {
				if(prevLast != null) prevLast.next = temp;
				break;
			}
			
			Node nextNode = kthNode.next;
			kthNode.next = null;
			reverse(temp);
			if(temp == head) {
				head = kthNode;
			}
			else {
				prevLast.next = kthNode;
			}
			
			prevLast = temp;
			temp = nextNode;
		}
		return head;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int k=3;
		Node head = LinkedList.Convert(arr);
		Node ans = kReverse(head,k);
		LinkedList.Traversal(ans);
	}

}
