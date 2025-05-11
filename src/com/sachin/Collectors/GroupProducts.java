package com.sachin.Collectors;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupProducts
{
    public static void main(String[] args)
    {
        List<Product> lt = Arrays.asList(
                new Product("Jeans", "Clothing"),
                new Product("Camera", "Electronics"),
                new Product("Shirt", "Clothing"),
                new Product("Smart TV", "Electronics"),
                new Product("BMW i5", "Car")
        );

        //Stream<Product> str = lt.stream();
        //Map<String, List<Product>> map = str.collect(Collectors.groupingBy(Product::getCategory));

        Map<String, List<Product>> map = lt.stream().collect(Collectors.groupingBy(Product::getCategory));
        System.out.println(map);
    }
}
