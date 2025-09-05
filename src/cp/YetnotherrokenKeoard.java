package cp;
import java.util.*;

public class YetnotherrokenKeoard {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++) {
			String s = sc.next();			
			
			StringBuilder ans = new StringBuilder();
			
			for(char ch: s.toCharArray()) {
				if(ch == 'b') {
					for(int j=ans.length()-1; j>=0; j--) {
						if(Character.isLowerCase(ans.charAt(j))) {
							ans.deleteCharAt(j);
							break;
						}
					}
				}else if(ch == 'B') {
					for(int j=ans.length()-1; j>=0; j--) {
						if(Character.isUpperCase(ans.charAt(j))) {
							ans.deleteCharAt(j);
							break;
						}
					}
				}else {
					ans.append(ch);
				}
			}
			
			System.out.println(ans.toString());
		}
	}
}
