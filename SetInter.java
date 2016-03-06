import java.util.*;
class SetInter
{
	public static void main(String args[])throws Throwable
	{
		Scanner src = new Scanner(System.in);
		String str;
		while(src.hasNextLine())
		{
			str = src.nextLine();
			str = str.trim();
			String[] a = str.split(";");
			
			TreeSet ts1 = toInt(a[0]); 
			TreeSet ts2 = toInt(a[1]);
			
			ts2.retainAll(ts1);
			
			Iterator iterator = ts2.iterator();
			while (iterator.hasNext())
			{
				System.out.print(iterator.next());

                if (iterator.hasNext()) 
				{
                    System.out.print(",");
                }
			}
			System.out.println();
		}
	}
	
	
	private static TreeSet<Integer> toInt(String str)
	{
		String[] a = str.split(",");
		TreeSet ts = new TreeSet();
		for(String i : a)
		{
			ts.add(Integer.parseInt(i));
		}
		return ts;
	}
}
/*

import java.util.*;
class SetInter
{
	public static void main(String args[])throws Throwable
	{
		Scanner src = new Scanner(System.in);
		String str;
		while(src.hasNextLine())
		{
			str = src.nextLine();
		
			int n = str.indexOf(';');
			
			
			TreeSet ts = new TreeSet();
			TreeSet ts2 = new TreeSet();
			
			for(Integer i=0;i<n;i++)
			{
				ts.add(str.charAt(i));
			}
			//System.out.println(ts);
			for(Integer i=n+1;i<str.length();i++)
			{
				ts2.add(str.charAt(i));
			}
			
			ts2.retainAll(ts);
			
			Iterator iterator = ts2.iterator();
			while (iterator.hasNext())
			{
				System.out.print(iterator.next());

                if (iterator.hasNext()) 
				{
                    System.out.print(",");
                }
			}
			System.out.println();
		}
	}
}
	


*/
	