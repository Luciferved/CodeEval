import java.util.*;
class LowestUnique2
{
	public static void main(String args[])
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextLine())
		{
			String str = src.nextLine();
			String splt[] = str.split(" ");
			int a[] = new int[splt.length];
			int b[] = new int[splt.length];
			
			for(int i=0;i<splt.length;i++)
			{
				a[i] = Integer.parseInt(splt[i]);
			}
			
			LinkedHashMap<Integer,Integer> lhm = new LinkedHashMap<Integer,Integer>();
			
			for(int i=0;i<b.length;i++)
			{
				if(lhm.containsKey(a[i]))
				{
					lhm.put(a[i],lhm.get(a[i])+1);
				}
				else
				{
					lhm.put(a[i],1);
				}
				b[i] = a[i];
			}
			
			Arrays.sort(b);
			int low = 0;
			for (int i : b) 
			{
                if (lhm.get(i) == 1) 
				{
                    low = i;
                    break;
                }
            }
			boolean flag = true;   
			for (int i = 0; i < a.length; i++) 
			{
				if (a[i] == low) 
				{
					flag = true;
                    System.out.println(i+1);
					break;
				}
				else
				{
					flag=  false;
				}
            }
			if (flag == false) 
			{
				System.out.println("0");
			} 
        }
	}
}
			