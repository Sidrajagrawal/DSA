package stack;
import java.util.*;

class Pair {
    int x, y;

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class MinStack {

    Stack<Pair> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int ele) {
        int min;
        if (stack.isEmpty()) {
            min = ele;
        } else {
            min = Math.min(ele, stack.peek().y);
        }
        stack.push(new Pair(ele, min));
    }

    public int pop() {
        return stack.pop().x;
    }

    public int top() {
        return stack.peek().x;
    }

    public int getMin() {
        return stack.peek().y;
    }

    public static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.push(5);
        ms.push(3);
        ms.push(7);
        ms.push(2);
        
        System.out.println("Top: " + ms.top());     
        System.out.println("Min: " + ms.getMin());  
        System.out.println("Popped: " + ms.pop());
        System.out.println("Top: " + ms.top());     
        System.out.println("Min: " + ms.getMin());  
    }
}
