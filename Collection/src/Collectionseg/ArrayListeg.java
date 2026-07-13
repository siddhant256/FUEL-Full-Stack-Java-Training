package Collectionseg;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListeg
{
    public static void main(String args[])
    {
        ArrayList<Integer> l1 = new ArrayList<>();

        // 1. add()
        l1.add(30);
        l1.add(10);
        l1.add(20);
        l1.add(10);
        System.out.println("add(): " + l1);

        // 2. add(index, value)
        l1.add(1, 50);
        System.out.println("add(index,value): " + l1);

        // 3. get()
        System.out.println("get(2): " + l1.get(2));

        // 4. set()
        l1.set(1, 100);
        System.out.println("set(): " + l1);

        // 5. contains()
        System.out.println("contains(20): " + l1.contains(20));

        // 6. indexOf()
        System.out.println("indexOf(10): " + l1.indexOf(10));

        // 7. lastIndexOf()
        System.out.println("lastIndexOf(10): " + l1.lastIndexOf(10));

        // 8. size()
        System.out.println("size(): " + l1.size());

        // 9. isEmpty()
        System.out.println("isEmpty(): " + l1.isEmpty());

        // Second ArrayList
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(60);
        l2.add(70);

        // 10. addAll()
        l1.addAll(l2);
        System.out.println("addAll(): " + l1);

        // 11. containsAll()
        System.out.println("containsAll(): " + l1.containsAll(l2));

        // 12. remove(index)
        l1.remove(0);
        System.out.println("remove(index): " + l1);

        // 13. remove(value)
        l1.remove(Integer.valueOf(20));
        System.out.println("remove(value): " + l1);

        // 14. removeAll()
        l1.removeAll(l2);
        System.out.println("removeAll(): " + l1);

        // 15. sort()
        Collections.sort(l1);
        System.out.println("sort(): " + l1);

        // 16. forEach()
        System.out.println("forEach():");
        l1.forEach(x -> System.out.println(x));

        // 17. toArray()
        Object[] arr = l1.toArray();
        System.out.println("toArray(): " + arr[0]);

        // 18. clear()
        l1.clear();
        System.out.println("clear(): " + l1);

        // Check after clear
        System.out.println("isEmpty(): " + l1.isEmpty());
    }
}