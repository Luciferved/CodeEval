import java.util.*;
class NoPair
{
	public static void main(String args[])throws Throwable
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextLine())
		{
			String str = src.nextLine();
			String splt1[] = str.split(";");
			int sum = Integer.parseInt(splt1[splt1.length-1]);
			
			str = str.replaceAll(";.+","");
			String splt[] = str.split(",");
			
			int a[] = new int[splt.length];
			for(int i=0;i<splt.length;i++)
			{
				a[i] = Integer.parseInt(splt[i]);
			}
			boolean flag = false;
			String result = "";
			for(int i=0;i<a.length;i++)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]+a[j] == sum)
					{
						result = result+a[i]+","+a[j]+";";
						flag = true;
					}
				}
			}
			if(flag == true)
			{
				System.out.println(result.substring(0,result.length()-1));
			}
			else
			{
				System.out.println("NULL");
			}		
		}
	}
}