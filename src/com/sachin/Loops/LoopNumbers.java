package com.sachin.Loops;
import java.util.Arrays;
import java.util.stream.IntStream;

public class LoopNumbers
{
    public static void main(String[] args)
    {
        int[] num = {12, 23, 34, 5, 12};

        IntStream.of(num).forEach(n -> System.out.print(n + " + "));
        System.out.println();

        Arrays.stream(num).forEach(i -> System.out.print(i + " - "));
        System.out.println();

        Arrays.stream(num).forEach(System.out::println);

        for (int i : num)
        {
            System.out.print(i + " | ");
        }

        System.out.println();
        System.out.println("Array sum is " + Arrays.stream(num).sum());
    }
}
