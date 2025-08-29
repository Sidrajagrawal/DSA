package tree;

import java.util.*;

public class Kth_Smallest_Element_in_a_BST {
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
		int c;
		int res;

		public int kthSmallest(TreeNode root, int k) {
			c = k;
			inorder(root);
			return res;
		}

		private void inorder(TreeNode root) {
			// TODO Auto-generated method stub
			if (root == null)
				return;

			inorder(root.left);
			c--;
			if (c == 0) {
				res = root.val;
				return;
			}
			inorder(root.right);
		}
	}
}
