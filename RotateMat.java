/*

	MATRIX ROTATION
CHALLENGE DESCRIPTION:

You are given a 2D N×N matrix. Each element of the matrix is a letter: from ‘a’ to ‘z’. Your task is to rotate the matrix 90° clockwise:

a b c        g d a
d e f  =>    h e b
g h i        i f c
INPUT SAMPLE:

The first argument is a file that contains 2D N×N matrices, presented in a serialized form (starting from the upper-left element), one matrix per line. The elements of a matrix are separated by spaces.

For example:

a b c d
a b c d e f g h i j k l m n o p
a b c d e f g h i
OUTPUT SAMPLE:

Print to stdout matrices rotated 90° clockwise in a serialized form (same as in the input sample).

For example:

c a d b
m i e a n j f b o k g c p l h d
g d a h e b i f c
CONSTRAINTS:

The N size of the matrix can be from 1 to 10
The number of test cases is 100

*/
	
import java.util.*;
import java.io.*;
class RotateMat
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Scanner src = new Scanner(System.in);
		String str;
		//int t = Integer.parseInt(br.readLine());
		while((str = br.readLine())!=null)
		{
			//str = br.readLine();
			
			String split[] = str.split(" ");
			int len = (int)Math.sqrt(split.length);
			//System.out.println(len);
			String a[][] = new String[len][len];
			int pos = 0;
			for(int i=0;i<len;i++)
			{
				for(int j=0;j<len;j++)
				{
					a[i][j] = split[pos++];
					//System.out.println(i+" "+j);
					//pos++;
				}
				if(pos == split.length)
					break;
				//else
					//pos++;
			}
			rotate(a,len);
			/*System.out.println("Matrix");
			for(int i=0;i<len;i++)
			{
				for(int j=0;j<len;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}*/
		}
	}
	
	public static void rotate(String input[][],int len)
	{
		//int n =input.length();
		//int m = input[0].length();
		String [][] output = new String[len][len];

		for (int i=0; i<len; i++)
		{
			for (int j=0;j<len; j++)
			{
				output [j][len-1-i] = input[i][j];
				//System.out.println(j+" "+i+" "+(len-1-i)+" "+output [j][len-1-i]);
			}
		}
		
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
				System.out.print(output[i][j]+" ");
			}
			
		}
		System.out.println();
	}
}