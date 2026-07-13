package Collectionseg;

import java.util.ArrayList;
import java.util.Scanner;

public class EGString 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> l = new ArrayList<>();
        for(int i=1;i<=10;i++)
        {
        System.out.print("Enter Student Name:"+i);
        String name = sc.nextLine();

        l.add(name);
        }

        System.out.println("Student Name: " + l);
        System.out.println("Student First Name: " +(l.get(1)));
        System.out.println("Student Last Name: " + (l.get(9)));

       
        sc.close();
    }
}