import java.util.*;
class Multiple
{
	public static void main(String args[])throws Throwable
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextLine())
		{
			String str = src.nextLine();
			String[] str1 = str.split(",");
			int x= Integer.parseInt(str1[0]);
			int  n= Integer.parseInt(str1[1]);
			int mul = n;
			while(mul < x)
			{
				mul+=n;
			}
			System.out.println(mul);
		}
	}
}