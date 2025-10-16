package graph;

import java.util.*;


public class BST {

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
		bft(map);
	}

	private static void bft(HashMap<Integer, HashMap<Integer, Integer>> map) {
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		
		for(int vrtx: map.keySet()) {
			if(visited.contains(vrtx)) continue;
			q.add(vrtx);
			while(!q.isEmpty()) {
				//Remove
				int rv = q.poll();
				//Ignore
				if(visited.contains(rv)) continue;
				//Marked as Visited
				visited.add(rv);
				//Self work
				System.out.print(rv+ " ");
				//Add unvisited nbrs
				for(int nbrs: map.get(rv).keySet()) {
					if(!visited.contains(nbrs)) q.add(nbrs);
				}
			}
		}
	}
	

}
