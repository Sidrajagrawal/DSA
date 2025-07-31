package com.LinkedList;
import com.LinkedList.LinkedList.Node;
import java.util.*;

public class Practice {
	
	static Node reverse(Node head) {
		Node curr = head;
		Node prev = null;
		while(curr!=null) {
			Node front = curr.next;
			curr.next = prev;
			prev = curr;
			curr = front;
		}
		return prev;
	}
	
	public static void main(String[] args) {
		int c=0;
		while(true) {
			c++;
			System.out.print(c);
			if(c==10) {
				break;
			}
		}
	}
}
