package tree;

import java.util.*;

public class BinarySearchTree {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		public TreeNode(int val) {
			this.val = val;
		}
	}

	private TreeNode root;

	public BinarySearchTree(int[] arr) {
		root = CreateTree(arr, 0, arr.length - 1);
	}

	private TreeNode CreateTree(int[] arr, int si, int ei) {
		if(si>ei) return null;
		int mid = (si+ei)/2;
		TreeNode nn = new TreeNode(arr[mid]);
		nn.left = CreateTree(arr,si,mid-1);
		nn.right = CreateTree(arr,mid+1,ei);
		return nn;
	}

	public static void main(String args[]) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80 };
		BinarySearchTree bst = new BinarySearchTree(arr);
	}
}
