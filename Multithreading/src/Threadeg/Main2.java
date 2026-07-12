package Threadeg;

class Main2
{
    public static void main(String args[])
    {
        A22 t1 = new A22();
        A22 t2 = new A22();
        A22 t3 = new A22();

        t1.start();
        t2.start();
        t3.start();

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

class A22 extends Thread
{
    public void run()
    {
        System.out.println("A");
    }
}