package cp;

import java.util.*;

public class Game_on_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			HashMap<Integer, Integer> map = new HashMap<>();
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
				if (!map.containsKey(arr[i])) {
					map.put(arr[i], 1);
				} else {
					int val = map.get(arr[i]);
					map.put(arr[i], val + 1);
				}
			}

			int turn = 1;
			int i = arr.length;
			int ac = 0, bc = 0;
			while (true) {
				int val = choose(map);
				if(val == 0) break;
				// Alice
				if (turn % 2 != 0) {
					ac = ac + val;
				}
				// Bob
				else {
					bc = bc + val;
				}
				turn++;
			}
			System.out.println(ac+" "+bc);
		}

	}

	private static int choose(HashMap<Integer, Integer> map) {
		// TODO Auto-generated method stub
		int max = 0;
		int kmax = 0;
		for (int key : map.keySet()) {
			int val = map.get(key);
			if (val > max && key!=0) {
				max = val;
				kmax = key;
			}
		}
		map.put(kmax-1, max);
		map.remove(kmax);
		return max;
	}

}
