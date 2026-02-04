package Trie;

import java.util.*;


public class Tries_contact {
	private Node root;
	public Tries_contact() {
		root = new Node('*');
        
    }
	
	class Node{
		char ch;
		boolean isterminal;
		int count;
		HashMap<Character, Node> child;
		public Node(char ch) {
			this.ch = ch;
			count = 1;
			child = new HashMap<>();
		}
	}
	
    public void insert(String word) {
    	Node curr = root;
        for(int i=0; i<word.length(); i++) {
        	char ch = word.charAt(i);
        	if(curr.child.containsKey(ch)) {
        		curr = curr.child.get(ch);
        		curr.count=curr.count+1;
        	}else {
        		Node nn = new Node(ch);
        		curr.child.put(ch, nn);
        		curr = nn;
        	}
        }
        curr.isterminal = true;
    }
    
    public int find(String prefix) {
    	Node curr = root;
    	for(int i=0; i<prefix.length(); i++) {
    		char ch = prefix.charAt(i);
    		if(curr.child.containsKey(ch)) {
    			curr = curr.child.get(ch);
    		}else {
    			return 0;
    		}
    	}
    	return curr.count;
    }

}
