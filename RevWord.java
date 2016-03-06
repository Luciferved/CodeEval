/*Reverse the words in the string*/
import java.util.*;
class RevWord
{
	public static void main(String args[])throws Throwable
	{
		Scanner src = new Scanner(System.in);
		
		while(src.hasNextLine())
		{
			String str = src.nextLine();
			if(str.length() > 0)
			{
				String[] str1 = str.split(" ");
				String rev=" ";
				for(int i=str1.length-1;i>=0;i--)
				{
					rev += str1[i]+" ";
				}
				System.out.println(rev);
					
			}
			
		}
	
	}
}
			