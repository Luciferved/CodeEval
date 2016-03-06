/*

Write a program which determines the number of 1 bits in the internal representation of a given integer.
10	--	2
22	--	3
56	--	3
*/


import java.util.*;
class NoOf1Bit
{
	public static void main(String args[])
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextInt())
		{
			int n = src.nextInt();
			String str = Integer.toBinaryString(n);
			int count = 0;
			for(int i=0;i<str.length();i++)
			{
				int no = Integer.parseInt(str.charAt(i)+"");
				if(no == 1)
					count++;
			}
			System.out.println(count);
		}
	}
}