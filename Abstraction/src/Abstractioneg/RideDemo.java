package Abstractioneg;
import java.util.Scanner;

abstract class Ride
{
    int distance;
    int baseFare;

    Ride(int distance, int baseFare)
    {
        this.distance = distance;
        this.baseFare = baseFare;
    }

    abstract void calculateFare();
    void displayRideDetails()
    {
        System.out.println("Distance : " + distance + " km");
        System.out.println("Base Fare : " + baseFare);
    }
}


class MiniRide extends Ride
{
    MiniRide(int distance, int baseFare)
    {
        super(distance, baseFare);
    }

    public void calculateFare()
    {
        int totalFare = baseFare + (distance * 10);
        System.out.println("Mini Ride Fare : " + totalFare);
    }
}
class SedanRide extends Ride
{
    SedanRide(int distance, int baseFare)
    {
        super(distance, baseFare);
    }

    public void calculateFare()
    {
        int totalFare = baseFare + (distance * 15);
        System.out.println("Sedan Ride Fare : " + totalFare);
    }
}
class LuxuryRide extends Ride
{
    LuxuryRide(int distance, int baseFare)
    {
        super(distance, baseFare);
    }

    public void calculateFare()
    {
        int totalFare = baseFare + (distance * 25);
        System.out.println("Luxury Ride Fare : " + totalFare);
    }
}

public class RideDemo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Distance (km): ");
        int distance = sc.nextInt();

        System.out.print("Enter Base Fare: ");
        int baseFare = sc.nextInt();

        System.out.println("1. Mini Ride");
        System.out.println("2. Sedan Ride");
        System.out.println("3. Luxury Ride");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        Ride r;

        if(choice == 1)
        {
            r = new MiniRide(distance, baseFare);
        }
        else if(choice == 2)
        {
            r = new SedanRide(distance, baseFare);
        }
        else
        {
            r = new LuxuryRide(distance, baseFare);
        }

        r.displayRideDetails();
        r.calculateFare();
        sc.close();
    }
}