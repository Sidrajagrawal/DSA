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
			List<Integer> lst1 = new ArrayList<>();
			List<Integer> lst2 = new ArrayList<>();
			List<Integer> ans = new ArrayList<>();
			inorder(root1,lst1);
			inorder(root2,lst2);
			int i=0,j=0;
			while(i<lst1.size() && j<lst2.size()) {
				if(lst1.get(i) < lst2.get(j)) {
					ans.add(lst1.get(i++));
				}else{
					ans.add(lst2.get(j++));
				}
			}
			for(int k = i;k<lst1.size();k++) {
				ans.add(lst1.get(k));
			}
			for(int k = j;k<lst2.size();k++) {
				ans.add(lst2.get(k));
			}
			return ans;
		}

		private void inorder(TreeNode root,List<Integer> lst) {
			// TODO Auto-generated method stub
			if(root == null) return ;
			
			inorder(root.left,lst);
			lst.add(root.val);
			inorder(root.right,lst);
		}
	}
}
