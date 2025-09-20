package cp;

import java.util.*;
public class Shortest_Increasing_Path {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0){
            long x = sc.nextLong();
            long y = sc.nextLong();
            if (y > x){
                System.out.println(2);
            }else if (x == y){
                System.out.println(-1);
            }else{ 
                if (y >= 2 && x - y >= 2){
                    System.out.println(3);
                } else {
                    System.out.println(-1);
                }
            }
        }
    }
}
