package graph;

import java.util.*;

public class DFS {

	public static void main(String[] args) {
		// Making Graph
		Graph g = new Graph(7);
		g.AddEdge(1, 4, 2);
		g.AddEdge(1, 2, 5);
		g.AddEdge(3, 2, 7);
		g.AddEdge(3, 4, -1);
		g.AddEdge(5, 4, 3);
		g.AddEdge(5, 6, 7);
		g.AddEdge(5, 7, 8);
		g.AddEdge(7, 6, 4);
		HashMap<Integer,HashMap<Integer,Integer>> map = g.dataStructure();
		System.out.println(dfs(1,6,map));
	}

	private static boolean dfs(int src, int des, HashMap<Integer, HashMap<Integer, Integer>> map) {
		Stack<Integer> s = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();
		s.push(src);
		while(!s.isEmpty()) {
			//Remove
			int r = s.pop();
			//Ignore
			if(visited.contains(r)) continue;
			//Marks as visited
			visited.add(r);
			//Self word
			if(r == des) return true;
			//Add Unvisited nbrs
			for(int nbrs: map.get(r).keySet()) {
				if(!visited.contains(nbrs)) s.push(nbrs);
			}
		}
		return false;
	}
	
}
