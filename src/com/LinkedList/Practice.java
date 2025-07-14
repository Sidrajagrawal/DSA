package com.LinkedList;
import com.LinkedList.LinkedList.Node;
import java.util.*;

public class Practice {

    public static void main(String args[]) {
        int[] arr = {1,2,3,4,5};
        Node head = LinkedList.Convert(arr);

        int left = 3, right = 4;
        
        Node dummy = new Node(-501);
        dummy.next = head;
        Node mover = dummy;
        for(int i=1;i<left;i++) {
        	mover = mover.next;
        }
        System.out.println(mover.data);
        Node curr = mover.next;
        Node temp = curr;
        Node prev = null;
        for(int i=1;i<right;i++) {
        	Node front = curr.next;
        	curr.next = prev;
        	prev = curr;
        	curr = front;
        }
        System.out.println(curr.data);
        mover.next = prev;
        temp.next = curr;
        LinkedList.Traversal(head);
    }
}
