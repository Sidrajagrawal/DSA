package com.Tree;

public class Practice_tree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		static int ht(TreeNode root) {
			if(root == null ) return -1;
			
			int lh = ht(root.left);
			int rh = ht(root.left);
			return Math.max(lh, rh)+1;
		}
		
		public int diameterOfBinaryTree(TreeNode root) {
			return diameter(root);
		}
		static int diameter(TreeNode root) {
			if(root == null) return 0;
			int ld = diameter(root.left);
			int rd = diameter(root.left);
			int sd = ht(root.left) + ht(root.right )+2;
			return Math.max(sd,Math.max(rd, ld));
		}
	}
}