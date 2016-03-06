/*
The sentence 'A quick brown fox jumps over the lazy dog' contains every single letter in the alphabet. 
Such sentences are called pangrams. You are to write a program, which takes a sentence, and returns all the letters it is missing 
(which prevent it from being a pangram). You should ignore the case of the letters in sentence, and your return should be all lower case letters, 
in alphabetical order. You should also ignore all non US-ASCII characters.
In case the input sentence is already a pangram, print out the string NULL


Example :

A quick brown fox jumps over the lazy dog			---		NULL
A slow yellow fox crawls under the proactive dog	---		bjkmqz

*/

import java.util.*;
class Panagram
{
	public static void main(String args[])
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextLine())
		{
			String str = src.nextLine();
			str = str.toLowerCase();
			str = str.replace(" ","");
			Character ch[] = new Character[str.length()];
			for(int i=0;i<ch.length;i++)
			{
				ch[i] = str.charAt(i);
			}
			TreeSet<Character> ts1 = new TreeSet<Character>(Arrays.asList(ch));
			TreeSet<Character> ts2 = new TreeSet<Character>();
			Character c = 'a';
			for(int i=0;i<26;i++)
			{
				ts2.add(c);
				c++;
			}
			ts2.removeAll(ts1);
			
			if(ts2.size() > 0)
			{
				Iterator it = ts2.iterator();
				while(it.hasNext())
				{
					System.out.print(it.next());
				}
			}
			else
			{
				System.out.print("NULL");
			}
			System.out.println();
		}
	}
}