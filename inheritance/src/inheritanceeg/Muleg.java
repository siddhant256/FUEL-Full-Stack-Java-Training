package inheritanceeg;

class A25
{
	int a,b;
	
 void add(int a,int b)
 {
	 this.a=a;
	 this.b=b;
	 System.out.println("Addition:"+(a+b));
 }
}

class B25 extends A25
{
	void sub()
	{
		
		System.out.println("Substraction:"+(a-b));
	}
}

class C25 extends B25
{
	void mul()
	{
	
	System.out.println("Multipliation:"+(a*b));
	}
	
}

class Muleg
{
	public static void main(String args[])
	{
		C25 c=new C25();
		c.add(10,20);
		c.sub();
		c.mul();
	}
}
