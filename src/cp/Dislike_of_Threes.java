package cp;

import java.util.*;
public class Dislike_of_Threes {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[1000];
		
		int idx = 0,j=1;
		while(idx < arr.length) {
			String temp =  Integer.toString(j);
			if(j%3 !=0  &&  temp.charAt(temp.length()-1)!='3') {
				arr[idx++] = j;
			}
			j=j+1;
		}
		int t = sc.nextInt();
		for(int i=0;i<t;i++) {
			int n = sc.nextInt();	
			System.out.println(arr[n-1]);
		}
	}
}
