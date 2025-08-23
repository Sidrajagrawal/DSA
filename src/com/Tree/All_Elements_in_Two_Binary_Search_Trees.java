package com.Tree;
import java.util.*;

public class All_Elements_in_Two_Binary_Search_Trees {
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
		public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
			List<Integer> lst = new ArrayList<>();
			inorder(root1,root2,lst);
		}

		private void inorder(TreeNode t1, TreeNode t2,List<Integer> lst) {
			// TODO Auto-generated method stub
			if(t1 == null && t2 == null) return ;
			
			if(t1 == null && t2 != null) {
				inorder(t1.left,t2,lst);
			}if(t1 != null && t2 ==null) {
				inorder(t1,t2.left,lst);
			}else{
				inorder(t1.left,t2.left,lst);
			}
			if(t1.val < t2.val) {
				lst.add(t1.val);
				lst.add(t2.val);
			}
			else {
				lst.add(t2.val);
				lst.add(t1.val);
			}
			if(t1 == null && t2 != null) {
				inorder(t1.right,t2,lst);
			}if(t1 != null && t2 ==null) {
				inorder(t1,t2.right,lst);
			}else{
				inorder(t1.right,t2.right,lst);
			}
		}
	}
}
