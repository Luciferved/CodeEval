import java.util.*;
import java.io.*;
import java.math.*;
class DeltaTime
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while((str = br.readLine())!= null)
		{
			//String str = br.readLine();
			String split[] = str.split(" ");
			String one = split[0];
			String two = split[split.length-1];
			System.out.println(diff(one,two));
		}
	}
	
	public static String diff(String one,String two)
	{
		String str1 = one;
		String str2 = two;
		String split1[] = str1.split(":");
		String split2[] = str2.split(":");
		String result = Math.abs(Integer.parseInt(split1[0])-Integer.parseInt(split2[0]))+":"+Math.abs(Integer.parseInt(split1[1])-Integer.parseInt(split2[1]))+":"+Math.abs(Integer.parseInt(split1[split1.length-1])-Integer.parseInt(split2[split2.length-1]))+"";
		return result;
	}
}