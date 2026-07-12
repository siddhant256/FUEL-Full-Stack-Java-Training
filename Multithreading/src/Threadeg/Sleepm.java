package Threadeg;

class A2 implements Runnable
{
    public void run()
    {
        for(int i = 1; i <= 5; i++)
        {
            System.out.println("Child Thread: " + i);
        }
    }
}

public class Sleepm
{
    public static void main(String args[])
    {
        A2 a = new A2();
        Thread t = new Thread(a);

        t.start();

        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }

        for(int i = 1; i <= 5; i++)
        {
            System.out.println("Main Thread: " + i);
        }
    }
}