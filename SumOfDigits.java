import java.util.*;
import java.io.*;

class Main
{
    public static void main (String[] args)throws Throwable
    {
       Scanner src = new Scanner(System.in);
	   while(src.hasNextInt())
        {
			System.out.println(sum(src.nextInt()));
        }
    }
    

    public static int sum(int n)
    {
       int r,sum=0;
		while(n!=0)
		{
		  r = n%10;
		  sum = sum+r;
		  n = n/10;
		}
       
        return sum;
    }
}