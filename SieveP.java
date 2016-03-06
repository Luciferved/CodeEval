import java.util.*;
class SieveP
{
	public static void main(String args[])throws Throwable
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextInt())
		{
			int n = src.nextInt();
			System.out.print(2);
			for(int i=3;i<n;i++)
			{
				if(isPrime(i))
					System.out.print(","+i);
			}
			System.out.println();
		}
		src.close();
	}
	
	/*public static boolean isPrime(int n)
	{
		if(n % 2 == 0 && n != 2)
			return false;
		else 
		{
			int i = 2;
			boolean result = false;
			while(i*i <= n && result==false) 
			{
				if(n % i == 0)
					result = true;
				i++;
			}
		return (result==false);
		}
	}*/
	
	private static boolean isPrime(int n)
    {
		if (n <= 1) 
	   {
			return false;
       }
	
        for (int i = 2; i*i<= n; i++)
            if (n % i == 0)
                return false;
        return true;
    }
}

