package com.sachin.Loops;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.IntStream;

public class NumberArrays
{
    int arr[] = {10, 20, 25, 30, 35, 40};

    void PrintArr()
    {
        Arrays.stream(arr).forEach(System.out::println);

        for (int i : arr)
            System.out.print(i + ", ");
    }

    void printIterate()
    {
        System.out.println();
        System.out.println("============Iterator===============");

        IntStream st = Arrays.stream(arr);
        Iterator it = st.iterator();

        while (it.hasNext())
        {
            System.out.print(it.next() + ", ");
        }
    }

    public static void main(String[] args)
    {
        NumberArrays nm = new NumberArrays();
        nm.PrintArr();
        nm.printIterate();
    }
}
