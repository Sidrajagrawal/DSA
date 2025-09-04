package dynamic_programming;
import java.util.*;

public class Edit_Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int[][] dp = new int[s.length()][t.length()];
        for (int[] row : dp) Arrays.fill(row, -1);
        System.out.println(Min_Ops(s, t, 0, 0, dp));
    }
    public static int Min_Ops(String s, String t, int i, int j, int[][] dp) {
        if (i == s.length()) return t.length() - j; 
        if (j == t.length()) return s.length() - i; 
        if (dp[i][j] != -1) return dp[i][j];
        if (s.charAt(i) == t.charAt(j)) {
            return dp[i][j] = Min_Ops(s, t, i + 1, j + 1, dp);
        } else {
            int del = Min_Ops(s, t, i + 1, j, dp);     
            int rep = Min_Ops(s, t, i + 1, j + 1, dp); 
            int ins = Min_Ops(s, t, i, j + 1, dp);     
            return dp[i][j] = 1 + Math.min(del, Math.min(rep, ins));
        }
    }
}