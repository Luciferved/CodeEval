/*

Given a number n and two integers p1,p2 determine if the bits in position p1 and p2 are the same or not. Positions p1 and p2 are 1 based.

INPUT SAMPLE:

The first argument will be a path to a filename containing a comma separated list of 3 integers, one list per line. E.g.


1
2
86,2,3
125,1,2
OUTPUT SAMPLE:

Print to stdout, 'true'(lowercase) if the bits are the same, else 'false'(lowercase). E.g.


1
2
true
false


*/
import java.util.*;
import java.io.*;
class BitPos
{
	public static void main(String args[])throws Throwable
	{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner src = new Scanner(System.in);
		String str;
		while(src.hasNextLine())
		{
			str = src.nextLine();
			String split[] = str.split(",");
			int no =Integer.parseInt(split[0]);
			int x = Integer.parseInt(split[1]);
			int y = Integer.parseInt(split[split.length-1]);
			//String str1 = Integer.toBinaryString(0x10000 | no).substring(1);
			String str1 = Integer.toBinaryString(no);
			
			if(str1.charAt(str1.length()-x) == str1.charAt(str1.length()-y))
				System.out.println("true");
			else
				System.out.println("false");
		}
	}
}