//The stock span problem is a financial problem where we have a series of n daily price quotes for a stock and we need to calculate the span of stocks price for all n days. 
//The span Si of the stocks price on a given day i is defined as the maximum number of consecutive days just before the given day, for which the price of the stock on the given day is less than or equal to its price on the current day.
//For example, if an array of 7 days prices is given as {100, 80, 60, 70, 60, 75, 85}, then the span values for corresponding 7 days are {1, 1, 1, 2, 1, 4, 6}.

package geeksforgeeks;

public class SpanProblem {

public static void main(String[] args) {
		
		int a[] = {100,80,60,70,40,50,80};
		int min=a[0];
		int sum =0;
		int b[]= new int[a.length];
		for(int i=0 ;i<a.length;i++)
		{
			int diff = a[i]-min;
			if(diff <= 0)
			{
				b[i]=1;
				min = a[i];
			}
			else
			{
				sum =sum+2;
				b[i]=sum;
				min =a[i];
			}
		}
	for(int d : b)
	{
		System.out.println(d);
	}
		
	}
}
