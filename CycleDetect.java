import java.util.*;
class CycleDetect
{
	public static void main(String args[])throws Throwable
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextLine())
		{
		
			String num = src.nextLine();
			String num1[] = num.split(" ");
			int a[] = new int[num1.length];
			for(int i=0;i<num1.length;i++)
			{
				a[i] = Integer.parseInt(num1[i]);
			}
			LinkedHashSet hs = new LinkedHashSet();
			
			for(int i=0;i<a.length;i++)
			{
				for(int j=i+2;j<a.length;j++)
				{
					if(a[j] == a[i])
					{
						hs.add(a[j]);
					}
				}
			}
			Iterator it = hs.iterator();
			while(it.hasNext())
			{
				System.out.print(it.next()+" ");
				
			}
			System.out.println();
		}
	}
}