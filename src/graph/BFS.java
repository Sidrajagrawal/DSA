package graph;
import java.util.*;

public class BFS {
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
		System.out.println(bfs(1,9,map));
	}

	private static boolean bfs(int src, int des,HashMap<Integer,HashMap<Integer,Integer>> map) {
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		q.add(src);
		while(!q.isEmpty()) {
			int r = q.remove();
			if(visited.contains(r)) continue;
			
			visited.add(r);
			if(r == des) return true;
			
			for(int nbrs: map.get(r).keySet()) {
				if(!visited.contains(nbrs)) q.add(nbrs);
			}
		}
		return false;
	}
}
