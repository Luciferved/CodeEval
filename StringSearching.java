/*

CHALLENGE DESCRIPTION:

You are given two strings. Determine if the second string is a substring of the first (Do NOT use any substr type library function). The second string may contain an asterisk(*) which should be treated as a regular expression i.e. matches zero or more characters. The asterisk can be escaped by a \ char in which case it should be interpreted as a regular '*' character. To summarize: the strings can contain alphabets, numbers, * and \ characters.

INPUT SAMPLE:

Your program should accept as its first argument a path to a filename. The input file contains two comma delimited strings per line. E.g.

Hello,ell
This is good, is
CodeEval,C*Eval
Old,Young
OUTPUT SAMPLE:

If the second string is indeed a substring of the first, print out a 'true'(lowercase), else print out a 'false'(lowercase), one per line. E.g.

true
true
true
false

75 working 25 not

*/
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class StringSearching
{
	public static void main(String args[])
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextLine())
		{
			String str = src.nextLine();
			String split[] = str.split(",");
			String s = split[0];
			String pat = split[split.length-1];
			if(pat.contains("*"))
			{
				pat = pat.replace("*","");
				starOrslashSearch(pat,s);
			}
			else if(pat.contains("\\"))
			{	
				pat = pat.replace("\\*","");
				System.out.println(pat);
				starOrslashSearch(pat,s);
			}
			else if((pat.contains("\\")) && (pat.contains("*")))
			{	
				pat = pat.replace("\\","");
				pat = pat.replace("*","");
				starOrslashSearch(pat,s);
			}
			else if(!(pat.contains("*")))
			{
				regExSearch(pat,s);
			}
		}	
	}
	
	public static void starOrslashSearch(String pat,String s)
	{
		char a[] = pat.toCharArray();
		boolean flag = true;
		for(int i=0;i<a.length;i++)
		{
			if(!s.contains(a[i]+""))
				flag = false;
		}
		if(flag)
			System.out.println("true");
		else	
			System.out.println("false");
	}
	public static void regExSearch(String pat,String s)
	{
		Pattern pattern = Pattern.compile("\\w["+pat+"]+");
		Matcher matcher = pattern.matcher(s);
		if(matcher.find())
			System.out.println("true");
		else	
			System.out.println("false");
	}
}