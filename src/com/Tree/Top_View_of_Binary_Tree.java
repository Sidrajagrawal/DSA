package com.Tree;
import java.util.*;

public class Top_View_of_Binary_Tree {
	class Node{
	    int data;
	    Node left;
	    Node right;
	    Node(int data){
	        this.data = data;
	        left=null;
	        right=null;
	    }
	}

	class Solution {
	    static ArrayList<Integer> topView(Node root) {
	        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
	        ArrayList<Integer> ans = new ArrayList<>();
	        inorder(root,map,0);
	        for(Integer k:map.keySet()) {
	        	ans.add(map.get(k));
	        }
	        return ans;
	    }

		private static void inorder(Node root, LinkedHashMap<Integer,Integer> map,int curr) {
			// TODO Auto-generated method stub
			if(root == null) {
				return;
			}
			inorder(root.left,map,curr-1);
			inorder(root.right,map,curr+1);
		}
	}
}
