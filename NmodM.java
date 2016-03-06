import java.util.*;
class NmodM
{
	public static void main(String args[])throws Throwable
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextLine())
		{
			String str = src.nextLine();
			String[] a = str.split(",");
			int n = Integer.parseInt(a[0]);
			int m = Integer.parseInt(a[1]);
			int mod = n;
			while(mod >= m)
			{
			   mod -= m;
			}
			System.out.println(mod);
		}
	}
}