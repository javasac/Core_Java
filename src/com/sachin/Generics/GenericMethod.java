package com.sachin.Generics;

public class GenericMethod
{
    private static<T> void printArray(T[] arr)
    {
        for (T ele : arr)
        {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Integer[] intArr = {1, 2, 3};
        Double[] douArr = {14d, 24d, 37d};
        Character[] charArr = {'S', 'A', 'C'};
        String[] str = {"Sachin", "Nitin", "Nidhi"};

        printArray(intArr);
        printArray(charArr);
        printArray(douArr);
        printArray(str);
    }
}
