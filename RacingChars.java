import java.util.*;
class RacingChars
{
	public static void main(String args[])
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextLine())
		{
			String str = src.nextLine();
			int index = 0;
			int nextl = -1;
			if(str.contains("_") && str.contains("#"))
			{
				index = str.indexOf("_");
				if(index < nextl)
				{
					System.out.println(str.replace("_","/"));
				}
				else if(index > nextl)
				{
					System.out.println(str.replace("_","\\"));
				}
				else
				{
					System.out.println(str.replace("_","|"));
				}

			}
			else if(str.contains("C") && str.contains("_") && str.contains("#"))
			{
				int newlen = str.indexOf("C");
				if(newlen < index)
					System.out.println(str.replace("C","/"));
				else
					System.out.println(str.replace("C","\\"));
			}
			nextl = index;
		}
	}
}
					