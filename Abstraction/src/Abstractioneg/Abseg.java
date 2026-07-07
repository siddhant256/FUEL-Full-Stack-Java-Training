package Abstractioneg;

abstract class A
{
    public abstract void getvehicleswheelsint();
}

class Z extends A
{
    public void getvehicleswheelsint()
    {
        int bus = 4;
        int bike=2;
        int auto=3;
        System.out.println("Bus Wheels = " + bus);
        System.out.println("Bike Wheels = " + bike);
        System.out.println("Auto Wheels = " + auto);

    }
}

public class Abseg
{
    public static void main(String args[])
    {
        Z z = new Z();
        z.getvehicleswheelsint();
    }
}