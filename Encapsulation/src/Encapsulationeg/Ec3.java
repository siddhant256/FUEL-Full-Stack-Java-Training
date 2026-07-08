package Encapsulationeg;

class A3
{

	private int a=11;
	private int b=25;
	
	
	public int getA()
	{
		return a;
		
	}
	
	public int getB()
	{
		return b;
		
	}
	
	public void seta(int a)
	{
		this.a=a;
		
	}
	public void setb(int b)
	{
		this.b=b;
		
	}

}
class Ec3
{
	public static void main(String args[])
	{
		A3 a=new A3();
		a.seta(25);
		a.setb(20);
		System.out.println(a.getA());
		System.out.println(a.getB());
	}
}



