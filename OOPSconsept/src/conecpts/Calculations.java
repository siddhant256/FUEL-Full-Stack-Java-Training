package conecpts;

public class Calculations 
{
	void add(int a,int b)
	{
	      int c=a+b;
	      System.out.println("Addition:"+c);
	}
	
	void sub(int a,int b)
	{
		int c=a-b;
	      System.out.println("Substraction:"+c);

	}
	
	void mul(int a,int b)
	{
		int c=a*b;
	      System.out.println("Multiplication:"+c);

	}
	
	void div(int a,int b)
	{
		int c=a/b;
	      System.out.println("Division:"+c);

	}
	
	public static void main(String args[])
	{
		Calculations c=new Calculations();
		c.add(25, 28);
		c.sub(28, 25);
		c.div(28,25);
		c.mul(28,25);
		
	}
	
	
	

}
