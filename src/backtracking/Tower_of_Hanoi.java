package backtracking;
import java.util.*;

public class Tower_of_Hanoi {
	static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		TOH(n,"1","2","3");
		System.out.println(count);
	}

	private static void TOH(int n, String src, String hlp, String des) {
		// TODO Auto-generated method stub
		if(n==0) {
			return;
		}
		
		TOH(n-1,src,des,hlp);
		System.out.println("Move "+n+" th disk from "+src+" to "+des);
		count++;
		TOH(n-1,hlp,src,des);
		
	}

}
