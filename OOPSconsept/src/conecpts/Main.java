package conecpts;

class A
{
    A()
    {
        System.out.println("Hi");
    }
}

class B extends A
{
    B()
    {
        super();
        System.out.println("Hello");
    }
}

 class Main
{
    public static void main(String args[])
    {
        B a = new B();
        
    }
}