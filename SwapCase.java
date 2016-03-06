import java.util.*;
class SwapCase
{
	public static void main(String args[])throws Throwable
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextLine())
		{
			String str = src.nextLine();
			String str1="";
			for(int i=0;i<str.length();i++)
			{
			 char c = str.charAt(i);
				if(Character.isUpperCase(c))
					str1 += Character.toLowerCase(c);
				else
					str1+= Character.toUpperCase(c);
			}
			System.out.println(str1);
		}
		
	}
}