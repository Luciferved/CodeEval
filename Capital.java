/*First letter of Word Capital in String*/
import java.util.*;
class Capital
{
	public static void main(String args[])throws Throwable
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextLine())
		{
			String str = src.nextLine();
			String[] a = str.split(" ");
			String newStr="";
			for(int i=0;i<a.length;i++)
			{
				newStr += Character.toUpperCase(a[i].charAt(0))+a[i].substring(1)+" ";
			}
			System.out.println(newStr);
		}
	}
}