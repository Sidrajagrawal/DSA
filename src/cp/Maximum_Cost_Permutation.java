package cp;

import java.util.*;

public class Maximum_Cost_Permutation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            boolean[] present = new boolean[n + 1];

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x != 0) present[x] = true;
            }

            int minMissing = Integer.MAX_VALUE;
            int maxMissing = Integer.MIN_VALUE;

            for (int i = 1; i <= n; i++) {
                if (!present[i]) {
                    minMissing = Math.min(minMissing, i);
                    maxMissing = Math.max(maxMissing, i);
                }
            }

            if (minMissing == Integer.MAX_VALUE) {
                // Already a permutation
                System.out.println(0);
            } else {
                System.out.println(maxMissing - minMissing + 1);
            }
        }
        sc.close();
    }
}
