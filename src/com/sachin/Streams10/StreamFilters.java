package com.sachin.Streams10;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamFilters
{
    public static void main(String[] args)
    {
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Optional<Integer> min = num.stream().min(Integer::compare);
        System.out.println("Min is " + min.get());

        List<Integer> even = num.stream().filter(n -> n % 2==0).collect(Collectors.toList());
        System.out.println("======Even Numbers=====");
        even.parallelStream().forEach(System.out::println);

        num = Arrays.asList(1, 4, 40, 45, 70, 45, 1, 70);
        System.out.println("=====Unique Numbers=====");
        num.stream().distinct().forEach(a -> System.out.println(a));
    }
}
