package graph;

import java.util.*;

public class Dijkstra {
	private HashMap<Integer, HashMap<Integer, Integer>> map;
	public Dijkstra(int v) {
		map = new HashMap<>();
		for(int i = 1; i<=v; i++) {
			map.put(i, new HashMap<>());
		}
	}
	
	public void addEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}
	
	class DijkstraPair {
		int vtx;
		String acqpath;
		int cost;
		public DijkstraPair(int vtx, String acq_path, int cost) {
			this.vtx = vtx;
			this.acqpath = acq_path;
			this.cost = cost;
		}
		@Override
		public String toString() {
			return vtx + " " + acqpath + " @ " + cost;
		}
	}
	public void Dijkstra_algo() {
		PriorityQueue<DijkstraPair> pq = new PriorityQueue<>((a,b) -> a.cost-b.cost);
		HashSet<Integer> visited = new HashSet<>();
		pq.add(new DijkstraPair(1, "1", 0));
		while(!pq.isEmpty()) {
			// 1. remove
			DijkstraPair rp = pq.poll();
			// 2. ignore if already visited
			if(visited.contains(rp.vtx)) {
				continue;
			}
			// 3. marked visited
			visited.add(rp.vtx);
			// 4. self work
			System.out.println(rp);
			// 5. add nbrs
			for(int nbrs : map.get(rp.vtx).keySet()) {
				if(!visited.contains(nbrs)) {
					int cost = map.get(rp.vtx).get(nbrs);
					pq.add(new DijkstraPair(nbrs, rp.acqpath+nbrs, rp.cost + cost));
				}
			}
		}
	}
	public static void main(String[] args) {
		Dijkstra g = new Dijkstra(7);			
		g.addEdge(1, 4, 7);				
		g.addEdge(1, 2, 4);	
		g.addEdge(2, 3, 1);	
		g.addEdge(3, 4, 1);	
		g.addEdge(4, 5, 5);	
		g.addEdge(5, 6, 2);	
		g.addEdge(5, 7, 3);	
		g.addEdge(6, 7, 1);
		g.Dijkstra_algo();
	}
}