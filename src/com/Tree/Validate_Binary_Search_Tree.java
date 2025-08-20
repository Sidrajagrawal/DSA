package com.Tree;

public class Validate_Binary_Search_Tree {
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
		public boolean isValidBST(TreeNode root) {
			return ValidBST(root).isbst;
		}
		public BstPair ValidBST(TreeNode root) {
			if(root == null) {
				return new BstPair();
			}
			BstPair ldp = ValidBST(root.left);
			BstPair rdp = ValidBST(root.right);
			BstPair sdp = new BstPair();
			sdp.max = Math.max(ldp.max,Math.max(rdp.max,root.val));
			sdp.min = Math.min(ldp.min,Math.min(rdp.min,root.val));
			sdp.isbst = ldp.isbst && rdp.isbst && ldp.max < root.val && root.val < rdp.min;
			return sdp;
		}
		
		class BstPair{
			long min = Long.MAX_VALUE;
			long max = Long.MIN_VALUE;
			boolean isbst = true;
		}
		
	}
}
