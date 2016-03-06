import java.util.*;
class RemoveChar
{
	public static void main(String args[])throws Throwable
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextLine())
		{
			String str = src.nextLine();
			String[] a = str.split(", ");
			
			String temp = a[0].trim();
			String temp1 = a[1].trim();	
	
			 for (char c : temp1.toCharArray()) 
			 {
				if (temp.contains(String.valueOf(c))) 
				{
					temp = temp.replace(c+"","");
				}
			}	
				System.out.println(temp);
		}
	}
}
				
				
				