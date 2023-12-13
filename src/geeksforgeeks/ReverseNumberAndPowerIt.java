package geeksforgeeks;

import java.util.Scanner;

public class ReverseNumberAndPowerIt {

	public static void main(String[] args) {
		//IntStream.range(0, 10).forEach(s -> System.out.println("Hello world!"));
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		int temp=n;
		int rev =0;
		while(n>0)
		{
			int k =n%10;
			rev =rev*10+k;
			n=n/10;
		}
		System.out.println(rev);
		
		pow(rev,temp);
	}
	public static void pow(int n,int p)
	{
		long mul=1;
		long l =1000000000+7;
		for(int i=1;i<=n;i++)
		{
			mul=(mul*p);
			System.out.println(mul);
		    mul = mul %l;  
		    		}
		System.out.println(mul);
	}
}
