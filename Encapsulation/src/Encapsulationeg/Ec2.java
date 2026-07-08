package Encapsulationeg;


class A1
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

}
class Ec2
{
	public static void main(String args[])
	{
		A1 a=new A1();
		System.out.println(a.getA());
		System.out.println(a.getB());
	}
}



