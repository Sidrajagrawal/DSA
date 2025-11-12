package graph;
import java.util.*;

public class Dijkstra_Algo {

	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public void Dijkstra(int v) {
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());

		}

	}

	public void addEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	class DijikstraPair {
		int vtx;
		String acqpath;
		int cost;

		public DijikstraPair(int vtx, String acqpath, int cost) {
			this.vtx = vtx;
			this.acqpath = acqpath;
			this.cost = cost;
		}
	}

	public void Dijkstra() {
		PriorityQueue<DijikstraPair> pq = new PriorityQueue<>();
		pq.add(new DijikstraPair(1, "1", 0));
		HashSet<Integer> visited = new HashSet<>();
		while (!pq.isEmpty()) {
			// 1. remove
			DijikstraPair rp = pq.poll();
			// 2. Ignore if already visited
			if (visited.contains(rp.vtx)) {
				continue;
			}
			// 3. Add to visite
			visited.add(rp.vtx);
			// 4. Self work
			System.out.println(rp);
			// 5. Add nbrs
			for (int nbrs : map.get(rp.vtx).keySet()) {
				if (!visited.contains(nbrs)) {
					int cost = map.get(rp.vtx).get(nbrs);
					pq.add(new DijikstraPair(nbrs, rp.acqpath + nbrs, rp.cost + cost));
				}
			}

		}
	}
}