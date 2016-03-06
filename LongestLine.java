import java.util.*;
import java.io.*;
class LongestLine
{
	public static void main(String args[])throws Throwable
	{
		Scanner src = new Scanner(new File("line.txt"));
		while(src.hasNextLine())
		{
			String str = src.nextLine();
			int l = str.length();
			String str1 = src.nextLine();
			if(l < str1.length())
				System.out.println(str1);
		}
	}
}