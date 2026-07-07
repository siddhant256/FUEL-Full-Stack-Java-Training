package Abstractioneg;

abstract class Vehicle
{
    abstract void getVwheels();
    abstract void getColor();
}

class Bus extends Vehicle
{
    @Override
    void getVwheels()
    {
        System.out.println("Bus Wheels = 4");
    }

    @Override
    void getColor()
    {
        System.out.println("Bus Color = Red");
    }
}

class Auto extends Vehicle
{
    @Override
    void getVwheels()
    {
        System.out.println("Auto Wheels = 3");
    }

    @Override
    void getColor()
    {
        System.out.println("Auto Color = Black");
    }
}

class Bike extends Vehicle
{
    @Override
    void getVwheels()
    {
        System.out.println("Bike Wheels = 2");
    }

    @Override
    void getColor()
    {
        System.out.println("Bike Color = Black");
    }
}

public class Neweg
{
    public static void main(String[] args)
    {
        Vehicle b = new Bike();
        Vehicle a = new Auto();
        Vehicle ba = new Bus();

        b.getVwheels();
        b.getColor();

        a.getVwheels();
        a.getColor();

        ba.getVwheels();
        ba.getColor();
    }
}