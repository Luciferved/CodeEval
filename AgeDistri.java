import java.util.*;
class AgeDistri
{
	public static void main(String args[])
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextInt())
		{
			int n = src.nextInt();
			if(n>=0 && n <=2)
			{
				System.out.println("Still in Mama's arms");
			}
			else if(n==3 || n==4)
			{
				System.out.println("Preschool Maniac");
			}
			else if(n>=5 && n<=11)
			{
				System.out.println("Elementary school");
			}
			else if(n>=12 && n<=14)
			{
				System.out.println("Middle school");				
			}
			else if(n>=15 && n<=18)
			{
				System.out.println("High school");
			}
			else if(n>=19 && n<=22)
			{
				System.out.println("College");
			}
			else if(n>=23 && n<=65)
			{
				System.out.println("Working for the man");
			}
			else if(n>=66&& n<=100)
			{
				System.out.println("The Golden Years");
			}
			else
			{
				System.out.println("This program is for humans");
			}
		}
	}
}
			