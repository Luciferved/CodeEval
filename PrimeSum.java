/*sum of first 1000 prime number*/
import java.util.*;
class PrimeSum
{
	public static void  main(String args[])throws Throwable
	{
		int n = 2;
		long sum=0;
		//int count = 0;
		/*while(count<1000)
		{
			if(isPrime(n))
			{
				sum += n;
				count++;
			}
			n++;
		}*/
		
		for(int c = 0;c<1000;n++)
		{
			if(isPrime(n))
			{
			sum += n;
			c++;
			}
		}
		System.out.println(sum);
	}
	
	private static boolean isPrime(int n)
	{
		for(int i=2;i<=n/2;i++)
			if(n%i == 0)
				return false;
			return true;
	}
}