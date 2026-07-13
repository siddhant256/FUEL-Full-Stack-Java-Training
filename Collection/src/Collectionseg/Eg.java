package Collectionseg;

import java.util.ArrayList;

public class Eg
{
    public static void main(String args[])
    {
        // Array
        int arr[] = {10, 20, 30};

        System.out.println("Array Elements:");

        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }

        // Collection - ArrayList
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Collection Elements:");
        System.out.println(list);
    }
}