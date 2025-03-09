package com.sachin.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerList
{
    List<Integer> li = new ArrayList<>(5);

    public IntegerList()
    {
        li.add(174);
        li.add(26);
        li.add(23);
        li.add(46);
        li.add(512);
    }

    void printAdd()
    {
        System.out.println(li);

        List<Integer> lis = List.of(1, 261, 32, 411, 522);
        li.remove(4);

        // add local Integer List to
        li.addAll(lis);
        System.out.println(li);

        Collections.sort(li);
        System.out.println(li);
    }

    public static void main(String[] args)
    {
        IntegerList il = new IntegerList();
        il.printAdd();
    }
}
