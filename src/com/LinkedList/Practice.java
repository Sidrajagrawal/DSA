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
	
	public static void main(String args[]) {
		List<Integer> queue = new ArrayList<>();
		queue.add(11);
		queue.add(12);
		queue.add(13);
		queue.add(14);
		queue.add(0,1);
		System.out.print(queue);
		
	}
}
