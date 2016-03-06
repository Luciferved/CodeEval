import java.util.*;
class Distance
{
	public static void main(String args[])throws Throwable
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextLine())
		{
			String str = src.nextLine();
			 String[] str1 = str.substring(1,str.length()-1).split("\\) \\(");
			 int a[] = intValue(str1[0]);
			 int b[] = intValue(str1[1]);
			 System.out.println(Distance(a,b));
		}
	}
	
	public static int[] intValue(String str1)
	{
		int ival[] = new int[2];
		String[]  str = str1.split(", ");
		for(int i=0;i<str.length;i++)
		{
			ival[i] = Integer.parseInt(str[i]);
		}
		return ival;
	}
	
	
	 public static int Distance(int[] a, int[] b) 
	 {
                return (int) Math.sqrt(Math.pow(a[0]-b[0], 2) + Math.pow(a[1]-b[1], 2));
        }
}
		