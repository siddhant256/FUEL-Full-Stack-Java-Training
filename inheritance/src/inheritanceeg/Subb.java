package inheritanceeg;

 class Aq
{
	 int a;
	 int b;
  void sub(int a,int b)
  {
	  this.a=a;
	  this.b=b;
	  System.out.println("\n Substraction:");
	  System.out.println(a-b);
	  
  }
}
class B1 extends Aq
{
void add()
{
	int c=a+b;
	
	System.out.println("\n Addition:");
	System.out.println(c);
}
}
class Subb
{
	public static void main(String args[])
			
	{
		B1 b=new B1();
	
		b.sub(25, 28);
		b.add();
		
	}
}
