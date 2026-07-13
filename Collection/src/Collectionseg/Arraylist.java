package Collectionseg;

import java.util.ArrayList;

public class Arraylist
{
    public static void main(String args[])
    {
        ArrayList<Integer> l1 = new ArrayList<Integer>();

        // add()
        l1.add(1);
        l1.add(25);
        l1.add(1);
        l1.add(2, 6);

        System.out.println("List 1: " + l1);

        // Second ArrayList
        ArrayList<Integer> l2 = new ArrayList<Integer>();

        l2.add(10);
        l2.add(20);

        // addAll()
        l1.addAll(l2);
        System.out.println("After addAll: " + l1);

        // contains()
        System.out.println("Contains 25: " + l1.contains(25));

        // remove()
        l1.remove(2);
        System.out.println("After remove: " + l1);

        // removeAll()
        l1.removeAll(l2);
        System.out.println("After removeAll: " + l1);
    }
}