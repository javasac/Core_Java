package com.sachin.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsCountNames
{
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList(
                "Steve Jobs", "Virat Kohli", "Satya Nadella", "Elon Musk", "Virat Kohli",
                "Satya Nadella", "Elon Musk", "Steve Jobs", "Virat Kohli", "Satya Nadella", "Kapil Dev"
        ));

        Map<String, Long> map = names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        map.forEach((KeyNames, valueCount) -> System.out.println("Occurence of " +
                KeyNames.toString() + " is " + valueCount.toString()));
    }
}
