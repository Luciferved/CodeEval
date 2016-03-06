/*Multiplication table upto 12*/
import java.util.*;
class Multi
{
	public static void main(String args[])throws Throwable
	{
		Scanner src = new Scanner(System.in);
		
		for(int i=1;i<=12;i++)
		{
			for(int j=1;j<=12;j++)
			{
				 System.out.print(String.format("%5d", i*j));////%d is used to format decimals like integers
			}
			System.out.println();
		}
		
	}
}

/*


String.format "%[argument number] [flags] [width] [.precision] type"

Now let's see what is meaning of each part of formatting instruction. "%" is a special character in formatted String and it denotes start of formatting instruction. String.format() can support multiple formatting instruction with multiple occurrence of "%" character in formatting instruction.

"argument number" is used to specify correct argument in case multiple arguments are available for formatting. "flags" is another special formatting instruction which is used to print String in some specific format for example you can use flag as "," to print comma on output. "width" formatting option denotes minimum number or character will be used in output but in case if number is larger than width then full number will be displayed but if its smaller in length then it will be be padded with zero. "precision" is using for print floating point formatted String, by using precision you can specify till how many decimal a floating point number will be displayed in formatted String. "type" is the only mandatory formatting option and must always comes last in format String also input String which needs to be formatted must be with same type specified in "type" parameter. for example you can not input a floating point number if you have specified "type" as decimal integer "%d", that will result in error. Now let's see an example of String format() method to understand these formatting option better:

format ( "%,6.2f", 124.000)

In above example of  String.format() method flag is comma "," , widt
h is 6 and precision is upto 2 decimal point and type is float.




common meta characters used in String.format() and
System.out.printf() \
method: 
%s - String , 
%d - decimal integer
%f - float  
%tD - date as MM/dd/yy while %td is day %tm is monthand %ty is 2 digit year while %tY is four digit year
 
 
EXAMPLE:

String formattedString = String.format("Order with OrdId : %d and Amount: %d is missing", 40021, 3000);       

      
 System.out.println(formattedString); 

    
        System.out.printf("Order with OrdId : %d  and Amount: %d is missing \n", 40021, 3000);
      
        //%s is used to denote String arguments in formatted String
        String str = String.format("Hello %s", "Raj");
        System.out.println(str);
      
        //if argument is not convertible into specified data type than
 //Formatter will throw following java.util.IllegalFormatConversionException

        //e.g. specifying %d and passing 3.0
      
        //str = String.format("Number %d", 3.0);





*/