package com.Tree;
import java.util.*;

public class Tree {
	static Scanner sc = null;
	
	static class TreeNode{
		int data;
		TreeNode right;
		TreeNode left;
		
		public TreeNode(int val) {
			this.data = val;
			
		}
		
	}
	
	
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		TreeNode root = createTree();
	}


	private static TreeNode createTree() {
		TreeNode root = null;
		System.out.println("Enter data: ");
		int data  = sc.nextInt();
		if(data == -1)  return null;
		root = new TreeNode(data);
		System.out.println("Enter left for "+data);
		root.left = createTree();
		System.out.println("Enter left for "+data);
		root.right = createTree();
		return root;
		
	}
	
}
