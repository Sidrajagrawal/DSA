package linkedList;

import linkedList.LinkedList.Node;

public class MergeSortedLL {
	
	private static Node merge(Node list1,Node list2) {
		Node t1 = list1;
        Node t2 = list2;
        Node dummy = new Node(-1);
        while(t1!=null && t2!=null){
            if(t1.data <= t2.data){
                Node newNode = new Node(t1.data);
                dummy.next = newNode;
                t1 = t1.next;
            }else{
                Node newNode = new Node(t2.data);
                dummy.next = newNode;
                t2 = t2.next;
            }
        }
        while(t1!=null){
                Node newNode = new Node(t1.data);
                dummy.next = newNode;
                t1 = t1.next;
        }
        while(t2!=null){
                Node newNode = new Node(t2.data);
                dummy.next = newNode;
                t2 = t2.next;
        }
        return dummy.next;
	}
	
	public static void main(String args[]) {
		int[] arr = {1,2,4};
		int[] vrr = {1,3,4};
		Node list1 = LinkedList.Convert(arr);
		Node list2 = LinkedList.Convert(vrr);
		Node head = merge(list1,list2);
		LinkedList.Traversal(head);
	}
	
}
