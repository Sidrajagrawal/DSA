package recursion;

public class Fibonacii {
	public static void main(String args[]) {
		int n = 6;
		System.out.print(fibo(n));
		
	}

	private static int fibo(int n) {
		if(n == 0 || n==1) {
			return n;
		}
		
		int f1 = fibo(n-1); 
		int f2 = fibo(n-2);
		
		return f1+f2;
	}
}
