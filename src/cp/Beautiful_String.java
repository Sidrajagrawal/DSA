package cp;

import java.util.*;

public class Beautiful_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            if (isPalindrome(s)) {
                System.out.println(0);
                continue;
            }
            boolean found = false;
            for (int i = 0; i < n - 1; i++) {
                if (s.charAt(i) == '0' && s.charAt(i + 1) == '1') {
                    String x = s.substring(0, i) + s.substring(i + 2);
                    if (isPalindrome(x)) {
                        System.out.println(2);
                        System.out.println((i + 1) + " " + (i + 2));
                        found = true;
                        break;
                    }
                }
            }

            if (found) continue;
            if (isAscending(s)) {
                System.out.println(n);
                for (int i = 1; i <= n; i++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }

        sc.close();
    }

    public static boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }

    public static boolean isAscending(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) > s.charAt(i)) return false;
        }
        return true;
    }
}
