package com.Tree;
import java.util.*;
public class Right_side_view {
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
		int maxd = 0;
		public List<Integer> rightSideView(TreeNode root) {
			List<Integer> list  = new ArrayList<>();
			solve(root,list,1);
			return list;
		}
		private void solve(TreeNode root,List<Integer> list,int cl) {
			if(root == null) return;
			if(maxd < cl) {
				list.add(root.val);
                maxd = cl;
			}
			solve(root.right,list,cl+1);
			solve(root.left,list,cl+1);
		}
		
	}
}
