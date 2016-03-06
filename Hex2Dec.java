import java.util.*;
class Hex2Dec
{
	public static void main(String args[])throws Throwable
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextLine())
		{
			String str = src.nextLine();
			System.out.println(Integer.parseInt(str,16));
		}
	}
}