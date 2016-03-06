import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Jason
{
	public static void main(String args[])throws Throwable
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextLine())
		{
			String str = src.nextLine();
			Pattern p = Pattern.compile("\"id\": (\\d+), \"label\"");
			Matcher m = p.matcher(str);
			int sum = 0;
			while(m.find())
			{
				sum+=Integer.parseInt(m.group(1));
			}
			System.out.println(sum);
		}
	}
}