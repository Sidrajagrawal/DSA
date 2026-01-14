package bitmasking;

public class Magic_number {
	public static void main(String[] args) {
		int n = 6;
		int idx = 0;
		int sum = 0;
		while(n > 0) {
			idx++;
			if((n&1) != 0) {
				sum += (int)Math.pow(5 ,idx);
			}
			n >>= 1;
		}
		System.out.println(sum);
	}
}
