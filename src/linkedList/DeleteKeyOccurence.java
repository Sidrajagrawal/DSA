package linkedList;

import linkedList.DLL.Node;

public class DeleteKeyOccurence {
	public static void main(String[] args) {
		int[] arr = {10,4,10,10,6,10};
		Node head = DLL.convert2DLL(arr);
		int key = 10;
		
		Node temp=head;
		while(temp!=null) {
			if(temp.data == key) {
				if(temp == head) {
					head = temp.next;
				}
				
				Node front = temp.next;
				Node prev = temp.back;
				if(front!=null) front.back = prev;
				if(prev!=null) prev.next = front;
				
				temp = temp.next;
			}else {
				temp = temp.next;	
			}
		}
		DLL.print(head);
		
	}
}
