import java.util.*;
import java.io.*;
class ReadMore
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//Scanner src = new Scanner(System.in);
		
        String str;
        while ((str= br.readLine()) != null) 
		{
           str = str.trim();
			if(str.length() <=55)
			{
				System.out.println(str);
			}
			if(str.length() > 55)
			{
				str = str.trim();
				str = str.replace("\\s+"," ");
				str = str.substring(0,40);
				System.out.println(str.length());
				System.out.println(str);
				int index = str.lastIndexOf(" ");
				System.out.println(index);
				String strnew = str.substring(0,index);
				System.out.println(strnew.length());
				//strnew = strnew+"... <ReadMore>";
				System.out.println(strnew);
			}
		}
	}
}