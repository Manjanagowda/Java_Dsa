package geeksforgeeks;

import java.util.HashMap;
import java.util.Scanner;

public class SubSetArray {

public static void main(String[] args) {
		
        Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the size of first array");
		int size = s.nextInt();
		int a[] = new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the "+i+" index digit");
	        a[i]=s.nextInt();
		}
		System.out.println("Enter the the size of the second array");
		int size2 = s.nextInt();
		int b[] = new int[size2];
		for(int i=0;i<size2;i++)
		{
			System.out.println("Enter the "+i+" index digit");
			b[i] = s.nextInt();
		}
		
		System.out.println(isSubSet(a,b));
	}
	
	public static String isSubSet(int a[],int b[])
	{
		HashMap<Integer, Integer> set =new HashMap();
		if(a.length>b.length)
		{
			for(int i=0;i<a.length;i++)
			{
				int count=0;
				for(int j=0;j<b.length;j++)
				{
					if(a[i]==b[j])
					{
						count++;
					}
					set.put(a[j], count);
				}
			}
		}
		System.out.println(set);
		
	if(set.containsValue(0))
	{
		return "No, b[] is not subset of a[]";
	}
	else {
		return "yes, b[] is subset of a[]";
	}
	}
}
