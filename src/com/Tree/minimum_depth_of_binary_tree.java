package com.Tree;
import java.util.*;

public class minimum_depth_of_binary_tree {

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
				if(root == null) return 0;
				int lh = ht(root.left);
				int rh = ht(root.right);
				return Math.max(lh, rh)+1;
			}
			public int maxDepth(TreeNode root) {
				return ht(root);
			}
	}

}
