import java.util.*;
class CashRegister
{
	public static void main(String args[])
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextLine())
		{
			String str = src.nextLine();
			String a[] = str.split(";");
			HashMap<String,Double> hm = new HashMap<String,Double>();
			hm.put("PENNY",.01);
			hm.put("NICKEL",.05);
			hm.put("DIME",.10);
			hm.put("QUARTER",.25);
			hm.put("HALF DOLLAR",.50);
			hm.put("ONE",1.0);
			hm.put("TWO",2.0);
			hm.put("FIVE",5.0);
			hm.put("TEN",10.0);
			hm.put("TWENTY",20.0);
			hm.put("FIFTY",50.0);
			hm.put("ONE HUNDRED",100.0);
			
			Double sub = Double.parseDouble(a[0])-Double.parseDouble(a[a.length-1]);
			Double roundval = Math.round(100*sub)/100d;
		
			//System.out.println(roundval);
			for(Map.Entry<String,Double> entry : hm.entrySet())
			{
				if(entry.containsValue(roundVal))
				{
					System.out.println(entry.getKey());
				}
			}
		}
	}
}
			
			