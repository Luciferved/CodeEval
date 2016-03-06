import java.util.*;
class CountingPrime
{
	public static void main(String args[])throws Throwable
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextLine())
		{
			String str = src.nextLine();
			String[] a = str.split(",");
			int s = Integer.parseInt(a[0]);
			int e = Integer.parseInt(a[1]);
			int count = 0;
			for(int i=s;i<=e;i++)
			{
				boolean flag = true;
				for(int j=2;j<=i;j++)
				{
					if((i%j == 0) && (j!=i))
						flag = false;
				}
				if(flag)
					count++;
			}
			System.out.println(count);
		}
	}
}