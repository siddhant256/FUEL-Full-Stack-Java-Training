package inheritanceeg;

class a 
{
void ds()
{
	System.out.println("Parent ");
	
}
}

class  b extends a
{
void ds1()
{
	System.out.println("Child");
	
}
}

class  c extends b
{
void ds2()
{
	System.out.println("SubClass");
	
}
}

class  d extends b
{
void ds3()
{
	System.out.println("SubChild Class");
	
}
}

class Hybrid
{
	
	public static void main(String args[] )
	{
	    c cc = new c();
	    d dd = new d();

	    System.out.println("Object of C");
	    cc.ds();
	    cc.ds1();
	    cc.ds2();

	    System.out.println();

	    System.out.println("Object of D");
	    dd.ds();
	    dd.ds1();
	    dd.ds3();
	}
		
		
	}
	
