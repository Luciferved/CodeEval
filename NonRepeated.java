import java.util.*;
/*First nonrepeated letter*/
class NonRepeated
{
	public static void main(String args[])throws Throwable
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextLine())
		{
			String str = src.nextLine();
			//char[] str1 = str.toCharArray();
			HashMap<Character,Integer> hs = new HashMap<Character,Integer>();
			Character c='\0';
			
			for(int i=0;i<str.length();i++)
			{
				c = str.charAt(i);
				if(hs.containsKey(c))
					hs.put(c,0);
				else
					hs.put(c,1);
			}
			for(int i=0;i<str.length();i++)
			{
				c = str.charAt(i);
				if(hs.get(c)==1)
					break;
					
			}
			System.out.println(c);
			
			
			
		}
	}
}

/*

occurence of every letter

for(int i=0;i<str.length();i++)
			{
				c = str.charAt(i);
				if(hs.containsKey(c))
					hs.put(c,0);
				else
					hs.put(c,1);
			}
			for  (Map.Entry<Character,Integer> e : hs.entrySet()) 
			{
				System.out.println(e.getKey()+"="+e.getValue());
			}


			
			*/