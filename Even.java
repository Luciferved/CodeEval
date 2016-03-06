/*Print Even numbers*/
import java.util.Scanner;
import java.io.File;

class Main { 

	public static void main(String args[])throws Throwable 
	{ 

		Scanner src = new Scanner(System.in);
		while(src.hasNextInt()) 
			System.out.println((src.nextInt()+1) % 2);
              

	}

}
