/*

Running 95%

*/
import java.util.*;
class PrefixEval
{
	public static void main(String args[])
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextLine())
		{
			String str = src.nextLine();
			str = str.replace(" ","");
			System.out.println(eval(str));
		}
	}
	
	public static Integer eval(String str)
	{
		Stack s = new Stack();
		int i = str.length()-1;
		while(i>=0)
		{
		
			if(isDigit(str.charAt(i)))
			{
				Integer digit = (int)s.push((Integer.parseInt(str.charAt(i)+"")));
			}
			else if(isOperator(str.charAt(i)))
			{
				Integer no1 =(int)s.pop();
				Integer no2 =(int)s.pop();
				Integer ev = performOperation(no1,no2,str.charAt(i));
				Integer eval =(int) s.push(ev);
			}
			i--;
		}
		
		return (int)s.peek();
	}
	
	public static boolean isOperator(char ch)
	{
		if(ch =='+' || ch == '*' || ch == '/' || ch == '-')
			return true;
		return false;
	}
	
	public static boolean isDigit(char i)
	{
		if(i>='0' && i<='9')
			return true;
		return false;
	}
	
	public static Integer performOperation(Integer no1,Integer no2,char ch)
	{
		if(ch == '+')
			return no1+no2;
		else if(ch == '-')
			return no1-no2;
		else if(ch == '/')
			return no1/no2;
		else if(ch == '*')
			return no1*no2;
		return -1;
	}
}
