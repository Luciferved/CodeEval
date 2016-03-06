/*Position of RightMost Occurence of Character
Input :Hello World,r
Output:8
*/
import java.util.*;
class Main
{
	public static void main(String args[])throws Throwable
	{
		Scanner src = new Scanner(System.in);
		
		while(src.hasNextLine())
		{
			System.out.println(RightChar(src.nextLine()));
		}
		
		
	}

	public static int RightChar(String str)
	{
		String[] str1 = str.split(",");
		String str2 = str1[0];
		String str3 = str1[1];
		
		String str4 = str.substring(str.length()-2);
		
		str = str.replace(str4,"");
		return str.lastIndexOf(str3);
	}
}
		