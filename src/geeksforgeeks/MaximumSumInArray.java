//. Given an array of integers of size N and a number K.,
//You must modify array arr[] exactly K number of times. Here modify array 
//means in each operation you can replace any array element either arr[i] by 
//-arr[i] or -arr[i] by arr[i]. You need to perform this operation in such a way
//that after K operations, the sum of the array must be maximum.
//Example 1:
//Input: N = 5, K = 1 arr[] = {1, 2, -3, 4, 5} Output: 15 Explanation: We have k=1 so we can change -3 to 3 and sum all the elements to produce 15 as output.
//Example 2:
//Input: N = 10, K = 5 arr[] = {5, -2, 5, -4, 5, -12, 5, 5, 5, 20} Output: 68 Explanation: Here we have k=5 so we turn -2, -4, -12 to 2, 4, and 12 respectively. Since we have performed 3 operations so k is now 2. To get maximum sum of array we can turn positive turned 2 into negative and then positive again so k is 0. Now sum is 5+5+4+5+12+5+5+5+20+2 = 68
//Your Task:
//You don't have to print anything, printing is done by the driver code itself. You have to complete the function maximizeSum() which takes the array A[], its size N, and an integer K as inputs and returns the maximum possible sum.
//


package geeksforgeeks;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = s.nextInt();
		int arr[]= new int[size];
		for(int i =0;i<arr.length;i++ )
		{
		 System.out.println("Enter the "+i+"digit number");
		 arr[i] = s.nextInt();
		}
		System.out.println("Enter the K Value ");
		int k = s.nextInt();
		System.out.println(maxSum(arr,size,k));

	}
	
	public static int maxSum(int a[],int size,int k)
	{
		Arrays.sort(a);
		int sum =0;
		for(int i=0;i<size;i++)
		{
			if(a[i]<0 && k>0 )
			{
				a[i]=-a[i];
				k--;
			}
			sum=sum+a[i];
		}

		return sum;
		
	}

}
