package Examples;
class A1 extends Thread
	{
	    public void run()
	    {
	        for(int i = 1; i <= 5; i++)
	        {
	            System.out.println("Child Thread: " + i);
	        
	        try
	        {
	        	Thread.sleep(1000);
	        }
	        catch(InterruptedException e)
	        {
	        	System.out.println(e);
	        }
	        }
	    }
}

class B2 extends Thread
{
	public void run()
    {
        for(int i = 1; i <= 5; i++)
        {
            System.out.println("Parent Thread: " + i);
        
        try
        {
        	Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
        	System.out.println(e);
        }
        }
        
    }
}
class Threadeg
{
	public static void main(String args[])
	{
		A1 a=new A1();
		B2 b=new B2();
		a.start();
		b.start();
	}
}