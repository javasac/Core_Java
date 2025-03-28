package com.sachin.Collectors;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsCountNumbers
{
    public static void main(String[] args)
    {
        List<Integer> lt = Arrays.asList(3, 71, 10, 34, 300, 7, 10, 3, 3, 34, 100);

        Map<Integer, Long> m = lt.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        m.forEach((key, val) -> System.out.println("Occurence of " + key + " in list is " + val));
    }
}
