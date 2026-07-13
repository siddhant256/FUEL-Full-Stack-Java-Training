package Collectionseg;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfNum 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        ArrayList<Integer> l = new ArrayList<>();

        for(int i = 1; i <= 10; i++)
        {
            System.out.print("Enter Number " + i + ": ");
            int n = sc.nextInt();

            l.add(n);          // number ArrayList मध्ये store
            total = total + n;
        }

        System.out.println("Numbers: " + l);
        System.out.println("Sum: " + total);

        sc.close();
    }
}