/*
	Write a program to determine the shortest repetition in a string. 
A string is said to have period p if it can be formed by concatenating one or more repetitions of another string of length p. For example, the string "xyzxyzxyzxyz" has period 3, since it is formed by 4 repetitions of the string "xyz". It also has periods 6 (two repetitions of "xyzxyz") and 12 (one repetition of "xyzxyzxyzxyz").

INPUT SAMPLE:

Your program should accept as its first argument a path to a filename. Each line will contain a string of up to 80 non-blank characters. E.g.

abcabcabcabc
bcbcbcbcbcbcbcbcbcbcbcbcbcbc
dddddddddddddddddddd
adcdefg
OUTPUT SAMPLE:

Print out the smallest period of the input string. E.g.

3
2
1
7


logic : take substring of count and 2*count and check...
i.e
		f				s
		0-1				1-2
		0-2				2-4
		0-3				3-6
*/

import java.util.*;
class ShortestSub
{
	public static void main(String args[])
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextLine())
		{
			String str = src.next();
			System.out.println(str.substring(0,2)+" "+str.substring(2,4));
			System.out.println(CountString(str));
		}
	}
	
	public static int CountString(String str)
	{
		int count = 1;
		for(int i=0;i<str.length()-count;i++)
		{
			//System.out.println("Count "+count);
			//System.out.println("Count+2 "+(2*count));
			//System.out.println("Str length "+(str.length()-count));
			
			String f = str.substring(0,count);
			//System.out.println("f " +f);
			String s = str.substring(count,2*count);
			//System.out.println("s " +s);
			if(f.equals(s))
				return count;
			count++;
		}
		return str.length();
	}
}
			
			
		