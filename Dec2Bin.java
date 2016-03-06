/*
import java.util.*;
class Dec2Bin
{
	public static void main(String args[])throws Throwable
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextLine())
		{
			int n = src.nextInt();
			System.out.println(Integer.toBinaryString(n));
		}
	}
}
*/
import java.util.*;
class Dec2Bin
{
	public static void main(String args[])throws Throwable
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextInt())
		{
			Integer n = src.nextInt();
			ArrayList<Integer> ls = new ArrayList<Integer>();
			Integer a = 0;
			if(n==0)
			{
				System.out.print("0");
			}
			else
			{
				while(n >0)
				{
					a = n%2;
					ls.add(a);
					n = n/2;
				}
				
				for(int i=ls.size()-1;i>=0;i--)
				{
					System.out.print(ls.get(i));
				}
			}
			System.out.println();
		}
	}
}
