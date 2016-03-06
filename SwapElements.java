/*

You are given a list of numbers which is supplemented with positions that have to be swapped.

INPUT SAMPLE:

Your program should accept as its first argument a path to a filename. Input example is the following

1 2 3 4 5 6 7 8 9 : 0-8
1 2 3 4 5 6 7 8 9 10 : 0-1, 1-3
As you can see a colon separates numbers with positions. 
Positions start with 0. 
You have to process positions left to right. In the example above (2nd line) first you process 0-1, then 1-3.

OUTPUT SAMPLE:

Print the lists in the following way.

9 2 3 4 5 6 7 8 1
2 4 3 1 5 6 7 8 9 10


*/
import java.util.*;
class SwapElements
{
	public static void main(String args[])
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextLine())
		{
			String str = src.nextLine();	
			str = str.replaceAll("[-, ]+"," ");
			int index = str.indexOf(':');
			String beg = str.substring(0,index);
			String beg1[] = beg.split(" ");
			int a[] = new int[beg1.length];
			
			for(int i=0;i<beg1.length;i++)
			{
				a[i] = Integer.parseInt(beg1[i]);
			}
			
			String end = str.substring(index+2,str.length());
			String end1[] = end.split(" ");
			
			
			
			/*Problem in tis for loop....i-i+1,,,not perfect combination   hence multiplied 2*i and 2*i+1 */
			for(int i=0;i<end1.length/2;i++)
			{
				int n = Integer.parseInt(end1[2*i]);
				int m = Integer.parseInt(end1[2*i+1]);
				
				int temp = a[n];
				a[n] = a[m];
				a[m] = temp;
			}
			
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]);

                if (i == a.length-1) {
                    System.out.println();
                } else {
                    System.out.print(" ");
                }
				
			}
		}	
	}
}

/*

IN THIS OPERATION NOTICE HOW SPLIT IS USED


import java.util.*;
class SwapElements
{
	public static void main(String args[])
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextLine())
		{
			String str = src.nextLine();
			String str1[] = str.split(":");
            String beg1[] = str1[0].trim().split(" ");
            String end[] = str1[1].trim().split(",");

			int a[] = new int[beg1.length];
			
			for(int i=0;i<beg1.length;i++)
			{
				a[i] = Integer.parseInt(beg1[i]);
			}
			
			
            for (int i=0;i<end.length;i++) 
			{
                String pos = end[i].trim();
                String end1[] = pos.split("-");
				int n = Integer.parseInt(end1[0]);
				int m = Integer.parseInt(end1[1]);
				int tmp = a[n];
				a[n] = a[m];
				a[m] = tmp;
            }
			
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]);

                if (i == a.length-1) {
                    System.out.println();
                } else {
                    System.out.print(" ");
                }
				
			}
		}	
	}
}*/