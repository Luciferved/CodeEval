/*

The first argument is a path to a file. The file contains the series of space delimited characters followed by an integer. 
The integer represents an index in the list (1-based), one per line.

For example:	a b c d 4		--	a
				e f g h 2		--	g
*/
import java.util.*;
class LastEle
{
	public static void main(String args[])throws Throwable
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextLine())
		{
			String str = src.nextLine();
			String splt[] = str.split(" ");
			int len = Integer.parseInt(splt[splt.length-1]);	//integer
			String last = splt[splt.length-1];		
			int lastlen = last.length();						//length of integer
			str = str.substring(0,str.length()-lastlen);		// substring uptil integer
			//System.out.println("String "+str);
			str = str.replace(" ","");							//length of str without whitespace
			//System.out.println("String "+str);
			int length = str.length();							//new length of str
			int pos = length-len;								// final position from last to integer
			List<String> al = Arrays.asList(splt);
			
			//System.out.println("Lem : "+len);
			//System.out.println("Size Al : "+al.size());
			if(len > al.size() || len < 1)	
			{
				continue;	
			}
			else
			{
				System.out.println(al.get(pos));
			}
		}
	}
}
			