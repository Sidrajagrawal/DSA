package graph;

import java.util.*;
public class PrimsAlgo {
    private HashMap<Integer, HashMap<Integer, Integer>> map;

    public PrimsAlgo(int v) {
        map = new HashMap<>();
        for(int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void AddEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    class PrimsPair {
        int vertex;
        int acq_vtx;
        int cost;

        public PrimsPair(int vtx, int acq_vtx, int cost) {
            this.vertex = vtx;
            this.acq_vtx = acq_vtx;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return vertex + "" + acq_vtx + " @ " + cost;
        }
    }

    public void PrimsAlgorithm() {
        PriorityQueue<PrimsPair> pq = new PriorityQueue<>((a,b) -> a.cost - b.cost);
        HashSet<Integer> visited = new HashSet<>();
        pq.add(new PrimsPair(1, 1, 0));
        int totalCost = 0;

        while(!pq.isEmpty()) {
            // 1. remove
            PrimsPair rp = pq.poll();
            
            // 2. ignore if already visited
            if(visited.contains(rp.vertex)) {
                continue;
            }
            
            // 3. marked visited
            visited.add(rp.vertex);
            
            // 4. self work
            System.out.println(rp);
            totalCost += rp.cost;
            
            // 5. add neighbours
            for(int neighbour : map.get(rp.vertex).keySet()) {
                if(!visited.contains(neighbour)) {
                    int cost = map.get(rp.vertex).get(neighbour);
                    pq.add(new PrimsPair(neighbour, rp.vertex, cost));
                }
            }
        }
        System.out.println("Total MST Cost: " + totalCost);
    }

    public static void main(String[] args) {
        PrimsAlgo pq = new PrimsAlgo(7);
        pq.AddEdge(1, 2, 5);
        pq.AddEdge(1, 4, 2);
        pq.AddEdge(3, 2, 3);
        pq.AddEdge(3, 4, 1);
        pq.AddEdge(5, 4, 6);
        pq.AddEdge(5, 6, 2);
        pq.AddEdge(5, 7, 4);
        pq.AddEdge(7, 6, 8);
        pq.PrimsAlgorithm();
    }
}