package conecpts;

public class Constructor 
{
	Constructor(int a,int b)
	
	{
		 int c=a+b;
		System.out.println("Addition:"+c);
		
	}
    
	Constructor(double  a,double b)
	
	{
		double c=a-b;
		System.out.println("Sub:"+c);
		
	}
	
	public static void main(String args[])
	{
		Constructor c=new Constructor(10,20);
		Constructor ci=new Constructor(20.0,10.0);
		
		
	}
}
