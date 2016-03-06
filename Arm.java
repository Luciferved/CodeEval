/*Armstrong no or not*/
import java.util.*;
class Arm
{
	public static void main(String args[])throws Throwable
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextInt())
		{
			System.out.println(ArmStrong(src.nextInt()));
		}
	}
	
	private static String ArmStrong(int n)
	{
		int c = n;
		int m = n;
		int ar = n;
		int sum =0;
		int count = 0;
		while(c!=0)
		{
			int r = c%10;
			count++;
			c = c/10;
		}
		while(ar!=0)
		{
			int r = ar%10;
			sum = sum+(int)Math.pow(r,count);
			ar = ar/10;
		}
		
		if(m==sum)
			return "True";
		return "False";
	}
}
		