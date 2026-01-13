package bitmasking;

public class LeftShift_RightShift {
	public static void main(String[] args) {
		int n = 5;
		//Left Shift
		System.out.println(n << 1); // eg: 5(00000101) --> 00001010(10)
		System.out.println(n << 2); // eg: 5(00000101) --> 00001010(10) --> 00010100(20)
		System.out.println(n << 3); // eg: 5(00000101) --> 00001010(10) --> 00010100(20) --> 00101000(40)
		System.out.println(n << 4); // eg: 5(00000101) --> 00001010(10) --> 00010100(20) --> 00101000(40) --> 01010000 (80)
		//Left Shift means n << k --> n * 2^k 
		// eg: 5 << 4 --> 5*2^4 = 80; 
		
		
		//Right Shift
		// m / 2^k
		int m = 17;
		System.out.println(m >> 1); 
		System.out.println(m >> 2); 
		System.out.println(m >> 3); 
		
		//eg: 16(00010000) >> 1 --> 00001000(8) means 16 / 2^1
		//eg: 16(00010000) >> 2 --> 00000100(4) means 16 / 2^2
		
		// In Minus m we get if odd eg: 17 >> 1 --> -9 , 17 >> 2 --> -5 (one more);
	}

}
