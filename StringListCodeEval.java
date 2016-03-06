import java.util.*;
class StringListCodeEval
{
	public static void main(String args[])
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextLine())
		{
			String str = src.next();
			//String str1[] = str.split(",");
			//String strn = str1[1];
			printAllKLength(str.toCharArray(),str.length());
		
		}
	}
	
	private static void printAllKLength(char set[], int k) 
	{
        int n = set.length;        
        printAllKLengthRec(set, "", n, k);
    }
 
    // The main recursive method to print all possible strings of length k
    static void printAllKLengthRec(char set[], String prefix, int n, int k) 
	{
         
        // Base case: k is 0, print prefix
        if (k == 0) {
            System.out.println(prefix);
            return;
        }
 
        // One by one add all characters from set and recursively 
        // call for k equals to k-1
        for (int i = 0; i < n; ++i) {
             
            // Next character of input added
            String newPrefix = prefix + set[i]; 
             
            // k is decreased, because we have added a new character
            printAllKLengthRec(set, newPrefix, n, k - 1); 
        }
    }
}
			