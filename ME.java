import java.util.*;
class ME
{
	public static void main(String args[])throws Throwable
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextLine())
		{
			String str = src.nextLine();
			String[] a = str.split(",");
			//Integer l = a.length/2;
			HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
			Integer count = 1;
			for(int i=0;i<a.length;i++)
			{
				/*if(!hm.containsKey(Integer.parseInt(a[i])))
					hm.put(Integer.parseInt(a[i]),1);
				else
					hm.put(Integer.parseInt(a[i]),count++);*/
					
				int n = Integer.parseInt(a[i]);
				if (hm.containsKey(n)) 
				{
					int value = hm.get(n);
					hm.put(n, value+1);
                }
				else 
				{
                    hm.put(n, 1);
                }
					
			}
			
			
			
			/*Iterator<Map.Entry<Integer,Integer>> iterator = hm.entrySet().iterator();
			
			 while(iterator.hasNext())
			{
				Map.Entry<Integer, Integer> entry = iterator.next();
				if(entry.getValue() >= Math.round(a.length/2))
					System.out.println(entry.getKey());
					
				
			}
			*/
			
			
			boolean flag = false;
		for(Map.Entry<Integer,Integer> entry : hm.entrySet())
			{
				//System.out.println(entry.getKey() +" :: "+ entry.getValue());
				if(entry.getValue() >= Math.round(a.length/2))
				{
					
					System.out.println(entry.getKey());
					flag = true;
				}
				else 
					flag = false;
					
			}
			if(flag == false)
				System.out.println("None");
			

			

		}
	}
}
		