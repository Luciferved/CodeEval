import java.util.*;
class PP
{
	public static void main(String args[])throws Throwable
	{
	
		Scanner src = new Scanner(System.in);
		for(int i=1;i< 1000;i++)
		{
			if(isPrime(i))
				System.out.println(i);
			
		}
	}
	
	public static boolean isPrime(int n)
	{
		for(int i=2;i<1000;i++)
			if(1000%i == 0)
				return false;
		return true;
	}
}
				
			