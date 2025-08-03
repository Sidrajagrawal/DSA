package String;
import java.util.*;
public class Atoi {
	public static void main(String args[]) {
        String s= "-042";
		s = s.trim();
        int pos1 = 0;
		boolean positive = true;
		if(s.charAt(0) == '+' ) {
			pos1 = 1;
		}else if(s.charAt(0) == '-') {
			pos1=1;
			positive=false;
		}
        int pos=0;
        int ans = 0;
        
        for(int i=pos1;i<s.length();i++){
            if(s.charAt(i) != '0') {
            	pos = i;
            	break;
            }
        }
        for(int i=pos;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch)) {
                break;
            }
            else if(Character.isDigit(ch)){
                int val = ch-'0';
                ans = val + ans*10;
            }else {
            	break;
            }
        }
        ans = positive ? ans : (-ans); 
        System.out.print(ans);
	}
}
