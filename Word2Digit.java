import java.util.*;
class  Word2Digit
{
	public static void main(String args[])throws Throwable
	{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//string line;
		Scanner src = new Scanner(System.in);
		//while(line=br.readLine() !=null)
		while(src.hasNextLine())
		{
			String str = src.nextLine();
			String[] a = str.split(";");
			HashMap<String,String> hm = new HashMap<String,String>();
			hm.put("zero","0");
			hm.put("one","1");
			hm.put("two","2");
			hm.put("three","3");
			hm.put("four","4");
			hm.put("five","5");
			hm.put("six","6");
			hm.put("seven","7");
			hm.put("eight","8");
			hm.put("nine","9");
			
			
			for(int i=0;i<a.length;i++)
			{
				for(Map.Entry<String,String> entry : hm.entrySet())
				{
					if(a[i].equals(entry.getKey()))
						System.out.print(entry.getValue());
				}
			}
			System.out.println();
		}
	}
}