package Math;

public class RectangleOverlap {
	public static boolean check (int[] rect1,int [] rect2) {
		if(rect2[1] >= rect1[3] || rect1[1] >= rect2[3] || rect1[0] >= rect2[2] ||
		        rect2[0] >= rect1[2]) return false;
		        return true;
	}
	public static void main(String args[]) {
        int[] rect1 = {0,0,2,2};
        int[] rect2 = {1,1,3,3};
        System.out.print(check(rect1,rect2));
	}
}
