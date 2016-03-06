import java.util.*;
class StringPermu
{
	public static void main(String args[])
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextLine())
		{
			String str = src.next();
			permu(str.toCharArray(),0);
		}
	}
	
	private static void permu(char[] c,int cur)
	{
		TreeSet ts = new TreeSet();
		if(cur == c.length-1)
		{
			String str= new String(c);
			//System.out.print(newstr+",");
			ts.add(str);
			System.out.println(ts);
				
			return;
		}
		permu(c,cur+1);
		
		
		for(int i=cur+1;i<c.length;i++)
		{
			char temp = c[cur];
			//System.out.println("TEMP : "+temp);
			c[cur] = c[i];
			//System.out.println("cur : "+c[cur]);
			c[i] = temp;
			//System.out.println("c of i : "+c[i]);
			permu(c,cur+1);
		}	
	}
}
			