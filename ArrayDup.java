import java.util.*;
class ArrayDup
{
	public static void main(String args[])throws Throwable
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextLine())
		{
			String str = src.nextLine();
			String[] a = str.split(";");
			String str1 = a[1];
			str1 = str1.replace(","," ");
			String[] a1 = str1.split(" ");
			
			HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
			
			for(int i=0;i<a1.length;i++)
			{
				int n = Integer.parseInt(a1[i]);
				if (hm.containsKey(n)) 
					hm.put(n, hm.get(n)+1);
                else 
                    hm.put(n, 1);
			}
			for(Map.Entry<Integer,Integer> entry : hm.entrySet())
			{
				if(entry.getValue() == 2)
					System.out.println(entry.getKey());
			}
		}
	}
}