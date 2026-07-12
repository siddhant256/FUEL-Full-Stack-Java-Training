	package Threadeg;
	
	class A1 implements Runnable
	{
	    public void run()
	    {
	        for(int i = 1; i <= 5; i++)
	        {
	            System.out.println("Child Thread: " + i);
	        }
	    }
	}
	
	public class Run
	{
	    public static void main(String args[])
	    {
	        A1 a = new A1();
	        Thread t=new Thread(a);
	 
	
	        t.start();  // Child thread starts
	       // t.sleep(1000);
	        for(int i = 1; i <= 5; i++)
	        {
	            System.out.println("Main Thread: " + i);
	        }
	    }
	}
