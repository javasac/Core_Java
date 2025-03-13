package com.sachin.Arrays;
import java.util.ArrayList;
import java.util.List;

class ArrayListConvert
{
    List<Integer> l = new ArrayList<>();

    ArrayListConvert()
    {
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
    }

    void convert()
    {
        int arr[] = l.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args)
    {
        ArrayListConvert ac = new ArrayListConvert();
    }
}
