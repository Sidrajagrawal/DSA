package bitmasking;
import java.util.*;

public class pos_set_unset {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int pos = sc.nextInt();
		int temp = n >> pos;
		if((temp & 1) == 1) {
			System.out.println("Set");
		}else {
			System.out.println("Unset");
		}
	}
}
