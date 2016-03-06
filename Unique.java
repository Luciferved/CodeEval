import java.util.*;
class Unique
{
	public static void main(String args[])throws Throwable
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextLine())
		{
			String str = src.nextLine();
			String[] a = str.split(",");
			
			TreeSet<Integer>ts = new TreeSet<Integer>();
			
			for(int i=0;i<a.length;i++)
			{
				ts.add(Integer.parseInt(a[i]));
			}
			
			
			
			/*for(Integer i : ts)
			{
				System.out.println(i);
			}
			*/
			Iterator it = ts.iterator();
			while(it.hasNext())
			{
				System.out.print(it.next());
				if(it.hasNext())
					System.out.print(",");
			}
			System.out.println();
		}
	}
}