package stack;
import java.util.*;

class Stack{
	
	private int[] arr;
	private int capacity;
	private int top;
	
	public Stack(){
		this.capacity = 10;
		this.top = -1;
		this.arr = new int[capacity];
	}
	
	private int[] Increase_Capacity(int[] arr, int capacity) {
		int[] temp = new int[2*capacity];
		for(int i=0; i<arr.length; i++) {
			temp[i] = arr[i];
		}
		return temp;
	}
	
	public void push(int x) {
		if(top == capacity/2){
			arr = Increase_Capacity(arr,capacity);
		}
		arr[++top] = x;
	}
	
	public int pop(){
		if(top == -1) {
			return -1;
		}
		return arr[top--];
	}
	
	public boolean isEmpty(){
		if(top == -1) return true;
		
		return false;
	}
	
	public int size() {
		return top;
	}
	public void Display() {
		System.out.print("[ ");
		for(int i=0;i<=top;i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.print("]");
	}
}

public class PracticeStack {	
	
	public static void main(String args[]) {		
		Stack stack = new Stack();
		stack.push(10);
		stack.push(11);
		stack.push(12);
		stack.push(13);
		stack.Display();
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
		stack.push(11);
		stack.push(12);
		stack.push(13);
		stack.Display();
		System.out.println(stack.isEmpty());
	}
}