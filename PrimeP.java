import java.util.*;
class PrimeP
{
	public static void main(String args[])throws Throwable
	{
		Scanner src = new Scanner(System.in);
		int large = 2;
		for(int i=3;i<1000;i++)
		{
			if(isPrime(i) && isPallin(i))
				large = i;
		}
		System.out.println(large);
	}
	
	private static boolean isPrime(int n)
	{
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i == 0)
				return false;
		}
		return true;
	}
	
	private static boolean isPallin(int n)
	{
		String str = Integer.toString(n);
		String rev = "";
		for(int i=str.length()-1;i>=0;i--)
			rev+=str.charAt(i);
			
		if(rev.equals(str))
			return true;
		else
			return false;
	}
}