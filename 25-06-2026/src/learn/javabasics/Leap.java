package learn.javabasics;

import java.util.Scanner;

public class Leap {

	public static void main(String args[])
	{
		Scanner c=new  Scanner(System.in);
				
		System.out.println("Enter Year:");
		int yr=c.nextInt();
		
		if(yr % 400 == 0)
		{
			System.out.println("This Is Laep Year");
			
		}
		else if(yr % 100 == 0)
		{
			System.out.println("This Is NOT  Laep Year");
	
		}
		
		else if(yr % 4 == 0)
		{
		System.out.println("This Is Laep Year");
		}
		
		else {
			System.out.println("NoT laep yaer");
			
		}
	}
}
