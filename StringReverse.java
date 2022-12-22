import java.util.Scanner;

public class StringReverse 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		String str=sc.nextLine();
		
		StringBuilder revup=new StringBuilder(str);
		
		revup.reverse();
		String revs=revup.toString();
		
		System.out.println("The reversed string is - "+revs);
		
		System.out.println("The Uppercase of the string is - "+str.toUpperCase());
		
	}

}
