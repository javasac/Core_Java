package com.sachin.Maps;

public class HashMap
{
    java.util.HashMap hm = new java.util.HashMap<>();

    private HashMap()
    {
        hm.put(1, "Sachin");
        hm.put(2, "Kapil");
        hm.put(3, "Elon");
    }

    void printForEach()
    {
        hm.forEach((key, value) -> System.out.print(key + " = " + value));
    }

    void printKeySet()
    {
        System.out.println();
        for (Object key : hm.keySet())
        {
            System.out.print(key.toString() + " = " + hm.get(key));
        }
    }

    public static void main(String[] args)
    {
        HashMap hm = new HashMap();
        hm.printForEach();
        hm.printKeySet();
    }
}
