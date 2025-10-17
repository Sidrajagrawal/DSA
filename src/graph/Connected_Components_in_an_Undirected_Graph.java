package graph;
import java.util.*;

public class Connected_Components_in_an_Undirected_Graph {

	class Solution {
		public ArrayList<ArrayList<Integer>> getComponents(int V, int[][] edges) {
			// code here
			HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
			for (int i = 0; i < V - 1; i++) {
				map.put(i, new ArrayList<>());
			}
			for (int i = 0; i < edges.length; i++) {
				int v1 = edges[i][0];
				int v2 = edges[i][1];
				map.get(v1).add(v2);
				map.get(v2).add(v1);
			}
			Queue<Integer> q = new LinkedList<>();
			HashSet<Integer> visited = new HashSet<>();
			ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
			for (int vrtx : map.keySet()) {
				if (visited.contains(vrtx))
					continue;
				ArrayList<Integer> lst = new ArrayList<>();
				q.add(vrtx);
				while (!q.isEmpty()) {
					// Remove
					int rv = q.poll();
					// Ignore
					if (visited.contains(rv))
						continue;
					// Mark as visited
					visited.add(rv);
					// Self work
					lst.add(rv);
					// Add unvisited nbrs
					for (int nbrs : map.get(rv)) {
						if (!visited.contains(nbrs))
							q.add(nbrs);
					}
				}
				ans.add(lst);
			}
			return ans;

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
