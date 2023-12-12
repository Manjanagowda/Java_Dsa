package geeksforgeeks;

import java.util.Scanner;

public class PallindromeArray {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the size of an array");
		int size = s.nextInt();
		int a[] = new int[size];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the "+i+" index number");
			a[i]=s.nextInt();
		}
		System.out.println( pallindrome(a));
	}
	
	public static int pallindrome(int a[])
	{
		int count = 0;
		for(int i=0;i<a.length;i++)
		{
			int temp =a[i];
			int rev =0;
			while(a[i]>0)
			{
				int k =a[i]%10;
				rev = rev*10+k;
			    a[i]=a[i]/10;
			}
			if(rev==temp)
			{
				count++;
			}
		}
		if(count==a.length)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}
