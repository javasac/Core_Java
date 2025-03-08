package com.sachin.Generics;

class GenericsJava<T, U>
{
    private T t1;
    private U u1;

    GenericsJava(T t1, U u1)
    {
        this.t1 = t1;
        this.u1 = u1;
        System.out.println("Value 1 = " + this.t1);
        System.out.println("Value 2 = " + this.u1);
    }

    public static void main(String[] args)
    {
        GenericsJava<Integer, String> num = new GenericsJava<Integer, String>(10, "Hello World");
        GenericsJava<Integer, Integer> num1 = new GenericsJava<Integer, Integer>(10, 455);
        GenericsJava<Double, Double> num3 = new GenericsJava<Double, Double>(1878660d, 4576765d);
    }
}
