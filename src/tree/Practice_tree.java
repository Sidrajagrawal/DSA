package tree;

import java.util.*;

public class Practice_tree {
	class Node {
		int data;
		Node left, right;

		public Node(int d) {
			data = d;
			left = right = null;
		}
	}

	class Solution {
		static class VerticalPair {
			Node node;
			int r;
			int c;

			public VerticalPair(Node node, int r, int c) {
				this.node = node;
				this.r = r;
				this.c = c;
			}
		}

		static ArrayList<ArrayList<Integer>> verticalOrder(Node root) {
			// add your code here
			ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
			Queue<VerticalPair> q = new LinkedList<>();
			TreeMap<Integer,ArrayList<Integer>> map = new TreeMap<>();
			
			if (root == null) {
				return ans;
			}
			VerticalPair nn = new VerticalPair(root,0,0);
			q.offer(nn);
			
			while(!q.isEmpty()) {
				VerticalPair rv = q.poll();
				
				if(!map.containsKey(rv.c)) {
					map.put(rv.c,new ArrayList<Integer>());
				}
				map.get(rv.c).add(rv.node.data);
				if(rv.node.left != null) {
					VerticalPair newNode = new VerticalPair(rv.node.left,rv.r+1,rv.c-1);
					q.offer(newNode);
				}if(rv.node.right != null) {
					VerticalPair newNode = new VerticalPair(rv.node.right,rv.r+1,rv.c+1);
					q.offer(newNode);
				}
			}
			
			ans.addAll(map.values());
			return ans;
			
		}
	}

}