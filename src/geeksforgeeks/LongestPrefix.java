//Given an array of N strings, find the longest common prefix among all strings present in the array.


package geeksforgeeks;

import java.util.Arrays;
import java.util.Scanner;

public class LongestPrefix {

	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter the size of an array");
//		int size = s.nextInt();
//		String a[] = new String[size];
//		
//		for(int i=0;i<size;i++)
//		{
//			System.out.println("Enter the String at "+i+" index");
//			a[i] = s.nextLine();
//		}
		
	String a[] = {"Geeks","Geek","Gee"};
		System.out.println(longestPrefix(a,a.length));
	}
	
	public static String longestPrefix(String b[],int c)
	{
		
		if(c==0)
		    return "";
		
		if(c==1)
			return b[0];
		Arrays.sort(b);
		
		int minSize = Math.min(b[0].length(), b[c-1].length()),i=0;
		String longestPrefix="There's no common prefix in the given strings";
		while(i<minSize && b[0].charAt(i)==(b[c-1].charAt(i)))
		{
			 i++; //because end index will not be considered 
			 longestPrefix = b[0].substring(0,i);
		
		}
		return longestPrefix;
		
	}
}
