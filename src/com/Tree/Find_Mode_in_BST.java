package com.Tree;

import java.util.*;

public class Find_Mode_in_BST {
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
	    List<Integer> ans;
	    int prev = Integer.MIN_VALUE;
		int mf = 1;
		int temp = 0;
	    public int[] findMode(TreeNode root) {
	    	ans = new ArrayList<>();
	    	inorder(root);
	    	int[] res = new int[ans.size()];
	    	for(int i=0;i<res.length;i++) {
	    		res[i] = ans.get(i);
	    	}
	    	return res;
		}

		private void inorder(TreeNode root) {
			if(root == null) return;
			inorder(root.left);
			if(root.val == prev) {
				temp++;
			}else {
				temp=1;
				prev=root.val;
			}
			if(temp>mf) {
				ans.clear();
				ans.add(root.val);
				mf = temp;
			}else if(temp == mf) {
				ans.add(root.val);
			}
			inorder(root.right);
		}
	}
}
