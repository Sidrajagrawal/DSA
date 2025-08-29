package tree;

public class Merge_Two_Binary_Trees {
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
		public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
			if(t1 == null )return t2;
			if(t2 == null )return t1;
			TreeNode nn = new TreeNode(t1.val + t2.val);
			nn.left = mergeTrees(t1.left,t2.left);
			nn.right = mergeTrees(t1.right,t2.right);
			return nn;
		}
	}
}
