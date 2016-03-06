import java.util.*;
class SOI
{
	public static void main(String args[])throws Throwable
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextLine())
		{
			String str = src.nextLine();
			String[] str1 = str.split(",");
			int sum = 0;
			for(int i=0;i<str1.length;i++)
			{
				sum+=Integer.parseInt(str1[i]);
			}
			System.out.println(sum);
		}
	}
}
			