package com.LinkedList;

public class DLL {

    static class Node {
        int data;
        Node next;
        Node back;

        protected Node(int data) {
            this.data = data;
        }

        protected Node(int data, Node next, Node back) {
            this.data = data;
            this.next = next;
            this.back = back;
        }
    }

    public static Node convert2DLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            temp.next = newNode;
            newNode.back = temp;
            temp = newNode;
        }
        return head;
    }
    
    static Node getTail(Node head){
    	
    	if(head == null) return head;
    	
    	Node mover = head;
    	while(mover.next != null) {
    		mover = mover.next;
    	}
    	return mover;
    }
    
    static void print(Node node) {
    	if(node == null) {
    		return;
    	}
    	Node mover = node;
    	if(mover.back == null) {
    		while(mover.next != null) {
    			System.out.print(mover.data+" <-> ");
    			mover = mover.next;
    		}
    		System.out.print(mover.data);
    	}else {
    		while(mover.back != null) {
    			System.out.print(mover.data+" <-> ");
    			mover = mover.back;
    		}
    		System.out.print(mover.data);
    	}
    }
    	
    	
    
    static void printRev(Node node) {
    	if(node == null) return;
    	
    	Node mover = node;
    	
    	if(node.back == null) {
    		while(mover.next != null) {
    			mover = mover.next;
    		}
    		while(mover.back!=null) {
    			System.out.print(mover.data+"->");
    			mover = mover.back;
    		}
    		System.out.print(mover.data);
    	}else {
    		while(mover.back!=null) {
    			mover = mover.back;
    		}
    		while(mover.next != null) {
    			System.out.print(mover.data+"->");
    			mover = mover.next;
    		}
    		System.out.print(mover.data);
    	}
    	
    }
    
    static Node HeadDeletion(Node head) {
    	if(head == null || head.next == null) return null;
    	
    	Node temp = head;
    	head = head.next;
    	head.back = null;
    	temp.next = null;
    	return head;
    }
    
    static Node TailDeletion(Node head) {
    	if(head == null || head.next == null) return null;
    	
    	Node mover = head;
    	while(mover.next != null) {
    		mover=mover.next;
    	}
    	mover.back.next = null;
    	mover.back = null; 
    	return head;
    }
    
    static Node removek(Node head,int k) {
    	if(head == null) return head;
    	
    	Node temp = head;
    	int c=0;
    	while(temp!=null) {
    		c++;
    		if(c == k) {
    			break;
    		}
    		temp = temp.next;
    	}
    	Node prev=temp.back;
    	Node front = temp.next;
    	if(prev == null && front==null) {
    		temp = null;
    		return null;
    	}else if(prev == null) {
    		return HeadDeletion(temp);
    	}else if(front == null) {
    		return TailDeletion(temp);
    	}else {
    		prev.next = front;
    		front.back = prev;
    		temp.next = null;
    		temp.back = null;
    		return head;
    	}
    }
    
    static Node insertHead(Node head,int val) {
    	if(head == null) return head;
    	
    	Node newHead = new Node(val,head,null);
    	head.back = newHead;
    	return newHead;
    }
    
    static Node insertBeforeTail(Node head, int val) {
    	if(head == null) return head;
    	
    	Node temp = head;
    	
    	while(temp.next!=null) {
    		temp = temp.next;
    		
    	}
    	Node prev = temp.back;
    	Node newNode = new Node(val,temp,prev);
    	prev.next = newNode;
    	temp.back = newNode;
    	return head;
    }
    
    static Node insertK(Node head,int k,int val) {
    	if(head == null) return head;
    	if(k==1) {
    		return insertHead(head,val);
    	}
    	Node mover=head;
    	int c=0;
    	while(mover!=null) {
    		c++;
    		if(c==k) {
    			break;
    		}
    		mover = mover.next;
    	}
    	if(mover == null) {
    		return head;
    	}
    	Node prev = mover.back;
    	Node newNode = new Node(val,mover,prev);
    	mover.back = newNode;
    	prev.next = newNode;
    	return head;
    }
    
    static Node Reverse(Node head) {
    	if(head == null || head.next == null) return head;
    	
    	Node mover = head;
    	Node temp = null;
    	while(mover!=null) {
    		temp = mover.back;
    		mover.back = mover.next;
    		mover.next=temp;
    		mover = mover.back;
    	}
    	return temp.back;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30,40,50};
        Node head = convert2DLL(arr);
//        Node tail = getTail(head);
        
//        print(head);
//        print(tail);
//        printRev(head);
//        printRev(tail);
        
//        head = HeadDeletion(head);
//        head = TailDeletion(head);
//        head = removek(head,5);
        
//        head = insertHead(head,5);
//        head = insertBeforeTail(head,45);
//        head = insertK(head,6,45);
        
//        head = Reverse(head);

    }
}
