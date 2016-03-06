import java.util.*;
class ReverseGroup
{
	public static void main(String arga[])
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextLine())
		{
			String str = src.nextLine();
			String dup = str;
			dup = str.replaceAll(";[0-9]*","");
			//System.out.println(dup);
			String dup1[] = dup.split(",");
			
			str = str.replace(",","");
			String str1[] = str.split(";");
			int pos = Integer.parseInt(str1[str1.length-1]);
			int len = pos;
			for(int i=0;i<len-1;i++)
			{
				dup1[i] = str1[len-1];
				len--;
			}
			for(String i:dup1)
			{
				System.out.println(i);
			}
		}
	}
}
			
			