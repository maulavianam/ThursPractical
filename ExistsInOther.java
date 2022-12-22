import java.util.Scanner;

public class ExistsInOther {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First Text : ");
		String s=sc.nextLine();
		
		System.out.println("Enter Second Text : ");
		String s2=sc.nextLine();
		
		if(s.contains(s2))
		{
			System.out.println("\nFirst String Exists in Second String");
		}
		else
		{
			System.out.println("\nFirst String does not Exists in Second String");
		}
		
	}

}
