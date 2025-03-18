package com.sachin.Streams;
import java.util.Arrays;
import java.util.List;

public class StreamAnyMatch
{
    List<String> fruits = Arrays.asList("Apple", "Banana", "Papaya", "Avocado", "Plum");

    void anymatch()
    {
        boolean flag = fruits.stream().anyMatch(f -> f.startsWith("P"));
        System.out.println("Fruit starting with P are present " + flag);
        fruits.forEach(i -> System.out.println(i.toUpperCase()));
    }

    public static void main(String[] args)
    {
        StreamAnyMatch sm = new StreamAnyMatch();
        sm.anymatch();
    }
}
