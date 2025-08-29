package linkedList;

import linkedList.LinkedList.Node;

public class OddEven {
	
	private static Node solve(Node head) {
		if(head.next == null) return head;
		Node odd = head;
		Node even = head.next;
		Node evenHead = even;
		while(even.next != null) {
			odd.next = odd.next.next;
			even.next = even.next.next;
			odd = odd.next;
			even = even.next;
		}
		odd.next=evenHead;
		return head;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		Node head = LinkedList.Convert(arr);
		Node head1 = solve(head);
		LinkedList.Traversal(head1);
	}

}
