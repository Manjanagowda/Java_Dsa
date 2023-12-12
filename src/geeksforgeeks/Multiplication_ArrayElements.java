
// Given an array nums[] of size n, construct a Product Array P (of same size n) 
//such that P[i] is equal to the product of all the elements of nums except nums[i].

package geeksforgeeks;

import java.util.Scanner;

public class Multiplication_ArrayElements {
	
public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the size of the array:");
	int size = s.nextInt();
	int arr[]= new int[size];
	for(int i =0;i<arr.length;i++ )
	{
	 System.out.println("Enter the "+i+"digit number");
	 arr[i] = s.nextInt();
	}
	
		 productArray(arr,size);
	
}

public static void productArray(int a[],int b)
{
	int c[]=new int[b];
	for(int i=0;i<b;i++)
	{
		int product =1;
		for(int j=0;j<b;j++)
		{
			if(a[i]==a[j])
				continue;
			else
			{
				product = product*a[j];
				c[i]=product;
			}
		}		
		
	}
	for(int n: c)
	{
		System.out.println(n);
	}
	
}

}
