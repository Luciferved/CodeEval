import java.io.*;
import java.util.*;
class SumOfIntegers
{
	public static void main(String args[])
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextLine())
		{
			String str = src.nextLine();
			String split[] = str.split(",");
			int a[] = new int[split.length];
			int count = 0;
			for(int i=0;i<a.length;i++)
			{
				a[i] = Integer.parseInt(split[i]);
				if(a[i]<0)
					count++;
			}
			if(count == a.length)
				System.out.println("-1");
			else
				System.out.println(calcMaxSum(a));
		}
	}
	
	private static int calcMaxSum(int[] a)
	{
		int cur_sum = 0;
		int max_sum = 0;
		int current_index = -1;
		int best_start_index = 0;
		int best_end_index = 0;
		int val = 0;
		int sum = 0;
		
		for(int i=0;i<a.length;i++)
		{
			val = cur_sum+a[i];
			if(val>cur_sum)
			{
				if(cur_sum == 0)
					current_index = i;
				cur_sum = val;
			}
			else
			{
				cur_sum = 0;
			}
			if(cur_sum>max_sum)
			{
				max_sum = cur_sum;
				best_start_index = current_index;
				best_end_index = i;
			}
		}
		
		for(int i=best_start_index;i<=best_end_index;i++)
			sum+=a[i];
			
		return sum;
	}
}