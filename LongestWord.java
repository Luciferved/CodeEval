/*Longest Word in String */
import java.util.*;
class LongestWord
{
	public static void main(String args[])throws Throwable
	{
		Scanner src = new Scanner(System.in);
		
		while(src.hasNextLine())
		{
			String str = src.nextLine();
			String[] a = str.split(" ");
			String largest="";
			int max = 0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i].length() > largest.length())
				{
					largest = a[i];
					max = a[i].length();
				}
			}
			System.out.println(largest);
		}	
	}
}
			
/*

String str=src.nextLine();
				
			String max = null; 
			str=str+ ' '; 
			String word = ""; 
			int maxlen=0; 
			for(int i=0;i<str.length()-1;i++) 
			{ 
				
				word=word+str.charAt(i);
				if(str.charAt(i+1)==' ') 
				{ 
					if(word.length()> maxlen) 
					{ 
						max= new String(word); 
						maxlen=word.length();
					} 
				word="";
				i++;
				S
				System.out.printn(i)
				} 
			} 
		System.out.println(max);

*/



