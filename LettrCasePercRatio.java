import java.util.*;
class LettrCasePercRatio
{
	public static void main(String args[])
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextLine())
		{
			String str = src.next();
			double up = 0;
			double low = 0;
			double len = str.length();
			for(int i=0;i<str.length();i++)
			{
				
				if(Character.isUpperCase(str.charAt(i)))
				{
					up++;
				}
				if(Character.isLowerCase(str.charAt(i)))
				{
					low++;
				}
			}
			double uc = up*100/len;
			double lc = low*100/len;
			System.out.printf("lowercase: %.2f uppercase: %.2f",lc,uc);
			System.out.println();
		
		}
	}
}