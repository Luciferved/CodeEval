/*Alternet Letter Upper Case*/
import java.util.*;
class Roller
{
	public static void main(String args[])throws Throwable
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextLine())
		{
			String str = src.nextLine();
			String newStr = ""; 
			boolean lastCharLower = true;
			for(int i=0;i<str.length();i++)
			{
				char current = str.charAt(i);
				if(Character.isLetter(current))
				{
					if(lastCharLower)
					{
						newStr += Character.toUpperCase(current);
						lastCharLower = false;
					}
					else
					{
						newStr += Character.toLowerCase(current);
						lastCharLower = true;
					}
				}
				else 
				{ 
					newStr += current; 
				}
			}
			System.out.println(newStr);
		}
	}
}



/*

Even Odd position

for(int i=0;i<str.length();i++)
			{
				char currentChar = str.charAt(i); 
				if ((i % 2) == 0) 
				{ 
					newS += Character.toUpperCase(currentChar); 
				} 
				else 
				{ 
					newS += Character.toLowerCase(currentChar); 
				} 
			}
			
*/