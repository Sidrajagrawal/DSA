package String;
import java.util.*;

public class Duplicate {
	public static void main(String args[]) {
		String s = "abcd";
		String t = "abcde";
		int[] list1 = new int[26];
        for(int i=0;i<t.length();i++){
            int ascii = (int)t.charAt(i);
            list1[ascii-97]++; 
         }
        for(int i=0;i<s.length();i++){
            int ascii = (int)s.charAt(i);
            list1[ascii-97]--;
        }
        char ch = 97+1;
	}
}
