import java.util.*;
class ShortestRep
{
	public static void main(String args[])throws Throwable
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextLine())
		{
			String str = src.nextLine();
			
			for(int i=1;i<=str.length();i++)
			{
				String str1 = str.substring(0,i);
				System.out.println(str1);
				System.out.println("SUBSTRING");
				String[] a = str.split(str1);
				
				System.out.println("SUBSTRING ARRAY");
				for(String s : a)
				{
					System.out.println(s);
                }
				
				boolean flag = true;
				for(String s : a)
				{
				if (!s.isEmpty()) {
                       flag = false;
                        break;
                    }
                }

				System.out.println("LENGTH");
                if (flag) 
				{
                    System.out.println(str1.length());
                    break;
				}
			}
		}
	}
}