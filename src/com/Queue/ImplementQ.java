package com.Queue;

class QueueArray{
	private int arr[];
	private int start,end,currsize,maxsize;
	
	public QueueArray(){
		this.maxsize = 16;
		this.arr = new int[16];
		this.start = -1;
		this.end = -1;
		this.currsize = 0;
	}
	public QueueArray(int maxsize) {
		this.maxsize = maxsize;
		this.arr = new int[this.maxsize];
		this.start = -1;
		this.end = -1;
		this.currsize = 0;
	}
	public void push(int x) {
		if(currsize == maxsize) {
			System.out.println(currsize);
			System.out.println(maxsize);
			System.out.println("Queue is full\nExiting...");
            System.exit(1);
		}
		if(end == -1) {
			start = 0;
			end = 0;
		}else {
			end = (end+1)%maxsize;
		}
		arr[end] = x;
		System.out.println("The element pushed is " + x);
		currsize++;
		
	}
	
	public int pop() {
		if(start == -1) {
			System.out.println("Queue Empty\nExiting...");
            System.exit(1);
		}
		int x = arr[start];
		if(currsize == 1) {
			start = -1;
			end=-1;
		}else {
			start = (start+1)%maxsize;
		}
		currsize--;
		return x;
	}
	
	public int top() {
		if(start == -1) {
			 System.out.println("Queue is Empty");
	         System.exit(1);
		}
		return arr[start];	
	}
	 public int size() {
	        return currsize;
	    }
	
}

class QueueLinkedList{

	static class StackNode {
		int data;
		StackNode next;

		protected StackNode(int data) {
			this.data = data;
		}

		protected StackNode(int data, StackNode next) {
			this.data = data;
			this.next = next;
		}
	}
}



public class ImplementQ {
	public static void main(String[] agrs) {
		QueueArray q = new QueueArray(16);
		
		
	}
}
