package graph;

import java.util.*;

// 1. remove from queue
// 2. ignore if already visited
// 3. mark visited, add in the visited Data structure
// 4. self work
// 5. add unvisited neighbor

//Tc: O(V+E) [V: vertex E: Edge]

public class BFS {
	// Implementation of graph
	private HashMap<Integer, HashMap<Integer, Integer>> map;
	public BFS(int v) {
		map = new HashMap<>();
		for(int i = 1; i<=v; i++) {
			map.put(i, new HashMap<>());
		}
	}
	
	public void addEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}
	
	// Implementation of BFS 
	public boolean bfs(int src, int des) {
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		q.add(src);
		while(!q.isEmpty()) {
			// 1. remove from queue
			int r = q.poll();
			// 2. ignore if already visited
			if(visited.contains(r)) {
				continue;
			}
			// 3. mark visited, add in the visited Data structure
			visited.add(r);
			// 4. self work
			if(r == des) {
				return true;
			}
			// 5. add unvisited neighbor
			for(int nbrs : map.get(r).keySet()) {
				if(!visited.contains(nbrs)) {
					q.add(nbrs);
				}
			}
		}
		return false;
	}
}