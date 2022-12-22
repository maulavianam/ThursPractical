interface Printable
{	
	void display();
}

interface Calculate
{
	int cal(int num);
}

class Square implements Printable, Calculate
{	
	public void display() 	
	{		
		System.out.println("Square of a number is = ");	
	}	

	public int cal(int num)	
	{		
		return num*num;	
	}
}

class Cube
{	
	public void display() 	
	{		
		System.out.println("Cube of a number is = ");	
	}	
	public int cal(int num)	
	{		
		return num*num*num;	
	}
} 

public class TwoInterfaceDiffClass 
{ 	
	public static void main(String[] args) 	

	{	
		
		Square sq = new Square();		
		sq.display();		
		System.out.println(sq.cal(5));			
		Cube c = new Cube();
		c.display();		
		System.out.println(c.cal(5));	
	} 
}