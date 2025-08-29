package linkedList;

import linkedList.LinkedList.Node;

public class MiddleNode {
	
	private static int len(Node head) {
		if(head == null) return 0;
		
		Node mover = head;
		int  c=0;
		while(mover!=null) {
			c++;
			mover = mover.next;
		}
		return c;
	}
	
	private static Node midMethod1(Node head,int l) {
		if(head == null) return head;
		int val = (l/2)+1;
		Node mover = head;
		for(int i=1;i<val;i++) {
			mover = mover.next;
		}
		return mover;
		
	}
	
	private static Node midMethod2(Node head) {
		if(head == null) return head;
		
		Node fast = head;
		Node slow = head;
		
		while( fast!=null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}
	
	public static void main(String args[]) {
		int[] arr = {1,2,3,4,5};
		Node head = LinkedList.Convert(arr);
		
		int l = len(head);
//		Node head1 = midMethod1(head,l);
		Node head1 = midMethod2(head);
		System.out.println(head1.data);
	}
}
