/*Sbse 6ota and non repeated number ka "INDEX" find karns hai..

for ex : 3 3 9 1 6 5 8 1 5 3
o/p : 5 coz 6 non repeated hai nd 9,8, k comparison main 6ota hai

agr kch bhi nai den print 0


testcase#1 : 3 3 9 1 6 5 8 1 5 3 -->right aara   ans aara(5)
testcase#2 : 9 2 9 9 1 8 8 8 2 1 1 8 2----> right aara ans aara(0)
testcase3# : 2 2 1 1 4 5 6 7 --->WRONG AARA   ans aara(4) "bt ans aanachahiye(5)" ???????

*/
import java.util.*;
class LowestUnique
{
	public static void main(String args[])
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextLine())
		{
			String str = src.nextLine();
			String splt[] = str.split(" ");
			int a[] = new int[splt.length];
			
			for(int i=0;i<splt.length;i++)
			{
				a[i] = Integer.parseInt(splt[i]);
			}
			
			int b[] = new int[splt.length];

            HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

            for (int i = 0; i < b.length; i++) 
			{
                int n = a[i];
                b[i] = n;

                if (hm.containsKey(n)) 
				{
                    hm.put(n, hm.get(n)+1);
                } 
				else 
				{
                    hm.put(n, 1);
                }
            }
			Arrays.sort(b);
			
			int lu = 0;

            for (int i : b) 
			{
                if (hm.get(i) == 1) 
				{
                    lu = i;
                    break;
                }
            }
			
			if (lu == 0) 
			{
                System.out.println(0);
            } 
			else 
			{   
				for (int i = 0; i < a.length; i++) 
				{
				
					
                    if (a[i] == lu) 
                        System.out.println(i+1);
                }
            }
        }
    }
}