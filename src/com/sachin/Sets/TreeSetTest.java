package com.sachin.Sets;
import java.util.*;

public class TreeSetTest
{
    Set<Integer> set = new TreeSet<>();

    public TreeSetTest()
    {
        set.add(12);
        set.add(265);
        set.add(25);
        set.add(90);
        set.add(2);
        System.out.println(set);
    }

    void printForEach()
    {
        set.forEach(System.out::println);
    }

    void printIterator()
    {
        Iterator<Integer> it = set.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args)
    {
        TreeSetTest ts = new TreeSetTest();
        ts.printForEach();
        ts.printIterator();
    }
}
