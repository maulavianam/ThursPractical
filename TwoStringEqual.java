//Q1
import java.util.Scanner;

public class TwoStringEqual
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first string : ");
		String str=sc.next();
		
		
		System.out.println("Enter second string : ");
		String str2=sc.next();
		
		System.out.println("\nBoth the strings are same : ");

		
		if (str.equals(str2) == true) 
			
		{
			System.out.println("True");
		}
		else 
		{
			System.out.println("False");
		}
	}
}


