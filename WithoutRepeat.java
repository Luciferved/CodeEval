/*


WITHOUT REPETITIONS
CHALLENGE DESCRIPTION:

In a given text, if there are two or more identical characters in sequence, delete the repetitions and leave only the first character.

For example:

Shellless mollusk lives in wallless house in wellness. Aaaarrghh!

↓

Sheles molusk lives in wales house in welnes. Aargh!
INPUT SAMPLE:

The first argument is a file. The file contains a text.

For example:


1
2
3
4
5
But as he spake he drew the good sword from its scabbard, and smote a 
heathen knight, Jusssstin of thee Iron Valley.
No matttter whom you choose, she deccccclared, I will abide by your 
decision.
Wwwhat is your will?
At his magic speech the ground oppened and he began the path of descent.
I should fly away and you would never see me again.
OUTPUT SAMPLE:

Print to stdout the text in which all repetitions are deleted.

For example:


1
2
3
4
5
But as he spake he drew the god sword from its scabard, and smote a 
heathen knight, Justin of the Iron Valey.
No mater whom you chose, she declared, I wil abide by your decision.
Wwhat is your wil?
At his magic spech the ground opened and he began the path of descent.
I should fly away and you would never se me again.



*/


import java.util.*;
class WithoutRepeat
{
	public static void main(String args[])
	{
		Scanner src = new Scanner(System.in);
		while(src.hasNextLine())
		{
				String str = src.nextLine(); 
				str = str.replaceAll("(.)\\1+","$1");
				System.out.println(str);
				/*
				
				
    (.)  # match any charater ( and capture it )
    \1   # if it is followed by itself 
    +    # One or more times
	{$1}gx;  # And replace the whole things by the first captured character (with g modifier to replace all occurences)
				
				
				*/
		}
	}
}