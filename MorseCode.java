import java.util.*;
import java.io.*;
class MorseCode
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Scanner src = new Scanner(System.in);
		int n = Integer.parseInt(br.readLine());//src.nextInt();
		while(n>0)
		{
			String str = br.readLine();
			str = str.trim();
			String[] b = str.split(" ");
			for (String s : b) 
			{
				System.out.print(decrypt(s));
			}
			System.out.println();
		n--;
		}
		  
	}
	
	private static char decrypt(String str)
    {
        if (str.equals(".-")) {
            return 'A';
        } else if (str.equals("-...")) {
            return 'B';
        } else if (str.equals("-.-.")) {
            return 'C';
        } else if (str.equals("-..")) {
            return 'D';
        } else if (str.equals(".")) {
            return 'E';
        } else if (str.equals("..-.")) {
            return 'F';
        } else if (str.equals("--.")) {
            return 'G';
        } else if (str.equals("....")) {
            return 'H';
        } else if (str.equals("..")) {
            return 'I';
        } else if (str.equals(".---")) {
            return 'J';
        } else if (str.equals("-.-")) {
            return 'K';
        } else if (str.equals(".-..")) {
            return 'L';
        } else if (str.equals("--")) {
            return 'M';
        } else if (str.equals("-.")) {
            return 'N';
        } else if (str.equals("---")) {
            return 'O';
        } else if (str.equals(".--.")) {
            return 'P';
        } else if (str.equals("--.-")) {
            return 'Q';
        } else if (str.equals(".-.")) {
            return 'R';
        } else if (str.equals("...")) {
            return 'S';
        } else if (str.equals("-")) {
            return 'T';
        } else if (str.equals("..-")) {
            return 'U';
        } else if (str.equals("...-")) {
            return 'V';
        } else if (str.equals(".--")) {
            return 'W';
        } else if (str.equals("-..-")) {
            return 'X';
        } else if (str.equals("-.--")) {
            return 'Y';
        } else if (str.equals("--..")) {
            return 'Z';
        } else if (str.equals("-----")) {
            return '0';
        } else if (str.equals(".----")) {
            return '1';
        } else if (str.equals("..---")) {
            return '2';
        } else if (str.equals("...--")) {
            return '3';
        } else if (str.equals("....-")) {
            return '4';
        } else if (str.equals(".....")) {
            return '5';
        } else if (str.equals("-....")) {
            return '6';
        } else if (str.equals("--...")) {
            return '7';
        } else if (str.equals("---..")) {
            return '8';
        } else if (str.equals("----.")) {
            return '9';
        }

		
return '\0';
	}
}