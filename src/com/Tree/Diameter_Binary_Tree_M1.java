package com.Tree;

public class Diameter_Binary_Tree_M1 {
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

	public static int height(TreeNode root) {
		if (root == null) {
			return -1;
		}
		int lh = height(root.left);
		int rh = height(root.right);
		return Math.max(rh, lh) + 1;
	}

	public static int diameter(TreeNode root) {
		return findDiameter(root);
	}

	private static int findDiameter(TreeNode root) {
		// TODO Auto-generated method stub
		if (root == null) {
			return 0;
		}
		int ld = findDiameter(root.left);
		int rd = findDiameter(root.right);
		int sd = height(root.left) + height(root.right) + 2;
		return Math.max(sd, Math.max(rd, ld));
	}
}
