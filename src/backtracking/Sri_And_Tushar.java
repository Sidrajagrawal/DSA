package backtracking;
import java.util.*;

public class Sri_And_Tushar {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);  
        int n = scanner.nextInt();  
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {  
            nums[i] = scanner.nextInt();  
        }  
        
        int s=0,t=0;
        for(int i=0;i<n;i++) {
        	for(int j=i+1;j<n;j++) {
        		if(nums[i]>nums[j]) {
        			s++;
        		}
        	}
        }
        
        for(int i=0;i<n-1;i++) {
        	if(nums[i] >nums[i+1]) {
        		t++;
        	}
        }
        
        if(t==s) {
        	 System.out.println("YES");
        }else {
        	 System.out.println("NO");
        }
        	
	}
}
