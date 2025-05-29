package com.sachin.Lambda;

public class CalculatorImpl
{
    public static void main(String[] args)
    {
        Calculator calc = (a) -> {
            System.out.println("Sum = " + a);
        };

        calc.sum(235);
    }
}
