import java.util.*;
class TP
{
	public static void main(String args[])
	{
		Scanner src = new Scanner(System.in);
		int n = src.nextInt();
		String str = Integer.toString(n);
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev +=str.charAt(i);
		}
		System.out.println(rev);
		if(rev.equals(str))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}