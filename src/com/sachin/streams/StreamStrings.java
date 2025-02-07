package com.sachin.streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamStrings
{
    public static void main(String[] args)
    {
        // filter names starting with A
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Ankita");
        List<String> nm = names.stream().filter(n -> n.startsWith("A")).collect(Collectors.toList());
        System.out.println(nm);

        // convert names to uppercase
        List<String> upp = Arrays.asList("alice", "bob", "charlie", "david", "ankit");
        List<String> ups = upp.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(ups);

        // join strings
        System.out.println(names.stream().collect(Collectors.joining(", ")));

        // Checking if Any String Matches a Condition
        boolean hasA = names.stream().anyMatch(name -> name.startsWith("A"));
        System.out.println(hasA);

        // Counting Strings That Match a Condition like names with > 5 characters
        long count = names.stream().filter(name -> name.length() > 5).count();
        System.out.println("Names with length greater than 5 are " + count);
    }
}
