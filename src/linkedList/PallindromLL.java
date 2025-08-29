package linkedList;
import linkedList.LinkedList.Node;

public class PallindromLL {
	
	private static int len(Node head) {
		int c = 0;
		Node mover = head;
		
		while(mover!=null) {
			c++;
			mover = mover.next;
		}
		return c;
	}
	
	private static Node reverse(Node head) {
		if(head == null) return null;
		
		Node current = head;
		Node prev = null;
		while(current!=null) {
			Node front = current.next;
			current.next = prev;
			prev = current;
			current = front;
		}
		return prev;
	}
	
	private static boolean solve(Node head,int k) {
		if(head == null || head.next == null) return true;
		
		Node fast = head;
		
	
		for(int i=0; i<k/2; i++) {
			fast = fast.next;
		}
		
		Node newHead = reverse(fast.next);
		Node dummy = newHead;
		Node first = head;
		while(newHead!= null) {
			if(first.data != newHead.data) {
				return false;
			}
			newHead = newHead.next;
			first = first.next;
		}
		Node dummy2 = reverse(dummy);
		return true;
	}
	
	public static void main(String[] args ) {
		int[] arr = {0,1,2,3,3,2,1,0};
		Node head = LinkedList.Convert(arr);
		int k = len(head);
		System.out.println(solve(head,k));
	}

}
