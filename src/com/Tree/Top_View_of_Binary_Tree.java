package com.Tree;

import java.util.*;

public class Top_View_of_Binary_Tree {

	public class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		TreeNode(int val) {
			data = val;
			left = null;
			right = null;
		}
	}

	class Solution {
		class NodePair {
			TreeNode node;
			int curr;

			public NodePair(TreeNode node, int curr) {
				this.node = node;
				this.curr = curr;
			}
		}

		public List<Integer> topView(TreeNode root) {
			List<Integer> ans = new ArrayList<>();
			if (root == null)
				return ans;

			Queue<NodePair> q = new LinkedList<>();
			Map<Integer, Integer> map = new TreeMap<>();

			q.offer(new NodePair(root, 0));

			while (!q.isEmpty()) {
				NodePair rv = q.poll();

				if (!map.containsKey(rv.curr)) {
					map.put(rv.curr, rv.node.data);
				}

				if (rv.node.left != null) {
					q.offer(new NodePair(rv.node.left, rv.curr - 1));
				}
				if (rv.node.right != null) {
					q.offer(new NodePair(rv.node.right, rv.curr + 1));
				}
			}

			ans.addAll(map.values());
			return ans;
		}
	}
}
