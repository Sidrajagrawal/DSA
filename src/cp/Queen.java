package cp;

import java.util.*;

public class Queen {
	static Scanner sc = new Scanner(System.in);
	static int root = -1;
	public static void BuildTree(int n, HashMap<Integer, HashMap<Integer, Integer>> map) {
		for (int i = 1; i <= n; i++) {
			int val = sc.nextInt();
			int res = sc.nextInt();
			if (val == -1) {
				root = i;
				continue;	
			}
			map.get(val).put(i, res);
		}
	}

	public static void main(String[] args) {
		int n = sc.nextInt();
		HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
		for (int i = 1; i <= n; i++) {
			map.put(i, new HashMap<Integer, Integer>());
		}
		BuildTree(n, map);
		List<Integer> st = new ArrayList<>();
		dfs(root,map,0,st);
		if(st.isEmpty()) System.out.print(-1);
		Collections.sort(st);
        for(int ele: st){
            System.out.print(ele+" ");
        }
	}
	public static void dfs(int nn , HashMap<Integer, HashMap<Integer, Integer>> map, int res, List<Integer> st) {
		boolean ans = res == 1;
		for(int nbrs: map.get(nn).keySet()) {
			dfs(nbrs,map,map.get(nn).get(nbrs),st);
			if(map.get(nn).get(nbrs) == 0) ans = false;
		}
		if(ans)
			st.add(nn);
	}

}