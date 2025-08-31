package backtracking;
import java.util.*;

public class Rat_Chases_its_cheese {
	
	static boolean val = false;
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] maze = new char[n][m];
        int[][] ans = new int[n][m];

        for(int i=0; i<n; i++) {
            String s = sc.next();
            for(int j=0; j<m; j++) {
                maze[i][j] = s.charAt(j);
            }
        }

        MazePath(maze,0,0,ans);
        if(val == false) {
        	System.out.println("NO PATH FOUND");
        }
    }

    private static void MazePath(char[][] maze,int cr, int cc,int[][] ans) {
        if(cr < 0 || cc < 0 || cc >= maze[0].length || cr >= maze.length || maze[cr][cc] == 'X') {
            return;
        }
        if(cr == maze.length-1 && cc == maze[0].length-1) { 
        	ans[cr][cc] = 1;
        	val = true;
        	Display(ans);
        }

        maze[cr][cc] = 'X'; // mark visited
        ans[cr][cc] = 1;

        MazePath(maze,cr-1,cc,ans); // up
        MazePath(maze,cr,cc-1,ans); // left
        MazePath(maze,cr+1,cc,ans); // down
        MazePath(maze,cr,cc+1,ans); // right

        maze[cr][cc] = 'O'; 
        ans[cr][cc] = 0;
    }

    private static void Display(int[][] ans) {
        for(int i=0;i<ans.length;i++) {
            for(int j=0;j<ans[0].length;j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
