package com.sachin.Loops;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StringArrays
{
    String str[] = {"Sachin", "Virat", "Rohit", "Kapil", "Sunil"};

    void printString()
    {
        Arrays.stream(str).forEach(System.out::println);

        for (String s : str)
        {
            System.out.print(s + ", ");
        }
    }

    void printIterator()
    {
        System.out.println();
        System.out.println("=======Using Iterator==========");

        List<String> lt = Arrays.asList(str);
        Iterator<String> it = lt.iterator();

        while (it.hasNext())
        {
            System.out.print(it.next() + ", ");
        }
    }

    public static void main(String[] args)
    {
        StringArrays sa = new StringArrays();
        sa.printString();
        sa.printIterator();
    }
}
