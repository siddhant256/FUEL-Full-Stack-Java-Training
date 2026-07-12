package eg;

import java.util.Scanner;

public class ATM
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.println("Enter Balance:");
            double bal = sc.nextDouble();

            System.out.println("Enter Withdraw Amount:");
            double withd = sc.nextDouble();

            if (withd < 0)
            {
                throw new Exception("Error! Withdrawal amount cannot be negative.");
            }

            if (withd > bal)
            {
                throw new Exception("Error! Insufficient Balance.");
            }

            bal = bal - withd;

            System.out.println("Withdrawal Successful.");
            System.out.println("Remaining Balance: " + bal);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("Program Ended Successfully.");
            sc.close();
        }
    }
}