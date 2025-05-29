package com.sachin.Streams10;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringStreams
{
    public static void main(String[] args)
    {
        List<String> vehicles = Arrays.asList("Bus", "Cycle", "Car", "Car", "Car", "Bus");

        List<String> dis = vehicles.stream().distinct().collect(Collectors.toList());
        System.out.println(dis);
        //dis.stream().forEach(System.out::println);
        vehicles.stream().distinct().forEach(s -> System.out.println(s));
        System.out.println("Distinct # of Vehicles = " + vehicles.stream().distinct().count());

        vehicles.stream().limit(2).distinct().forEach(System.out::println);
    }
}
