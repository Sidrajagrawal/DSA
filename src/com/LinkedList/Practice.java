package com.LinkedList;
import com.LinkedList.LinkedList.Node;
import java.util.*;

public class Practice {
	
	private static Node getkthNode(Node temp,int k) {
		k = k-1;
		while(temp!=null && k>0) {
			k--;
			temp = temp.next;
		}
		return temp;
	}
	
	private static Node reverse(Node temp) {
		Node curr = temp;
		Node prev =null;
		while(curr!=null){
			Node front = curr.next;
			curr.next = prev;
			prev = curr;
			curr= front;
		}
		return prev;
	}
	
	private static Node Group(Node head,int k) {
		Node temp = head;
		Node Last = null;
		
		while(temp!=null) {
			Node kthNode  = getkthNode(temp,k);
			if(kthNode == null) {
				if(Last!=null) Last.next = temp;
				break;
			}
			Node nextNode = kthNode.next;
			kthNode.next = null;
			reverse(temp);
			if(temp == head) {
				head = kthNode;
			}else {
				Last.next = kthNode;
			}
			Last = temp;
			temp = nextNode;
		}
		return head;
		
	}

    public static void main(String args[]) {
    	int[] arr = {1,2,3,4,5,6,7,8,9,10};
    	Node head = LinkedList.Convert(arr);
    	int k=3;
    	Node newhead = Group(head,k);
    	LinkedList.Traversal(newhead);
    }
}
