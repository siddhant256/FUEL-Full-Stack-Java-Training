package Collectionseg;

import java.util.ArrayList;
import java.util.Scanner;

public class MinMax 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> l = new ArrayList<>();

        for(int i = 1; i <= 10; i++)
        {
            System.out.print("Enter Number " + i + ": ");
            int n = sc.nextInt();
            l.add(n);
        }

        int min = l.get(0);
        int max = l.get(0);

        for(int i = 1; i < l.size(); i++)
        {
            if(l.get(i) < min)
            {
                min = l.get(i);
            }

            if(l.get(i) > max)
            {
                max = l.get(i);
            }
        }

        System.out.println("ArrayList: " + l);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

        sc.close();
    }
}