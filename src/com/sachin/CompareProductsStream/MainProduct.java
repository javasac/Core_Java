package com.sachin.CompareProductsStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainProduct
{
    List<Product> products;

    MainProduct()
    {
        products = Arrays.asList(new Product("1", "Phone", 1000, 10),
                                new Product("2", "Car", 77000, 1),
                                new Product("3", "Shirt", 46, 10),
                                new Product("4", "Shirt", 54, 10),
                                new Product("5", "Core Java", 55, 100),
                                new Product("6", "Car", 52000, 3)
                                );
    }

    void productByName(String prod)
    {
        System.out.println("==========Find All Products for " + prod + "=============");
        List<Product> nameProd = products.stream().filter(p -> p.getName().equals(prod)).collect(Collectors.toList());
        this.printProducts(nameProd);
    }

    void ValueAllProducts()
    {
        System.out.println("===========Value of All Products===========");
        double price100 = products.stream().mapToDouble(p -> p.getPrice() * p.getQty()).sum();
        System.out.println("Value of all Products is " + price100);
    }

    void priceGreater100()
    {
        System.out.println("===========All Products with Price > 100===========");
        List<Product> price100 = products.stream().filter(p -> p.getPrice() > 100).toList();
        this.printProducts(price100);
    }

    void printProducts(List<Product> list)
    {
        list.forEach(p -> System.out.println(p.getId() + " = " + p.getName() + " = " + p.getPrice() + " * " + p.getQty()));
    }

    public static void main(String[] args)
    {
        MainProduct mp = new MainProduct();
        mp.printProducts(mp.products);
        mp.priceGreater100();
        mp.ValueAllProducts();
        mp.productByName("Car");
    }
}
