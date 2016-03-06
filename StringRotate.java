/*1 string is rotation of other or not
Hello,lloeH
*/

import java.util.*;
class StringRotate
{
	public static void main(String args[])throws Throwable
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextLine())
		{
			String str = src.nextLine();
			String str1[] = str.split(",");
			String strnew = str1[0]+str1[0];
			System.out.println(strnew);
			String sub = str1[1];
			System.out.println(sub);
			if(strnew.contains(sub))
				System.out.println("True");
			else
				System.out.println("False");
		}
	}
}