package com.Tree;

public class Sum_of_Left_Leaves {
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
		public int sumOfLeftLeaves(TreeNode root) {
			return LeftLeaves(root,false);
		}

		private int LeftLeaves(TreeNode root , boolean flag) {
			// TODO Auto-generated method stub
			if(root == null) return 0;
			if(root.left == null && root.right == null && flag) {
				return  root.left.val;
			}
			int ll = LeftLeaves(root.left,true);
			int rl = LeftLeaves(root.right,false);
			int sum = ll+rl;
			return sum;
		}
	}
}
