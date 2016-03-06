/*Print string in lowercase*/
import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner src = new Scanner(System.in);
		int n = src.nextInt();
		while(n!=0)
		{
		String str = (src.nextLine()).toLowerCase();
		System.out.println(str);
		n--;
		}
	}
}