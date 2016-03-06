import java.util.*;
class MulList
{
	public static void main(String args[])throws Throwable
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextLine())
		{
			String str = src.nextLine();
			//str = str.trim();
            String[] str1 = str.split("\\|");

            String[] a1 = str1[0].trim().split(" ");//trim out more than 1 single space..if not written den exception thrown by Integer.parseInt

            String[] a2 = str1[1].trim().split(" ");
	

            
            for (int i = 0; i <a1.length; i++) 
			{
                System.out.print(Integer.parseInt(a1[i]) * Integer.parseInt(a2[i])+" ");
			}

            System.out.println();
        
		}
	}
}




