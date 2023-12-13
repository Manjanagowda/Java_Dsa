package geeksforgeeks;

import java.util.HashMap;
import java.util.Map;

public class SellStock {

public static void main(String[] args) {
		
		int a[]= {15,20,5,20,30};
		int max=0;
		int b,c=0;
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<a.length;i++)
		{
			int n=a[i];
			for(int j=0;j<a.length-1;j++)
			{
				int sub =a[j+1]-n;
				if(sub>max)
				{
					max=sub;
					map.put(n, a[j+1]);
				}
			}
			
		}
		for(Map.Entry<Integer, Integer> e : map.entrySet())
		{
			int d =e.getValue()-e.getKey();
			if(max==d)
			{
				System.out.println("Start investing at "+e.getKey()+" and take back at "+e.getValue()+" to get maximum profit "+max);
			}
		//map.entrySet().forEach(s->s.getKey().);
		}
	//	System.out.println(max);
		//System.out.println(map);
	}
}
