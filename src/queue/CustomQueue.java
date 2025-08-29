package queue;
import java.util.*;

public class CustomQueue {
	private List<Integer> queue;
	CustomQueue(){
		queue = new ArrayList();
	}
	public void pushFront(int val) {
        queue.add(0,val);
    }
    
    public void pushMiddle(int val) {
        queue.add(queue.size()/2,val);
    }
    
    public void pushBack(int val) {
        queue.add(val);
    }
    
    public int popFront() {
        if(queue.size() == 0) return -1;
        int val = queue.get(0);
        queue.remove(0);
        return val;
    }
    
    public int popMiddle() {
        if(queue.size() == 0) return -1;
        int val = queue.get(queue.size()/2);
        queue.remove(queue.size()/2);
        return val;
    }
    
    public int popBack() {
        if(queue.size() == 0) return -1;
        int val = queue.get(queue.size()-1);
        queue.remove(queue.size()-1);
        return val;
    }
    public static void main(String args[]) {
    	CustomQueue q = new CustomQueue();
    	q.pushFront(1);  
    	q.pushBack(2);   
    	q.pushMiddle(3); 
    	q.pushMiddle(4); 
    	System.out.println(q.queue);
    	System.out.println(q.popFront());    
    	System.out.println(q.popMiddle());   
    	System.out.println(q.popMiddle());   
    	System.out.println(q.popBack());     
    	System.out.println(q.popFront());    
    }

}
