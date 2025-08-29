package linkedList;
import linkedList.LinkedList.Node;

public class SwapNodes {
	public static void main(String args[]) {
		int[] arr = {1,2,3,4};
		Node head = LinkedList.Convert(arr);
		Node curr = head;
		Node prev = null;
		while(curr!=null) {
			Node temp = curr;
			Node front = curr.next;
			curr = front.next;
			front.next = temp;
			temp.next = curr;
			prev.next = temp;
		}
		LinkedList.Traversal(head);
	}
}
