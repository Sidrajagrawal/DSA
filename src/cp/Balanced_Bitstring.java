package cp;

import java.util.*;

public class Balanced_Bitstring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			String s = sc.next();
			int q = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '?')
					q++;
			}
			List<String> lst = new ArrayList<>();
			boolean found = false;
			if (q == 0) {
				found = check(s, k);
			} else {
				sub(s, q, 0, lst);
				for (String w : lst) {
					if (check(w, k)) {
						found = true;
						break;
					}
				}
			}

			if (found)
				System.out.println("YES");
			else
				System.out.println("NO");
		}

	}

	private static boolean check(String s, int k) {
		int n = s.length();
		int half = k / 2;
		int zeros = 0, ones = 0;
		for (int i = 0; i < k; i++) {
			if (s.charAt(i) == '0')
				zeros++;
			else if (s.charAt(i) == '1')
				ones++;
		}
		if (zeros != half || ones != half)
			return false;
		for (int i = k; i < n; i++) {
			if (s.charAt(i) == '0')
				zeros++;
			else if (s.charAt(i) == '1')
				ones++;

			char left = s.charAt(i - k);
			if (left == '0')
				zeros--;
			else if (left == '1')
				ones--;
			if (zeros != half || ones != half)
				return false;
		}
		return true;
	}

	private static void sub(String s, int q, int idx, List<String> lst) {
		// TODO Auto-generated method stub
		if (idx == s.length())
			return;
		if (q == 0) {
			lst.add(s);
			return;
		}
		char ch = s.charAt(idx);

		if (ch == '?') {
			String f = s.substring(0, idx);
			String l = s.substring(idx + 1);
			sub(f + "1" + l, q - 1, idx + 1, lst);
			sub(f + "0" + l, q - 1, idx + 1, lst);
		} else {
			sub(s, q, idx + 1, lst);
		}
	}

}
