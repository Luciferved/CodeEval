import java.util.*;
class RepeatWord
{
	public static void main(String args[])throws Throwable
	{
		Scanner src = new Scanner(System.in);
		String str = src.nextLine();
		str = str.toLowerCase();
		String[] a = str.split(" ");
		
		Map<String,Integer> hm = new HashMap<String,Integer>();
		
		for(String word:a)
		{
			if(hm.containsKey(word))
				hm.put(word,hm.get(word)+1);
			else
				hm.put(word,1);
		}
		
		for (Map.Entry<String,Integer> entry: hm.entrySet()) 
		{
			if(entry.getValue() > 1)
			System.out.println(entry.getKey()+" " + entry.getValue());
		}
		

		
	}
	
} 

/*


List l = new ArrayList();
		int count = 0;
		for(int i=0;i<a.length;i++)
		{
			if(!l.contains(a[i]))
				l.add(a[i]);
		}
		
		for(int i=0;i<l.size();i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(l.get(i).equals(a[j]))
					count++;
			}
			if(count >1)
			System.out.println(l.get(i)+" "+count);
			count = 0;
		}
*/