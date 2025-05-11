package com.sachin.Comparator;
import java.util.ArrayList;
import java.util.List;

class NumberOrder
{
    List<Integer> ls = new ArrayList<>();

    NumberOrder()
    {
        ls.add(303);
        ls.add(50);
        ls.add(70);
        ls.add(190);
        ls.add(20);
    }

    void printOrder()
    {
        System.out.println(ls);
        ls.sort(new NumberCompare());
        System.out.println(ls);
    }

    public static void main(String[] args)
    {
        NumberOrder no = new NumberOrder();
        no.printOrder();
    }
}
