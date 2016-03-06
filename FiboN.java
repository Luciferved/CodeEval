import java.util.*;
class FiboN
{
	public static void main(String args[])throws Throwable
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextInt())
		{
			long n = src.nextLong ();
			if( n == 0)
				System.out.println(0);
	
			else if(n==1)
				System.out.println(1);
			else
			{
				long a = 0;
				long b = 1;
				long c;
				for (long i = 2; i <= n; i++)
				{
					 c = a + b;
					 a = b;
					 b = c;
				}
				System.out.println(b);
			}	
			
		}
	}
}
		/*
		
		Partially----95/100	
			
			
			int[] fibo = new int[n+1];
			
			if(n<=1)
				System.out.println(1);
			else
			{
				fibo[0] = 0;
			fibo[1] = 1;
				for(int i=2;i<=n;i++)
				{
					fibo[i] = fibo[i-1]+fibo[i-2];
				}
				System.out.println(fibo[n]);
			}
			
			*/