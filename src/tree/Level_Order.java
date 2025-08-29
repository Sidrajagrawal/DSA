package tree;

import java.util.*;

public class Level_Order {
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
		public static void solve(Queue<TreeNode> queue, List<List<Integer>> anslist) {
			if (queue.isEmpty())
				return;
			int size = queue.size();
			List<Integer> level = new ArrayList<>();
			for (int i = 0; i < size; i++) {
				TreeNode node = queue.poll();
				level.add(node.val);

				if (node.left != null)
					queue.offer(node.left);
				if (node.right != null)
					queue.offer(node.right);
			}
			anslist.add(level);
			solve(queue, anslist);
		}

		public List<List<Integer>> levelOrder(TreeNode root) {
			List<List<Integer>> ansList = new ArrayList<>();
			if (root == null)
				return ansList;
			Queue<TreeNode> queue = new LinkedList<>();
			queue.offer(root);
			solve(queue, ansList);
			return ansList;
		}
	}
}
