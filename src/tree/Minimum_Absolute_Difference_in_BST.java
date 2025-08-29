package tree;
import java.util.*;

public class Minimum_Absolute_Difference_in_BST {
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

		public int getMinimumDifference(TreeNode root) {
		        int min = Integer.MAX_VALUE;
		        List<Integer> lst = new ArrayList<Integer>();
		        inorder(root,lst);
		        for(int i=0;i<lst.size()-1;i++) {
		        	min = Math.min( Math.abs( lst.get(i) - lst.get(i+1) ) , min );
		        }
		        return min;
		    }

		private void inorder(TreeNode root,List<Integer> lst) {
			// TODO Auto-generated method stub
			if(root == null) return;
			
			inorder(root.left,lst);
			lst.add(root.val);
			inorder(root.right,lst);
			return ;
		}
	}
}
