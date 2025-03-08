package com.sachin.Lists;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class GeneralList
{
    List l = new ArrayList<>(5);

    public GeneralList()
    {
        l.add("Sachin");
        l.add(Boolean.TRUE);
        l.add(1, "Kapil");
    }

    void printList()
    {
        for (Object obj : l)
        {
            System.out.println(obj.toString());
        }

        System.out.println("===========Size is " + l.size() + "=========");
        l.forEach(System.out::println);
    }

    void printIterator()
    {
        System.out.println("=========printIterator===========");

        Iterator it = l.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println("List contains Nitin = " + l.contains("Nitin"));
    }

    void asList()
    {
        System.out.println();
        List<String> l = Arrays.asList("Sachin", "Kapil", "Rahul");
        System.out.println(l);
    }

    public static void main(String[] args)
    {
        GeneralList gl = new GeneralList();
        gl.printList();
        gl.printIterator();
        gl.asList();
    }
}
