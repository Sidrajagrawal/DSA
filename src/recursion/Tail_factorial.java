package recursion;

public class Tail_factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.print(fac(n,1));
	}

	private static int fac(int n,int ans) {
		// TODO Auto-generated method stub
		if(n == 1 || n == 0) {
			return 1;
		}
		return fac(n-1,ans*n);
	}

}
