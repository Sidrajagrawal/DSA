package stack;

class stackArray{
	int size = 100;
	int[] arr = new int[size];
	int top=-1;
	
	void push(int x) {
		top++;
		arr[top] = x;
	}
	
	int pop() {
		if(top < 0) {
			System.out.println("Stack is Empty.");
			return -1;
		}
		if(top>size) {
			System.out.println("Stack is Overflow.");
			return size;	
		}
		int x = arr[top];
		top--;
		return x;
	}
	
	int top() {
		if(top < 0) {
			System.out.println("Stack is Empty None to see.");
			return -1;
		}
		if(top>size) {
			System.out.println("Stack is Overflow None to see.");
			return size;	
		}
		int x = arr[top];
		return x;
	}
	
	int size() {
		return top+1;	
	}
	
}

class StackLinkedList{

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
	
	 private StackNode head; 
	 private int currSize;
	 
	 public StackLinkedList() {
	        this.head = null; 
	        this.currSize = 0;
	    }
	 public boolean isEmpty() {
	        return head == null;
	    }
	
	 public void push(int x) {
	        StackNode newNode = new StackNode(x);
	        newNode.next = head; 
	        head = newNode;      
	        currSize++;
	        System.out.println("Pushed: " + x);
	    }

	    
	    public int pop() {
	        if (isEmpty()) {
	            System.out.println("Stack is Empty. Cannot pop.");
	            return -1; 
	        }
	        int poppedData = head.data; 
	        head = head.next;           
	        currSize--;
	        System.out.println("Popped: " + poppedData);
	        return poppedData;
	    }

	    public int top() {
	        if (isEmpty()) {
	            System.out.println("Stack is Empty. No element to see.");
	            return -1; 
	        }
	        return head.data;
	    }

	    public int size() {
	        return currSize;
	    }
}

public class ImplementS {	
	
	public static void main(String args[]) {
//		stackArray s = new stackArray();
		StackLinkedList sll = new StackLinkedList();
		
	}
}
