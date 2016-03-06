import java.util.*;
class Trailing
{
	public static void main(String args[])throws Throwable
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextLine())
		{
			String str = src.nextLine();
			String[] str1 = str.split(",");
			String st = str1[1];
			String s = str1[0];
			str = str.replace(st," ");
			str = str.replace(","," ");
			if(s.endsWith(st))
				System.out.println("1");
			else
				System.out.println("0");
		}
	}
}
			