package eg;

 class A
{
void fun()
{
	System.out.println("Parent Class:");
}
}
class B extends A
{
	@Override
	void fun()
	{
		System.out.println("Child Class:");
	}
}

class Annotatons 
{
public static void main(String args[])
{
	A a=new A();
	B b=new B();
	a.fun();
	b.fun();
}
}