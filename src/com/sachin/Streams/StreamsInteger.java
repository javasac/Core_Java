package com.sachin.Streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamsInteger
{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum = numbers.stream().filter(n -> n % 3 == 0).mapToInt(Integer::intValue).sum();
        System.out.println("Sum is " + sum);

        // print first 4 numbers
        IntStream.range(1, 5).forEach(System.out::println);

        // print sum of all numbers from 1 to 10
        System.out.println("Sum all numbers from 1 to 10 = " + IntStream.range(1, 10).sum());

        // least number in Array is
        int[] arr = new int[] {5232, 67, 876, 4, -5};
        System.out.println("Least Number is " + Arrays.stream(arr).min().getAsInt());

        // skip first n number in list
        IntStream.range(1, 10).skip(3).forEach(System.out::println);
    }
}
