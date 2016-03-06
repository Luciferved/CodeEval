import java.util.*;
class Mixed
{
	public static void main(String args[])throws Throwable
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextLine())
		{
			String str = src.nextLine();
			String[] a = str.split(",");
			ArrayList l1 = new ArrayList();
			ArrayList l2 = new ArrayList();
			
			for(int i=0;i<a.length;i++)
			{
				String temp = a[i];
				char c = temp.charAt(0);
				
				if(Character.isLetter(c))
				{
					l1.add(temp);
				}
				if(Character.isDigit(c))
				{
					l2.add(Integer.parseInt(a[i]));
				}
			}
			Iterator it1 = l1.iterator();
			Iterator it2 = l2.iterator();
			while(it1.hasNext())
			{
				System.out.print(it1.next());
				if(it1.hasNext())
					System.out.print(",");
					
				if(!it1.hasNext() && it2.hasNext())
					System.out.print("|");
			}
			
			while(it2.hasNext())
			{
				System.out.print(it2.next());
				if(it2.hasNext())
					System.out.print(",");
			}
			System.out.println();
		}
	}
}
			