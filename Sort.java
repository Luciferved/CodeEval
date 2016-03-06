import java.util.*;
class Sort
{
	public static void main(String args[])throws Throwable
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextLine())
		{
			String str = src.nextLine();
			String[] str1 =str.split(" "); 
			double[] a = new double[str1.length];
			for(int i=0;i<str1.length;i++)
			{
				a[i] = Double.parseDouble(str1[i]);
			}
			
			Arrays.sort(a);
			
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+" ");
			}
			System.out.println();
		}
	}
}
				