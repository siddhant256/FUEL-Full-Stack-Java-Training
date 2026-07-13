package Collectionseg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DulpicateEleSetArray
{
    public static void main(String args[])
    {
        ArrayList<Integer> l = new ArrayList<>();

        l.add(20);
        l.add(90);
        l.add(20);
        l.add(70);
        l.add(90);

        // Duplicate find
        for(int i = 0; i < l.size(); i++)
        {
            for(int j = i + 1; j < l.size(); j++)
            {
                if(l.get(i).equals(l.get(j)))
                {
                    System.out.println("Duplicate: " + l.get(i));
                }
            }
        }

        // ArrayList to Set conversion
        Set<Integer> s = new HashSet<>(l);

        System.out.println("ArrayList: " + l);
        System.out.println("Set: " + s);
    }
}