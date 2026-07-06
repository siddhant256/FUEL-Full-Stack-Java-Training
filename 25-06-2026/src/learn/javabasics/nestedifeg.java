package learn.javabasics;

public class nestedifeg 
{
	public static void main(String arg[])
	{
		int a=10;
		int b=20;
		int c=30;
		
		if(a<b && a<c )
		{
			System.out.println("A is Smaller");
			
		}
		else if (b<a  && b<c )
		{
			System.out.println("B is Smaller");

		}
		else 
		{
			System.out.println("C is Smaller");
			
		}
	}
	

}
