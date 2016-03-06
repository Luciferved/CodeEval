import java.util.*;
class StringSub
{
	public static void main(String args[])
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextLine())
		{
			String str = src.nextLine();
			String split[] = str.split(";");
			String org = split[0];
			
			String exchng = split[split.length-1];
			String excSplit[] = exchng.split(",");
			for(int i=0;i<excSplit.length-1;i+=2)
			{
				if(org.contains(excSplit[i]))
				{
					String st = excSplit[i];
					int len = st.length();
					String st2 = excSplit[i+1];
					
					index= org.indexOf(st);
		
					String sub = org.substring(index,index+len);
					org = org.replace(sub,excSplit[i+1]);
					
					
				}
			}
			System.out.println(org);
		}
	}
}