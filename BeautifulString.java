/*

When John was a little kid he didn't have much to do. There was no internet, no Facebook, and no programs to hack on. So he did the only thing he could... he evaluated the beauty of strings in a quest to discover the most beautiful string in the world. 

Given a string s, little Johnny defined the beauty of the string as the sum of the beauty of the letters in it. The beauty of each letter is an integer between 1 and 26, inclusive, and no two letters have the same beauty. Johnny doesn't care about whether letters are uppercase or lowercase, so that doesn't affect the beauty of a letter. (Uppercase 'F' is exactly as beautiful as lowercase 'f', for example.) 

You're a student writing a report on the youth of this famous hacker. You found the string that Johnny considered most beautiful. What is the maximum possible beauty of this string?

INPUT SAMPLE:

Your program should accept as its first argument a path to a filename. Each line in this file has a sentence. E.g.


1
2
3
4
5
ABbCcc
Good luck in the Facebook Hacker Cup this year!
Ignore punctuation, please :)
Sometimes test cases are hard to make up.
So I just go consult Professor Dalves
OUTPUT SAMPLE:

Print out the maximum beauty for the string. E.g.


1
2
3
4
5
152
754
491
729
646

MAin Logic : find occurence of each letter and sort it in descending order and multiply with 26,25,24....etc


*/

import java.util.*;
class BeautifulString
{
	public static void main(String args[])
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextLine())
		{
			String str = src.nextLine();
			str = str.toLowerCase();
			TreeMap<Character,Integer> hm = new TreeMap<Character,Integer>();
			for(int i=0;i<str.length();i++)
			{
				
				Character c = str.charAt(i);
				if(Character.isLetter(c))
				{
					if(hm.containsKey(c))
						hm.put(c,hm.get(c)+1);
					else
						hm.put(c,1);
				}
			}
			
			int sum = 0;
			int max = 26;
			ArrayList<Integer> list = new ArrayList<Integer>(hm.values());
			//System.out.println(list);
			Collections.sort(list,Collections.reverseOrder());
			//System.out.println(list);
			
			for(Integer i : list) 
			{
				sum += (max)* i;
				max--;
				
			}
			System.out.println("Sum 1: "+sum);
		}
	}
}