package linkedList;

import java.util.*;

import linkedList.DLL.Node;

public class SumOfPair {
	
	public static List<List<Integer>> Method1(Node head){
		Node t1 = head;
		int sum = 5;
		
		List<List<Integer>> list = new ArrayList<>();
		
		while(t1!=null && t1.data <= sum) {
			Node t2 = t1.next;
			while(t2 != null && t1.data + t2.data <= sum) {
				if(t1.data + t2.data == sum) {
					ArrayList<Integer> l  = new ArrayList<>();
					l.add(t1.data);
					l.add(t2.data);
					list.add(l);
				}
				t2 = t2.next;
				
			}
			t1 = t1.next;
		}
		return list;

	}
	
	public static List<List<Integer>> Method2 (Node head){
		Node left = head;
		Node temp = head;
		int sum = 5;
		while(temp.next!=null) {
			temp = temp.next;
		}
		Node right = temp;
		List<List<Integer>> list = new ArrayList<>();
		while(left.data < right.data) {
			if(left.data + right.data == sum) {
				ArrayList<Integer> l  = new ArrayList<>();
				l.add(left.data);
				l.add(right.data);
				list.add(l);
				left = left.next;
				right = right.back;
			}else if(left.data + right.data < sum) {
				left = left.next;
			}else {
				right = right.back;
			}
		}
		return list;
	}
	
	public static void main(String args[]) {
		int[] arr = {1,2,3,4,9};
		Node head = DLL.convert2DLL(arr);
		System.out.print(Method2(head));
	}
}
