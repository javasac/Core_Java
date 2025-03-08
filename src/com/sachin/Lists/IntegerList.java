package com.sachin.Lists;
import java.util.ArrayList;
import java.util.List;

public class IntegerList
{
    List<Integer> li = new ArrayList<>(5);

    public IntegerList()
    {
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);
    }

    void printAdd()
    {
        System.out.println(li);
        List<Integer> lis = List.of(10, 21, 32, 411, 522);
        li.remove(4);
        li.addAll(lis);
        System.out.println(li);
    }

    public static void main(String[] args)
    {
        IntegerList il = new IntegerList();
        il.printAdd();
    }
}
