package com.sachin.Streams;
import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeArrays
{
    int[] a = {4, 2, 7, 1};
    int[] b = {8, 3, 9, 5};

    void sortConcat()
    {
        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
        this.printArray(c);
    }

    void printArray(int pri[])
    {
        for (int i : pri)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        MergeArrays ma = new MergeArrays();
        ma.printArray(ma.a);
        ma.printArray(ma.b);
        ma.sortConcat();
    }
}
