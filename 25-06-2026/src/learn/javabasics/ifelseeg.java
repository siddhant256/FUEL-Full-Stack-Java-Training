package learn.javabasics;

public class ifelseeg {
	
	public static void main(String args[])
	{
		int a=10;
		int b=20;
		int c=30;
		int small=a;
		
		if(b<small ) 
		{
			small=b;
			
		//System.out.println("B is Small");
		
		}
		if(c<small ) 
		{
		small=c;	
		}
		System.out.println("Smallest:"+small);
	}
	

}
