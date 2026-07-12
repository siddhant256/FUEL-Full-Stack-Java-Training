package Threadeg;

class A extends Thread
{
    public void run()
    {
        for(int i = 1; i <= 5; i++)
        {
            System.out.println("Child Thread: " + i);
        }
    }
}

public class Threadeg1
{
    public static void main(String args[])
    {
        A a = new A();

        a.start();  // Child thread starts

        for(int i = 1; i <= 5; i++)
        {
            System.out.println("Main Thread: " + i);
        }
    }
}