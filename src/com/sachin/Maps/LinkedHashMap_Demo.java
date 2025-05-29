package com.sachin.Maps;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap_Demo
{
    LinkedHashMap<String, Integer> map = new LinkedHashMap<>(11, .5f, true);

    public LinkedHashMap_Demo()
    {
        map.put("Apple", 6);
        map.put("Guava", 9);
        map.put("Orange", 1);
        map.get("Guava");
    }

    void printEntrySet()
    {
        for (Map.Entry<String, Integer> entry : map.entrySet())
        {
            System.out.println("Key = " + entry.getKey() + " & Value = " + entry.getValue());
        }
    }

    void printLinked()
    {
        map.forEach((k, v) -> System.out.println("Key = " + k + " & Value = " + v));
    }

    void printKeySet()
    {
        for (Object obj : map.keySet())
        {
            System.out.println(obj.toString());
        }
    }

    public static void main(String[] args)
    {
        LinkedHashMap_Demo dm = new LinkedHashMap_Demo();
        dm.printLinked();
        //dm.printEntrySet();
        //dm.printKeySet();
    }
}
