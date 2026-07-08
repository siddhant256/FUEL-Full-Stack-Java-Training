package Encapsulationeg;

class A
{

	private int a=11;
	private int b=25;
	
	
	public void getA()
	{
		System.out.println(a);
		
	}
	
	public void getB()
	{
		System.out.println(b);
		
	}

}
class Enceg
{
	public static void main(String args[])
	{
		A a=new A();
		a.getA();
		a.getB();
	}
}
