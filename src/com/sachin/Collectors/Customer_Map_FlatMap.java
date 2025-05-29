package com.sachin.Collectors;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Customer_Map_FlatMap
{
    List<Customer> getCustomers()
    {
        return Stream.of(
                new Customer(100, "Sachin", "skansal@gmail.com", Arrays.asList("33224", "90876")),
                new Customer(101, "Johny", "Johny@gmail.com", Arrays.asList("12345", "67890")),
                new Customer(102, "Kapil Dev", "kapil-dev@gmail.com", Arrays.asList("18024", "18294")),
                new Customer(103, "Virat", "viratkohli@gmail.com", Arrays.asList("18024", "18294")),
                new Customer(104, "Rohit Sharma", "sharma@gmail.com", Arrays.asList("42443", "123232"))
            ).collect(Collectors.toList());
    }

    public static void main(String[] args)
    {
        Customer_Map_FlatMap cmf = new Customer_Map_FlatMap();
        List<Customer> cust = cmf.getCustomers();
        List<String> emails = cust.stream().map(c -> c.getEmail()).collect(Collectors.toList());

        System.out.println(emails);

        System.out.println(cust.stream().map(c -> c.getPhones()).collect(Collectors.toList()));

        System.out.println(cust.stream().flatMap(c -> c.getPhones().stream()).collect(Collectors.toList()));
    }
}
