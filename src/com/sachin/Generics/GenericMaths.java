package com.sachin.Generics;

public class GenericMaths
{
    public static <T extends Number> double add(T num1, T num2)
    {
        return num1.doubleValue() + num2.doubleValue();
    }

    public static <T extends Number> double subtract(T num1, T num2)
    {
        return num1.doubleValue() - num2.doubleValue();
    }

    public static <T extends Number> double multiply(T num1, T num2)
    {
        return num1.doubleValue() * num2.doubleValue();
    }

    public static void main(String[] args)
    {
        System.out.println("Integer addition: " + add(5, 10));
        System.out.println("Integer subtraction: " + subtract(10, 5));
        System.out.println("Integer multiplication: " + multiply(5, 10));

        System.out.println("Float addition: " + add(5.5f, 10.5f));
        System.out.println("Float subtraction: " + subtract(10.5f, 5.5f));
        System.out.println("Float multiplication: " + multiply(5.5f, 10.5f));

        System.out.println("Double addition: " + add(5.5, 10.5));
        System.out.println("Double subtraction: " + subtract(10.5, 5.5));
        System.out.println("Double multiplication: " + multiply(5.5, 10.5));
    }
}
