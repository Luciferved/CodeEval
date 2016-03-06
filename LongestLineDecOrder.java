/*

Write a program which reads a file and prints to stdout the specified number of the longest lines that are sorted based on their length in descending order.

INPUT SAMPLE:

Your program should accept a path to a file as its first argument. The file contains multiple lines. The first line indicates the number of lines you should output, the other lines are of different length and are presented randomly. You may assume that the input file is formatted correctly and the number in the first line is a valid positive integer.

For example:


1
2
3
4
5
6
2
Hello World
CodeEval
Quick Fox
A
San Francisco
OUTPUT SAMPLE:

Print out the longest lines limited by specified number and sorted by their length in descending order.

For example:


1
2
San Francisco
Hello World


*/




import java.util.*;
import java.io.*;
class LongestLineDecOrder
{
	public static void main(String args[])throws Throwable
	{
		Scanner src = new Scanner(new File(args[0]));	//"line.txt"
		int n = src.nextInt();
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		while(src.hasNextLine())
		{
			String str = src.nextLine();
			str = str.trim();
			int len = str.length();
			if(len > 0)
				tm.put(len,str);
		}
		int c = 0;
		for(Integer i : tm.descendingKeySet())
		{
			System.out.println(tm.get(i));
			c++;
			if(c == n)
				break;
		}
			
	}
}