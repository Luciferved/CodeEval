import java.util.*;
class SpiralPrint
{
	public static void main(String args[])
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextLine())
		{
			String str = src.nextLine();
			String split[] = str.split(";");
			String array = split[split.length-1];
			
			String split1[] = array.split(" ");
			int slen = split1.length;
			int row = Integer.parseInt(split[0]);
			int col = Integer.parseInt(split[1]);
			
			int a[][] = new int[row][col];
			int count = 0;
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					if(count == slen)
					{
						break;
					}
					else
					{
						a[i][j] = Integer.parseInt(split1[count]);
						count++;
					}
				}
			}
			
		/*	for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					System.out.print(a[i][j]);
				}
				System.out.println();
			}
		*/
			spiralPrint(a,row,col);
		}
	}
	
	public static void spiralPrint(int a[][],int row,int col)
	{
		int t=0;
		int l=0;
		int b = row-1;
		int r = col-1;
		int dir = 0;
		
		while(t<=b && l<=r)
		{
			if(dir == 0)
			{
				for(int i=t;i<=r;i++)
				{
					System.out.print(a[t][i]+" -> ");
					System.out.println("row : "+t+" col : "+i);
				}t++;
			}
			else if(dir == 1)								
			{
				for(int i=t;i<=b;i++)
				{
					System.out.print(a[i][r]+" -> ");
					System.out.println("row : "+i+" col : "+r);
				}r--;
			}
			else if(dir == 2)								
			{
				for(int i=r;i>=l;i--)
				{
					System.out.print(a[b][i]+" -> ");
					System.out.println("row : "+b+" col : "+i);
				}b--;
			}
			else if(dir == 3)								
			{
				for(int i=b;i>=t;i--)
				{
					System.out.print(a[i][l]+" -> ");
					System.out.println("row : "+i+" col : "+l);
				}l++;
			}
			dir = (dir+1)%4;
		}
		System.out.println();
	}
}