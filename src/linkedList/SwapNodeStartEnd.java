package linkedList;

import linkedList.LinkedList.Node;

public class SwapNodeStartEnd {
	public static void main(String args[]) {
		int[] arr = {1,2,3,4,5};
		Node head = LinkedList.Convert(arr);
		int k = 2;
		
		Node first = head;
		Node second = head;
		Node current = head;
		int count = 1;
		
		while(current!=null) {
			if(count == k) {
				first = current;
			}
			if(count > k) {
				second = second.next;
			}
			current = current.next;
			count++;
		}
		
		int temp = first.data;
		first.data = second.data;
		second.data = temp;
		LinkedList.Traversal(head);
		
	}
}

