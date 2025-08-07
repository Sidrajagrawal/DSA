package com.Queue;
import java.util.*;

public class BasicOperations {
	public static void main(String args[]) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
	}
}
