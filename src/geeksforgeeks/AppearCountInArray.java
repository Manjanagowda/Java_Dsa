package geeksforgeeks;

import java.util.Scanner;

public class AppearCountInArray {

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
		
		
	}

}
