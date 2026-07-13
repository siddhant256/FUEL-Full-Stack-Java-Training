package Collectionseg;

import java.util.ArrayList;

public class EOArray
{
    public static void main(String args[])
    {
        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        l.add(20);
        l.add(90);
        l.add(71);
        l.add(69);

        for(int i = 0; i < l.size(); i++)
        {
            if(l.get(i) % 2 == 0)
            {
                even.add(l.get(i));
            }
            else
            {
                odd.add(l.get(i));
            }
        }

        System.out.println("Original ArrayList: " + l);
        System.out.println("Even ArrayList: " + even);
        System.out.println("Odd ArrayList: " + odd);
    }
}